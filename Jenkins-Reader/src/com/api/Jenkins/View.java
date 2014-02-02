package com.api.Jenkins;

/**
 * The Class View.
 */
public class View
{

	 /** The name. */
 	String name;
	 
 	/** The url. */
 	String url;

	 /**
 	 * Instantiates a new view.
 	 *
 	 * @param name the name
 	 * @param url the url
 	 */
 	public View(String name, String url)
	 {
		  super();
		  this.name = name;
		  this.url = url;
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

}
