package com.BaseClasses;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({"classpath:${env}.properties"})
public interface WebConfig extends Config 
{
	
	WebConfig BASE_CONFIG=ConfigFactory
			.create(WebConfig.class, System.getenv(),System.getProperties());
	
	@Key("site")
	String getWebUrl();
			
	
}