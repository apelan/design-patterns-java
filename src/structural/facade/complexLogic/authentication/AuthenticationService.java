package structural.facade.complexLogic.authentication;

import java.util.Arrays;
import java.util.List;

import structural.facade.complexLogic.socialMedia.FacebookService;
import structural.facade.complexLogic.socialMedia.InstagramService;
import structural.facade.complexLogic.socialMedia.LinkedInService;
import structural.facade.complexLogic.socialMedia.SocialMedia;

public class AuthenticationService {

    public void authenticate() {
        List<SocialMedia> socialMedias = Arrays.asList(
                new FacebookService(),
                new InstagramService(),
                new LinkedInService()
        );

        for (SocialMedia socialMedia : socialMedias) {
            System.out.println("----------------");
            System.out.println("[DEBUG] Login to " + socialMedia.name() + " with username: " + SecurityContext.USERNAME);

            if (socialMedia.login(SecurityContext.USERNAME, SecurityContext.PASSWORD)) {
                System.out.println("[INFO] " + socialMedia.name() + " authentication successful.");
            } else {
                System.out.println("[ERROR] " + socialMedia.name() + " authentication failed.");
            }
        }

    }

}
