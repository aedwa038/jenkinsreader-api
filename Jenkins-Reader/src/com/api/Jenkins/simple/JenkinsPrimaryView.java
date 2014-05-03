package com.api.Jenkins.simple;


/**
 * The Class JenkinsPrimaryView.
 */
public class JenkinsPrimaryView
{
	 
 	/**
 	 * Instantiates a new jenkins primary view.
 	 *
 	 * @param name the name
 	 * @param url the url
 	 */
 	public JenkinsPrimaryView(String name, String url)
	 {
		  super();
		  this.name = name;
		  this.url = url;
	 }

	 /**
 	 * Instantiates a new jenkins primary view.
 	 */
 	public JenkinsPrimaryView()
	 {
		  super();

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
 	 * @param name the new name
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

	 /** The name. */
 	private String name;
	 
 	/** The url. */
 	private String url;
}
