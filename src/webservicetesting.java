import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class webservicetesting {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

		test("","","");
		
	   }
		public static void test(String restURL,String element,String expectedValue) throws SAXException, IOException, ParserConfigurationException {

			// Parse the URL
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(restURL);

			// Get the element from response using element tag name
			NodeList nodelist = doc.getElementsByTagName(element);

			// Verify the response content using Assert
			Assert.assertEquals(expectedValue,nodelist.item(0).getTextContent()); 
			}

	//}

}
