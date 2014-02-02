package Unit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.api.Jenkins.Build;
import com.api.Jenkins.builder.JenkinsBuildBuilder;

public class BuildParserTest
{

	 @Test
	 public void test()
	 {
		  Build testBuild = new JenkinsBuildBuilder().build("http://173.230.135.149:8080/job/Badges/16/");
		  
		  assertNotNull(testBuild);
		  assertTrue(testBuild.getFullDisplayName().equals("Badges #16"));
		  assertTrue(testBuild.getResult().equals("SUCCESS"));
		  assertTrue(testBuild.getNumber() == 16);
		  assertTrue(testBuild.getUrl().equals("http://173.230.135.149:8080/job/Badges/16/"));
	 }
	 
	 @Test
	 public void testNull()
	 {
		  Build testBuild = new JenkinsBuildBuilder().build("");
		  
		  assertNull(testBuild);
		  
	 }

}
