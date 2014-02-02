package Unit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import org.dom4j.Document;
import org.junit.Test;

import com.api.Jenkins.reader.JenkinsURLReader;

public class ReaderTest
{

	 @Test
	 public void testUrl1()
	 {
		  Document dom = null;
		  try
		  {
			   dom = JenkinsURLReader.Read(new URL(
				         "http://ci.dakanilabs.com/api/xml"));
		  } catch (MalformedURLException e)
		  {
			   e.printStackTrace();
		  }

		  assertNotNull(dom);
		  String element = dom.getRootElement().elementText("mode");

		  System.out.println(element);

	 }

	 @Test
	 public void testUrl2()
	 {
		  Document dom = null;
		  try
		  {
			   dom = JenkinsURLReader.Read(new URL(
				         "http://173.230.135.149:8080/job/Badges/api/xml"));
		  } catch (MalformedURLException e)
		  {
			   e.printStackTrace();
		  }

		  assertNotNull(dom);

	 }

	 @Test
	 public void testUrl3()
	 {
		  Document dom = null;
		  try
		  {
			   dom = JenkinsURLReader.Read(new URL(
				         "http://deadlock.netbeans.org/hudson/api/xml"));
		  } catch (MalformedURLException e)
		  {
			   e.printStackTrace();
		  }

		  assertNotNull(dom);

	 }

	 @Test
	 public void testUrl4()
	 {
		  Document dom = null;
		  try
		  {
			   dom = JenkinsURLReader.Read(new URL(
				         "http://deadlock.netbeans.org/hudson/api/xml"));
		  } catch (MalformedURLException e)
		  {
			   e.printStackTrace();
		  }

		  assertNotNull(dom);

	 }

}
