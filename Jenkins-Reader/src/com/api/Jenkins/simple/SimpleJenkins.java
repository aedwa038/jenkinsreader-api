package com.api.Jenkins.simple;

import java.util.Vector;


/**
 * The Class SimpleJenkins.
 */
public class SimpleJenkins
{
	 
	 /**
 	 * Instantiates a new simple jenkins.
 	 */
 	public SimpleJenkins()
     {
		  super();
		  
     }

	 /**
 	 * Instantiates a new simple jenkins.
 	 *
 	 * @param mode the mode
 	 * @param nodeDescription the node description
 	 * @param nodeName the node name
 	 * @param jobs the jobs
 	 * @param view the view
 	 */
 	public SimpleJenkins(String mode, String nodeDescription, String nodeName,
               Vector<SimpleJob> jobs, JenkinsPrimaryView view)
     {
		  super();
		  this.mode = mode;
		  this.nodeDescription = nodeDescription;
		  this.nodeName = nodeName;
		  this.jobs = jobs;
		  this.view = view;
     }

	 /** The mode. */
	 	private String mode;
		 
	 	/** The node description. */
	 	private String nodeDescription;
		 
	 	/** The node name. */
	 	private String nodeName;
	 	
	 	/** The jobs. */
	 	private Vector<SimpleJob> jobs = new Vector<SimpleJob>();
	 	
	 	/** The view. */
	 	private JenkinsPrimaryView view;

	 /**
 	 * Gets the mode.
 	 *
 	 * @return the mode
 	 */
 	public String getMode()
	 {
	 	 return mode;
	 }

	 /**
 	 * Sets the mode.
 	 *
 	 * @param mode the new mode
 	 */
 	public void setMode(String mode)
	 {
	 	 this.mode = mode;
	 }

	 /**
 	 * Gets the node description.
 	 *
 	 * @return the node description
 	 */
 	public String getNodeDescription()
	 {
	 	 return nodeDescription;
	 }

	 /**
 	 * Sets the node description.
 	 *
 	 * @param nodeDescription the new node description
 	 */
 	public void setNodeDescription(String nodeDescription)
	 {
	 	 this.nodeDescription = nodeDescription;
	 }

	 /**
 	 * Gets the node name.
 	 *
 	 * @return the node name
 	 */
 	public String getNodeName()
	 {
	 	 return nodeName;
	 }

	 /**
 	 * Sets the node name.
 	 *
 	 * @param nodeName the new node name
 	 */
 	public void setNodeName(String nodeName)
	 {
	 	 this.nodeName = nodeName;
	 }

	 /**
 	 * Gets the jobs.
 	 *
 	 * @return the jobs
 	 */
 	public Vector<SimpleJob> getJobs()
	 {
	 	 return jobs;
	 }

	 /**
 	 * Sets the jobs.
 	 *
 	 * @param jobs the new jobs
 	 */
 	public void setJobs(Vector<SimpleJob> jobs)
	 {
	 	 this.jobs = jobs;
	 }

	 /**
 	 * Gets the view.
 	 *
 	 * @return the view
 	 */
 	public JenkinsPrimaryView getView()
	 {
	 	 return view;
	 }

	 /**
 	 * Sets the view.
 	 *
 	 * @param view the new view
 	 */
 	public void setView(JenkinsPrimaryView view)
	 {
	 	 this.view = view;
	 }
	 

}
