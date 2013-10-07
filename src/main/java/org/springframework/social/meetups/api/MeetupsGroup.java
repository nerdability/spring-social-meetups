package org.springframework.social.meetups.api;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MeetupsGroup {

	private String link ; 
	private String city; 
	private MeetupCategory category ; 
	private String name; 
	private Integer members; 
	
	@JsonProperty("group_photo")
	private MeetupPhoto groupPhoto;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public MeetupCategory getCategory() {
		return category;
	}

	public void setCategory(MeetupCategory category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMembers() {
		return members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public MeetupPhoto getGroupPhoto() {
		return groupPhoto;
	}

	public void setGroupPhoto(MeetupPhoto groupPhoto) {
		this.groupPhoto = groupPhoto;
	} 
	
	
}
