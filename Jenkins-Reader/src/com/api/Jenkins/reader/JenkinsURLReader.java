package com.api.Jenkins.reader;

import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import com.api.Jenkins.util.JenkinsLogging;

/**
 * The Class JenkinsReader. */
public class JenkinsURLReader
{

	 /** The reader. */
	 static SAXReader reader = null;
	 private final static String TAG = "JenkinsURLReader";
	 final static JenkinsLogging logger = new JenkinsLogging(TAG);
	 /**
	  * Read.
	  * 
	  * @param url
	  *             the url
	  * @return the document
	  * @throws DocumentException
	  */
	 public static Document Read(URL url)
	 {
		  logger.info("Read");
		  Document dom = null;
		  if (url != null)
		  {
			   logger.info("Read(" + url.toString() + ")");

			   if (reader == null)
			   {
					reader = new SAXReader();
			   }

			   try
			   {
					dom = reader.read(url);
			   } catch (DocumentException e)
			   {
					dom = null;
					logger.logException(e);
			   }
		  }
		  return dom;
	 }
}
