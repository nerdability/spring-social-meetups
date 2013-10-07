package org.springframework.social.meetups.api;

import java.util.Collection;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This is the domain object that maps to user profile on Meetups. 
 * 
 * Uses Jackson JSON mapping to translate API response to pojo
 * 
 * @author mike p
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MeetupsUser {

	@JsonProperty("id")
	private String id ; 
	
	@JsonProperty("name")
	private String name;

	@JsonProperty("topics")
	private Collection<MeetupsTopic> topics;

	@JsonProperty
	private String lat ; 
	
	@JsonProperty
	private String lon ; 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<MeetupsTopic> getTopics() {
		return topics;
	}

	public void setTopics(Collection<MeetupsTopic> topics) {
		this.topics = topics;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}


	
	
}
