package com.api.Jenkins.builder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import org.dom4j.Element;

import com.api.Jenkins.Build;
import com.api.Jenkins.Job;
import com.api.Jenkins.util.JenkinsLogging;

/**
 * The Class JobBuilder.
 */
public class JobBuilder extends AbstractBuilder
{

	 /** The maxbuilds. */
	 public int MAXBUILDS = 5;

	 /** The build parser. */
	 JenkinsBuildBuilder buildParser;

	 /** The Constant TAG. */
	 private final static String TAG = "JobBuilder";

	 /** The Constant logger. */
	 final static JenkinsLogging logger = new JenkinsLogging(TAG);

	 /** The dom. */

	 /*
	  * (non-Javadoc)
	  * 
	  * @see com.api.Jenkins.builder.AbstractBuilder#build(java.lang.String)
	  */
	 @Override
	 public Job build(String url)
	 {
		  logger.info("build");
		  super.init(url);
		  buildParser = new JenkinsBuildBuilder();

		  Element root = dom.getRootElement();
		  Job job = new Job();
		  job.setUrl(url);
		  job.setDisplayName(root.elementText("displayName"));
		  job.setColor(root.elementText("color"));
		  job.setName(root.elementText("name"));
		  job.setBuilds(this.getJobBuilds("build"));

		  Element lastSuccessfulBuild = root.element("lastSuccessfulBuild");
		  if (lastSuccessfulBuild != null)
		  {
			   job.setLastSuccessfulBuild(buildParser.build(lastSuccessfulBuild
				         .elementText("url")));
		  }

		  Element lastStableBuild = root.element("lastStableBuild");
		  if (lastStableBuild != null)
		  {
			   job.setLastStableBuild(buildParser.build(lastStableBuild
				         .elementText("url")));
		  }
		  job.setUpstreamProjects(this
			        .getUpstreamprojectUrls("upstreamProject"));

		  logger.info("Finished Parsing Job");
		  return job;
	 }

	 /**
	  * Gets the job builds.
	  * 
	  * @param buildName
	  *             the build name
	  * @return the job builds
	  */
	 private Vector<Build> getJobBuilds(String buildName)
	 {
		  int max = 0;
		  Element root = dom.getRootElement();
		  Vector<Build> builds = new Vector<Build>();
		  for (Element build : (List<Element>) root.elements(buildName))
		  {
			   if (max < MAXBUILDS)
			   {
					builds.add(buildParser.build(build.elementText("url")));
					max++;
			   } else
			   {
					break;
			   }
		  }
		  return builds;

	 }

	 /**
	  * Gets the upstreamproject urls.
	  * 
	  * @param elementName
	  *             the element name
	  * @return the upstreamproject urls
	  */
	 private Vector<URL> getUpstreamprojectUrls(String elementName)
	 {
		  Element root = dom.getRootElement();
		  Vector<URL> urlList = new Vector<URL>();
		  for (Element build : (List<Element>) root.elements("upstreamProject"))
		  {
			   URL upstreamProject = null;
			   try
			   {
					upstreamProject = new URL(build.elementText("url"));
			   } catch (MalformedURLException e)
			   {

			   }
			   urlList.add(upstreamProject);
		  }
		  return urlList;

	 }

}
