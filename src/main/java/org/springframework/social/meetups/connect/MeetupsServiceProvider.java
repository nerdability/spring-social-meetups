package org.springframework.social.meetups.connect;

import org.springframework.social.meetups.api.Meetups;
import org.springframework.social.meetups.api.impl.MeetupsTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

public class MeetupsServiceProvider extends AbstractOAuth2ServiceProvider<Meetups> {

	public MeetupsServiceProvider(String clientId, String clientSecret) {
		super(createOAuth2Template(clientId, clientSecret));
	}

	private static OAuth2Template createOAuth2Template(String clientId, String clientSecret) {
		OAuth2Template oAuth2Template = new OAuth2Template(clientId, clientSecret, "https://secure.meetup.com/oauth2/authorize", "https://secure.meetup.com/oauth2/access");
		oAuth2Template.setUseParametersForClientAuthentication(true);
		return oAuth2Template;
	}

	public Meetups getApi(String accessToken) {
		return new MeetupsTemplate(accessToken);
	}

}
