package org.springframework.social.meetups.api;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MeetupsTopic {

	private String id ; 
	private String name; 
	private String urlKey ;
	
	
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getUrlKey() {
		return urlKey;
	}
	void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	} 
	
	
}
