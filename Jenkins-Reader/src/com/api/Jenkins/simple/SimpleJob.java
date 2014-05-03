package com.api.Jenkins.simple;


/**
 * The Class SimpleJob.
 */
public class SimpleJob
{

	 /**
 	 * Instantiates a new simple job.
 	 *
 	 * @param name the name
 	 * @param url the url
 	 * @param color the color
 	 */
 	public SimpleJob(String name, String url, String color)
	 {
		  super();
		  this.name = name;
		  this.url = url;
		  this.color = color;
	 }

	 /**
 	 * Instantiates a new simple job.
 	 */
 	public SimpleJob()
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
 	 * @param color the new color
 	 */
 	public void setColor(String color)
	 {
		  this.color = color;
	 }

	 /** The name. */
 	private String name;
	 
 	/** The url. */
 	private String url;
	 
 	/** The color. */
 	private String color;

}
