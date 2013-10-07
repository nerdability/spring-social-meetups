package org.springframework.social.meetups.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.meetups.api.Meetups;
import org.springframework.social.meetups.api.MeetupsUser;

/**
 * Adapter implementation for Meetups (based on Facebook implementation)
 */
public class MeetupsAdapter implements ApiAdapter<Meetups> {

	public void setConnectionValues(Meetups meetup, ConnectionValues values) {
		MeetupsUser profile = meetup.userOperations().getUser();
		values.setProviderUserId(String.valueOf(profile.getId()));
		values.setDisplayName(profile.getName());
	}

	public UserProfile fetchUserProfile(Meetups meetupsUser) {
		MeetupsUser profile = meetupsUser.userOperations().getUser();
		return new UserProfileBuilder().setName(profile.getName()).setUsername(profile.getId()).build();
	}

	public boolean test(Meetups meetups) {
		try {
			meetups.userOperations().getUser();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	public void updateStatus(Meetups github, String message) {
		// We are not doing any writing through this API for now
	}

}