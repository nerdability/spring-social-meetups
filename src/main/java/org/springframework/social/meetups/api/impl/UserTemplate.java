package org.springframework.social.meetups.api.impl;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.meetups.api.MeetupsGroups;
import org.springframework.social.meetups.api.MeetupsUser;
import org.springframework.social.meetups.api.UserOperations;
import org.springframework.web.client.RestTemplate;

public class UserTemplate extends AbstractMeetupsOperations implements UserOperations {

	private final RestTemplate restTemplate;

	public UserTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.restTemplate = restTemplate;
	}

	public MeetupsUser getUser() {
		requireAuthorization();
		String result = restTemplate.getForObject(buildUrl("/2/member/self"), String.class);
		MeetupsUser user = null;
		try {
			user = new ObjectMapper().readValue(result.getBytes(),MeetupsUser.class);
		} catch (IOException e) {
			throw new RuntimeException("Couldn't parse meetups user correctly",e);
		} 
		return user;
	}

	public MeetupsGroups getGroups() {
		requireAuthorization(); 
		MeetupsUser user = getUser(); 
		String result = restTemplate.getForObject(buildUrl("/2/groups?member_id="+user.getId()), String.class);
		MeetupsGroups groups = null; 
		try {
			groups = new ObjectMapper().readValue(result.getBytes(),MeetupsGroups.class);
		} catch (IOException e) {
			throw new RuntimeException("Couldn't parse meetups groups correctly",e);
		} 
		return groups;
	}

}
