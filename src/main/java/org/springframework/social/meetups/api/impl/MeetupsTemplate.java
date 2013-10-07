package org.springframework.social.meetups.api.impl;

import org.springframework.social.meetups.api.Meetups;
import org.springframework.social.meetups.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

public class MeetupsTemplate extends AbstractOAuth2ApiBinding implements Meetups {

	private UserOperations userOperations;

	/**
	 * If no authenticated resources are required access to (such as user data)
	 * then this constructor can be used by anonymous users.
	 */
	public MeetupsTemplate() {
		super();
		this.userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
	}

	/**
	 * If accessing any authenticated parts of the API (any user specific data)
	 * then this constructor must be used with a valid user access token
	 * 
	 * @param accessToken
	 */
	public MeetupsTemplate(String accessToken) {
		super(accessToken);
		this.userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
	}

	public UserOperations userOperations() {
		return userOperations;
	}

}
