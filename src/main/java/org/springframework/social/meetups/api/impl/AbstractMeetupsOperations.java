package org.springframework.social.meetups.api.impl;

import org.springframework.social.MissingAuthorizationException;

/**
 * Class to define core is authorised checks to be used by all Operation class
 * implementations. (Based on Facebook implementation)
 * 
 * @author rob hinds
 */
public class AbstractMeetupsOperations {

	private static final String BASE_API_URL = "https://api.meetup.com";

	private final boolean isAuthorized;

	public AbstractMeetupsOperations(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("Meetups Authorisation required");
		}
	}

	protected String buildUrl(String string) {
		return BASE_API_URL + string;
	}
}
