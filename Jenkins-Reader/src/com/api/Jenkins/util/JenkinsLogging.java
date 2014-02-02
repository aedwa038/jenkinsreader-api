package com.api.Jenkins.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The Class JenkinsLogging.
 */
public class JenkinsLogging
{
	 
 	/** The logger. */
 	final Logger logger = LoggerFactory.getLogger(JenkinsLogging.class);

	 /** The tag. */
 	private String TAG;

	 /**
 	 * Instantiates a new jenkins logging.
 	 *
 	 * @param tag the tag
 	 */
 	public JenkinsLogging(String tag)
	 {
		  TAG = tag;
	 }

	 /**
 	 * Info.
 	 *
 	 * @param line the line
 	 */
 	public void info(String line)
	 {
		  logger.info(TAG + " - " + line);
	 }

	 /**
 	 * Warn.
 	 *
 	 * @param line the line
 	 */
 	public void warn(String line)
	 {
		  logger.warn(TAG + " - " + line);
	 }

	 /**
 	 * Debug.
 	 *
 	 * @param line the line
 	 */
 	public void debug(String line)
	 {
		  logger.debug(TAG + " - " + line);
	 }
	 
	 /**
 	 * Log exception.
 	 *
 	 * @param e the e
 	 */
 	public void logException (Exception e)
	 {
		  logger.error(TAG + " - " + e.getMessage()); 
	 }

}
