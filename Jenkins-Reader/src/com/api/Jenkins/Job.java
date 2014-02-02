package com.api.Jenkins;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import com.api.Jenkins.util.JenkinsLogging;

/**
 * The Class Job.
 */
public class Job
{

	 /**
	  * Instantiates a new job.
	  */
	 public Job()
	 {
		  logger.info("Job()");
		  builds = new Vector<Build>();
		  upstreamProjects = new Vector<URL>();
	 }

	 /**
	  * Instantiates a new job.
	  * 
	  * @param displayName
	  *             the display name
	  * @param name
	  *             the name
	  * @param url
	  *             the url
	  * @param color
	  *             the color
	  * @param builds
	  *             the builds
	  * @param lastSuccessfulBuild
	  *             the last successful build
	  * @param lastStableBuild
	  *             the last stable build
	  * @param healthReport
	  *             the health report
	  * @param upstreamProjectsURL
	  *             the upstream projects
	  */
	 public Job(String displayName, String name, String url, String color,
		       Vector<Build> builds, Build lastSuccessfulBuild,
		       Build lastStableBuild, HealthReport healthReport,
		       Vector<URL> upstreamProjectsURL)
	 {
		  super();
		  logger.info("Job()");
		  this.displayName = displayName;
		  this.name = name;
		  this.url = url;
		  this.color = color;
		  this.builds = builds;
		  this.lastSuccessfulBuild = lastSuccessfulBuild;
		  this.lastStableBuild = lastStableBuild;
		  this.healthReport = healthReport;
		  this.upstreamProjects = upstreamProjectsURL;
	 }

	 /**
	  * Gets the display name.
	  * 
	  * @return the display name
	  */
	 public String getDisplayName()
	 {
		  return displayName;
	 }

	 /**
	  * Sets the display name.
	  * 
	  * @param displayName
	  *             the new display name
	  */
	 public void setDisplayName(String displayName)
	 {
		  this.displayName = displayName;
	 }

	 /**
	  * Gets the name.
	  * 
	  * @return the name
	  */
	 public String getName()
	 {
		  return name;
	 }

	 /**
	  * Sets the name.
	  * 
	  * @param name
	  *             the new name
	  */
	 public void setName(String name)
	 {
		  this.name = name;
	 }

	 /**
	  * Gets the url.
	  * 
	  * @return the url
	  */
	 public URL getUrlObject()
	 {

		  URL jobURL = null;
		  try
		  {
			   jobURL = new URL(this.url);
		  } catch (MalformedURLException e)
		  {
			   e.printStackTrace();
		  }

		  return jobURL;
	 }

	 /**
	  * Gets the url.
	  * 
	  * @return the url
	  */
	 public String getUrl()
	 {
		  return url;
	 }

	 /**
	  * Sets the url.
	  * 
	  * @param url
	  *             the new url
	  */
	 public void setUrl(String url)
	 {
		  this.url = url;
	 }

	 /**
	  * Gets the color.
	  * 
	  * @return the color
	  */
	 public String getColor()
	 {
		  return color;
	 }

	 /**
	  * Sets the color.
	  * 
	  * @param color
	  *             the new color
	  */
	 public void setColor(String color)
	 {
		  this.color = color;
	 }

	 /**
	  * Gets the builds.
	  * 
	  * @return the builds
	  */
	 public Vector<Build> getBuilds()
	 {
		  return builds;
	 }

	 /**
	  * Adds the build.
	  * 
	  * @param build
	  *             the build
	  */
	 public void addBuild(Build build)
	 {
		  logger.info("Job - addBuild");
		  if (builds == null)
		  {
			   builds = new Vector<Build>();
		  }
		  builds.add(build);
	 }

	 /**
	  * Sets the builds.
	  * 
	  * @param builds
	  *             the new builds
	  */
	 public void setBuilds(Vector<Build> builds)
	 {
		  this.builds = builds;
	 }

	 /**
	  * Gets the last successful build.
	  * 
	  * @return the last successful build
	  */
	 public Build getLastSuccessfulBuild()
	 {
		  return lastSuccessfulBuild;
	 }

	 /**
	  * Sets the last successful build.
	  * 
	  * @param lastSuccessfulBuild
	  *             the new last successful build
	  */
	 public void setLastSuccessfulBuild(Build lastSuccessfulBuild)
	 {
		  this.lastSuccessfulBuild = lastSuccessfulBuild;
	 }

	 /**
	  * Gets the last stable build.
	  * 
	  * @return the last stable build
	  */
	 public Build getLastStableBuild()
	 {
		  return lastStableBuild;
	 }

	 /**
	  * Sets the last stable build.
	  * 
	  * @param lastStableBuild
	  *             the new last stable build
	  */
	 public void setLastStableBuild(Build lastStableBuild)
	 {
		  this.lastStableBuild = lastStableBuild;
	 }

	 /**
	  * Gets the health report.
	  * 
	  * @return the health report
	  */
	 public HealthReport getHealthReport()
	 {
		  return healthReport;
	 }

	 /**
	  * Sets the health report.
	  * 
	  * @param healthReport
	  *             the new health report
	  */
	 public void setHealthReport(HealthReport healthReport)
	 {
		  this.healthReport = healthReport;
	 }

	 /**
	  * Gets the upstream projects.
	  * 
	  * @return the upstream projects
	  */
	 public Vector<URL> getUpstreamProjects()
	 {
		  return upstreamProjects;
	 }

	 /**
	  * Sets the upstream projects.
	  * 
	  * @param upstreamProjects
	  *             the new upstream projects
	  */
	 public void setUpstreamProjects(Vector<URL> upstreamProjects)
	 {
		  this.upstreamProjects = upstreamProjects;
	 }

	 /**
	  * Adds the upstream project url.
	  * 
	  * @param url
	  *             the url
	  */
	 public void addUpstreamProjectUrl(URL url)
	 {
		  logger.info("Job - addUpstreamProjectUrl");
		  if (this.upstreamProjects == null)
		  {
			   this.upstreamProjects = new Vector<URL>();
		  }
		  if (url != null)
		  {
			   this.upstreamProjects.add(url);
		  }
	 }

	 public int getNumberOfBuilds()
	 {
		  if (builds == null)
		  {
			   return 0;
		  }
		  return builds.size();
	 }

	 /** The display name. */
	 private String displayName;

	 /** The name. */
	 private String name;

	 /** The url. */
	 private String url;

	 /** The color. */
	 private String color;

	 /** The builds. */
	 private Vector<Build> builds;

	 /** The last successful build. */
	 private Build lastSuccessfulBuild;

	 /** The last stable build. */
	 private Build lastStableBuild;

	 /** The health report. */
	 private HealthReport healthReport;

	 /** The upstream projects. */
	 private Vector<URL> upstreamProjects;

	 /** The Constant TAG. */
	 private final static String TAG = "Job";
	 /** The Constant logger. */
	 final static JenkinsLogging logger = new JenkinsLogging(TAG);
}
