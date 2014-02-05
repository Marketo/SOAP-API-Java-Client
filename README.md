Getting Started
========================

The fastest way to implement a SOAP client is to start with the sample code that we have made available here and
modify it for your purposes.  These client stubs have to be in the build path of your Java projects.

If using the pre-built jar file [marketo-soap-sdk-2.3.jar](marketo-soap-sdk-2.3.jar), you can add it to your build
path by placing it inside your Java project in eclipse (or the IDE of your choice).  In Eclipse, you would right
click on the library, click the "Build Path -> Configure Build Path ..." option from the menu.  In the modal dialog
that will popup, you can add the library to the path by clicking on the "Add JARs..." button and selecting the JAR
file from your project.

The sample code below uses the Apache [commons-codec-1.8.jar](http://commons.apache.org/proper/commons-codec/download_codec.cgi).
Repeat the above steps to include commons-codec-1.8.jar to your project before running the sample code.

Generate Your Own Java Client From WSDL
------------------------
The above code was generated using [wsimport](http://docs.oracle.com/javase/6/docs/technotes/tools/share/wsimport.html) using the [Marketo Web Service 2_3 WSDL](http://app.marketo.net/soap/mktows/2_3?WSDL).
Here is the [binding.xml](binding.xml) file used in the below wsimport command.

```
$ mkdir src
$ mkdir bin
$ wsimport -XadditionalHeaders -b binding.xml -p com.marketo.mktows -s src -d bin http://app.marketo.net/soap/mktows/2_3?WSDL
```

Usage
------------------------

```java
import com.marketo.mktows.*;
import java.net.URL;
import javax.xml.namespace.QName;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class GetLead {

	public static void main(String[] args) {
		System.out.println("Executing Get Lead");
		try {
			URL marketoSoapEndPoint = new URL("CHANGE ME" + "?WSDL");
			String marketoUserId = "CHANGE ME";
			String marketoSecretKey = "CHANGE ME";
			
			QName serviceName = new QName("http://www.marketo.com/mktows/", "MktMktowsApiService");
			MktMktowsApiService service = new MktMktowsApiService(marketoSoapEndPoint, serviceName);
			MktowsPort port = service.getMktowsApiSoapPort();
			
			// Create Signature
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			String text = df.format(new Date());
			String requestTimestamp = text.substring(0, 22) + ":" + text.substring(22);			
			String encryptString = requestTimestamp + marketoUserId ;
			
			SecretKeySpec secretKey = new SecretKeySpec(marketoSecretKey.getBytes(), "HmacSHA1");
			Mac mac = Mac.getInstance("HmacSHA1");
			mac.init(secretKey);
			byte[] rawHmac = mac.doFinal(encryptString.getBytes());
			char[] hexChars = Hex.encodeHex(rawHmac);
			String signature = new String(hexChars); 
			
			// Set Authentication Header
			AuthenticationHeader header = new AuthenticationHeader();
			header.setMktowsUserId(marketoUserId);
			header.setRequestTimestamp(requestTimestamp);
			header.setRequestSignature(signature);
			
			// Create Request
			ParamsGetLead request = new ParamsGetLead();
			LeadKey key = new LeadKey();
			key.setKeyType(LeadKeyRef.EMAIL);
			key.setKeyValue("t@t.com");
			request.setLeadKey(key);

			SuccessGetLead result = port.getLead(request, header);

			JAXBContext context = JAXBContext.newInstance(SuccessGetLead.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(result, System.out);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

```

Compatibility
------------------------

This code was generated from the Marketo SOAP WSDL version 2_3.
