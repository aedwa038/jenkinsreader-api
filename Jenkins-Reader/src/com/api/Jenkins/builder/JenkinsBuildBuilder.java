package com.api.Jenkins.builder;

import org.dom4j.Element;

import com.api.Jenkins.Build;

/**
 * The Class BuildParser.
 */
public class JenkinsBuildBuilder extends AbstractBuilder
{

	 /*
	  * (non-Javadoc)
	  * 
	  * @see com.api.Jenkins.parser.Parser#Parse(java.lang.String)
	  */
	 @Override
	 public Build build(String url)
	 {
		  Build build = null;
		  super.init(url);
		  if (dom != null)
		  {
			   Element root = dom.getRootElement();

			   {
					build = new Build(Integer.parseInt(root
					          .elementText("number")),
					          root.elementText("result"),
					          root.elementText("url"),
					          root.elementText("fullDisplayName"));
			   }
		  }
		  return build;
	 }
}
