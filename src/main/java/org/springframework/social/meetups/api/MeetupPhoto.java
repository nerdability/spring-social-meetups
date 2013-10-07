package org.springframework.social.meetups.api;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class MeetupPhoto {

	
	@JsonProperty("photo_link")
	private String photoLink ; 
	@JsonProperty("highres_link")
	private String highResLink ;
	@JsonProperty("thumb_link")
	private String thumbLink;
	public String getPhotoLink() {
		return photoLink;
	}
	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}
	public String getHighResLink() {
		return highResLink;
	}
	public void setHighResLink(String highResLink) {
		this.highResLink = highResLink;
	}
	public String getThumbLink() {
		return thumbLink;
	}
	public void setThumbLink(String thumbLink) {
		this.thumbLink = thumbLink;
	}
	
	
	
	
}
