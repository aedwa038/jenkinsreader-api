package com.api.Jenkins.builder;

import java.util.List;
import java.util.Vector;

import org.dom4j.Element;

import com.api.Jenkins.Jenkins;
import com.api.Jenkins.Job;
import com.api.Jenkins.util.JenkinsLogging;

/**
 * The Class JenkinsBuilder.
 */
/**
 * @author Akeem
 *
 */
public class JenkinsBuilder extends AbstractBuilder
{
	 /** The Constant TAG. */
	 private final static String TAG = "JenkinsBuilder";

	 /** The Constant logger. */
	 final static JenkinsLogging logger = new JenkinsLogging(TAG);

	 /** The job builder. */
 	private JobBuilder jobBuilder = new JobBuilder();

	 /* (non-Javadoc)
 	 * @see com.api.Jenkins.builder.AbstractBuilder#build(java.lang.String)
 	 */
 	@Override
	 public Jenkins build(String url)
	 {
		  logger.info("build");
		  super.init(url);
		  Element root = dom.getRootElement();

		  Jenkins jenkins = new Jenkins();
		  jenkins.setNodeName(root.elementText("nodeName"));
		  jenkins.setMode(root.elementText("mode"));
		  jenkins.setNodeDescription(root.elementText("nodeDescription"));
		  String quietingDown = root.elementText("quietingDown");
		  jenkins.setQuietingDown(Boolean.parseBoolean(quietingDown));

		  String security = root.elementText("useSecurity");
		  jenkins.setUseSecurity(Boolean.parseBoolean(security));
		  jenkins.setJobs(getJobBuilds("job"));
		  logger.info("Finished Building Jenkins Object");
		  return jenkins;

	 }

	 /**
 	 * Gets the job builds.
 	 *
 	 * @param buildName the build name
 	 * @return the job builds
 	 */
 	private Vector<Job> getJobBuilds(String buildName)
	 {

		  Element root = dom.getRootElement();
		  Vector<Job> jobs = new Vector<Job>();
		  for (Element build : (List<Element>) root.elements(buildName))
		  {

			   jobs.add(jobBuilder.build(build.elementText("url")));

		  }
		  return jobs;

	 }

}
