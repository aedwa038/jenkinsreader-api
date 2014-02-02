package com.api.Jenkins;


/**
 * The Class HealthReport.
 */
public class HealthReport
{
	 
 	/**
 	 * Instantiates a new health report.
 	 *
 	 * @param description the description
 	 * @param score the score
 	 */
 	public HealthReport(String description, String score)
	 {
		  this.description = description;
		  this.score = score;
	 }

	 /**
 	 * Gets the description.
 	 *
 	 * @return the description
 	 */
 	public String getDescription()
	 {
		  return description;
	 }

	 /**
 	 * Sets the description.
 	 *
 	 * @param description the new description
 	 */
 	public void setDescription(String description)
	 {
		  this.description = description;
	 }

	 /**
 	 * Gets the score.
 	 *
 	 * @return the score
 	 */
 	public String getScore()
	 {
		  return score;
	 }

	 /**
 	 * Sets the score.
 	 *
 	 * @param score the new score
 	 */
 	public void setScore(String score)
	 {
		  this.score = score;
	 }

	 /** The description. */
 	String description;
	 
 	/** The score. */
 	String score;
}
