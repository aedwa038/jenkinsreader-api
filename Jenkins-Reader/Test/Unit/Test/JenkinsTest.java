package Unit.Test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import com.api.Jenkins.Jenkins;
import com.api.Jenkins.Job;
import com.api.Jenkins.builder.JenkinsBuilder;

public class JenkinsTest
{

	 @Test
	 public void test()
	 {
		  Jenkins test = new JenkinsBuilder()
			        .build("http://ci.dakanilabs.com/");

		  assertNotNull("Testing jenkins object for null",test);
		  Vector<Job> jobs = test.getJobs();
		  assertTrue(jobs.size() == 15);
		  
		  for (Job job : jobs)
          {
		       System.out.print(job.getName() + " - ");
		       System.out.print(job.getColor() + " - ");
		       System.out.print(job.getNumberOfBuilds()+ " - ");
		       System.out.println(job.getUrl());
          }
		  

	 }

}
