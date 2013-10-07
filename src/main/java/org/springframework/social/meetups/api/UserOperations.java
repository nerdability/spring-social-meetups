package org.springframework.social.meetups.api;

import java.util.List;

/**
 * Interface to define all available actions regarding a user on the Meetups api
 * 
 * @author mike p
 */
public interface UserOperations {

	/**
	 * Fetch the full user profile for an authenticated user
	 * 
	 * @return MeetupsUser
	 */
	MeetupsUser getUser();

	
	MeetupsGroups getGroups(); 

}
