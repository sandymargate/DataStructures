package com.selenium.OrangeHRM.keywords;

import org.apache.log4j.Logger;

public class loginPage {
	
	static Logger logger = Logger.getLogger(loginPage.class);
	
	public void setDebugLog(String param)
	{
		logger.debug("This is debug "+ param);
	}
	
	public void setErrorLog(String err)
	{
		logger.error("This is error "+err);
	}
	
	public void setInfoLog(String log)
	{
		logger.info("This is info "+ log);
	}
	
	public void setWarnLog(String warn)
	{
		logger.warn("This is warn "+ warn);
	}	
	
}

