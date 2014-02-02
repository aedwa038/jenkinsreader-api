package com.api.Jenkins;

import com.api.Jenkins.util.JenkinsLogging;

/**
 * The Class Build.
 */
public class Build
{
	 
 	/**
 	 * Instantiates a new builds the.
 	 *
 	 * @param number the number
 	 * @param result the result
 	 * @param url the url
 	 * @param fullDisplayName the full display name
 	 */
 	public Build(int number, String result, String url, String fullDisplayName)
	 {
 		
		  super();
		  logger.info("Build");
		  this.number = number;
		  this.result = result;
		  this.url = url;
		  this.fullDisplayName = fullDisplayName;
	 }

	 /**
 	 * Gets the number.
 	 *
 	 * @return the number
 	 */
 	public int getNumber()
	 {
		  return number;
	 }

	 /**
 	 * Sets the number.
 	 *
 	 * @param number the new number
 	 */
 	public void setNumber(int number)
	 {
		  this.number = number;
	 }

	 /**
 	 * Gets the result.
 	 *
 	 * @return the result
 	 */
 	public String getResult()
	 {
		  return result;
	 }

	 /**
 	 * Sets the result.
 	 *
 	 * @param result the new result
 	 */
 	public void setResult(String result)
	 {
		  this.result = result;
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
 	 * @param url the new url
 	 */
 	public void setUrl(String url)
	 {
		  this.url = url;
	 }

	 /**
 	 * Gets the full display name.
 	 *
 	 * @return the full display name
 	 */
 	public String getFullDisplayName()
	 {
		  return fullDisplayName;
	 }

	 /**
 	 * Sets the full display name.
 	 *
 	 * @param fullDisplayName the new full display name
 	 */
 	public void setFullDisplayName(String fullDisplayName)
	 {
		  this.fullDisplayName = fullDisplayName;
	 }

	 /** The number. */
 	int number;
	 
 	/** The result. */
 	String result;
	 
 	/** The url. */
 	String url;
	 
 	/** The full display name. */
 	String fullDisplayName;
 	private final static String TAG = "Build";
 	 /** The Constant logger. */
 	 final static JenkinsLogging logger = new JenkinsLogging(TAG);
}
