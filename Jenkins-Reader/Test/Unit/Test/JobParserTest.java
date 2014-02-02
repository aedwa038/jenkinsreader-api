package Unit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.api.Jenkins.Job;
import com.api.Jenkins.builder.JobBuilder;

public class JobParserTest
{

	 @Test
	 public void test()
	 {
		  Job testJob = new JobBuilder()
			        .build("http://173.230.135.149:8080/job/Badges/");

		  assertNotNull(testJob);
		  assertNotNull(testJob.getLastStableBuild());
		  assertNotNull(testJob.getLastSuccessfulBuild());
	 }
	 
	 
	 @Test
	 public void testjob2()
	 {
		  Job testJob = new JobBuilder()
			        .build("http://deadlock.netbeans.org/hudson/job/html+java/");

		  assertNotNull(testJob);
		  assertNotNull(testJob.getLastStableBuild());
		  assertNotNull(testJob.getLastSuccessfulBuild());
	 }

}
