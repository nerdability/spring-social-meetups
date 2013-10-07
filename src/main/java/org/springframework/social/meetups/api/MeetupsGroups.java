package org.springframework.social.meetups.api;

import java.util.Collection;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MeetupsGroups {

	@JsonProperty("results")
	private Collection<MeetupsGroup> groups ;

	public Collection<MeetupsGroup> getGroups() {
		return groups;
	}

	public void setGroups(Collection<MeetupsGroup> groups) {
		this.groups = groups;
	} 
	
	
	
}
