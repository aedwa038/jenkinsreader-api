package com.api.Jenkins.builder;

import java.net.MalformedURLException;
import java.net.URL;

import org.dom4j.Document;

import com.api.Jenkins.reader.JenkinsURLReader;
import com.api.Jenkins.util.JenkinsLogging;



/**
 * The Class AbstractBuilder.
 */
public abstract class AbstractBuilder
{

	 /** The dom. */
	 Document dom = null;

	 /**
	  * Parses the.
	  * 
	  * @param url
	  *             the url
	  * @return the object
	  */
	 public abstract Object build(String url);

	 /** The Constant TAG. */
	 private final static String TAG = "AbstractBuilder";

	 /** The Constant logger. */
	 final static JenkinsLogging logger = new JenkinsLogging(TAG);

	 /**
	  * Inits the.
	  * 
	  * @param url
	  *             the url
	  */
	 protected void init(String url)
	 {
		  logger.info("init");
		  URL buildUrl = this.getURL(url);
		  if (buildUrl == null)
		  {

			   dom = null;
		  }
		  dom = JenkinsURLReader.Read(buildUrl);
	 }

	 /**
	  * Gets the url.
	  * 
	  * @param url
	  *             the url
	  * @return the url
	  */
	 public URL getURL(String url)
	 {
		  URL buildUrl = null;
		  if (url.equals(""))
		  {
			   return null;
		  } else
		  {
			   try
			   {
					buildUrl = new URL(url + "api/xml");
			   } catch (MalformedURLException e)
			   {
					logger.logException(e);
			   }
		  }

		  return buildUrl;
	 }

}
