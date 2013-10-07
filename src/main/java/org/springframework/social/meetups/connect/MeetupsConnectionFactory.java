package org.springframework.social.meetups.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.meetups.api.Meetups;

public class MeetupsConnectionFactory extends OAuth2ConnectionFactory<Meetups> {

	public MeetupsConnectionFactory(String clientId, String clientSecret) {
		super("meetups", new MeetupsServiceProvider(clientId, clientSecret), new MeetupsAdapter());
	}

}
