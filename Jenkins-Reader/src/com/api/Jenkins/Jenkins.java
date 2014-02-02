package com.api.Jenkins;

import java.util.Vector;


/**
 * The Class Hudson. Used to represent an instance of a Jenkins server
 */
/**
 * @author Akeem
 *
 */
public class Jenkins
{

	 /**
 	 * Instantiates a new hudson.
 	 *
 	 * @param mode the mode
 	 * @param nodeDescription the node description
 	 * @param nodeName the node name
 	 * @param jobs the jobs
 	 * @param view the view
 	 * @param quietingDown the quieting down
 	 * @param useSecurity the use security
 	 */
 	public Jenkins(String mode, String nodeDescription, String nodeName,
               Vector<Job> jobs, Vector<View> view,
               boolean quietingDown, boolean useSecurity)
     {
		  super();
		  this.mode = mode;
		  this.nodeDescription = nodeDescription;
		  this.nodeName = nodeName;
		  this.jobs = jobs;
	//	  this.view = view;
		  this.quietingDown = quietingDown;
		  this.useSecurity = useSecurity;
     }
	 
	 /**
 	 * Instantiates a new hudson.
 	 */
 	public Jenkins ()
	 {
		 this.jobs = new Vector<Job>();
	 }
	 
 	
 	public void addJob(Job job)
 	{
 		 this.jobs.add(job);
 	}

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
 	public Vector<Job> getJobs()
	 {
		  return jobs;
	 }

	 /**
 	 * Sets the jobs.
 	 *
 	 * @param jobs the new jobs
 	 */
 	public void setJobs(Vector<Job> jobs)
	 {
		  this.jobs = jobs;
	 }

	 /**
 	 * Gets the view.
 	 *
 	 * @return the view
 	 */
 	public Vector<View> getView()
	 {
		 // return view;
 		 throw null;
	 }

	 /**
 	 * Sets the view.
 	 *
 	 * @param view the new view
 	 */
 	public void setView(Vector<View> view)
	 {
		//  this.view = view;
	 }

	 /**
 	 * Checks if is quieting down.
 	 *
 	 * @return true, if is quieting down
 	 */
 	public boolean isQuietingDown()
	 {
		  return quietingDown;
	 }

	 /**
 	 * Sets the quieting down.
 	 *
 	 * @param quietingDown the new quieting down
 	 */
 	public void setQuietingDown(boolean quietingDown)
	 {
		  this.quietingDown = quietingDown;
	 }

	 /**
 	 * Checks if is use security.
 	 *
 	 * @return true, if is use security
 	 */
 	public boolean isUseSecurity()
	 {
		  return useSecurity;
	 }

	 /**
 	 * Sets the use security.
 	 *
 	 * @param useSecurity the new use security
 	 */
 	public void setUseSecurity(boolean useSecurity)
	 {
		  this.useSecurity = useSecurity;
	 }
 	
 	
 	public int getNumberofJobs ()
 	{
 		 if(jobs == null)
 		 {
 			  return 0;
 		 }
 		 return jobs.size();
 	}

	 /** The mode. */
 	private String mode;
	 
 	/** The node description. */
 	private String nodeDescription;
	 
 	/** The node name. */
 	private String nodeName;
	 
 	/** The jobs. */
 	private Vector<Job> jobs;
	 
 	/** The view. */
 //	private Vector<View> view;
	 
 	/** The quieting down. */
 	private boolean quietingDown;
	 
 	/** The use security. */
 	private boolean useSecurity;

}
