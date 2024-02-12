package structural.facade.complexLogic.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import structural.facade.complexLogic.authentication.SecurityContext;
import structural.facade.complexLogic.socialMedia.FacebookService;
import structural.facade.complexLogic.socialMedia.InstagramService;
import structural.facade.complexLogic.socialMedia.LinkedInService;
import structural.facade.complexLogic.socialMedia.SocialMedia;

public class PostService {

    // SIMULATION
    public List<Post> fetchPosts(String author) {
        List<Post> posts = new ArrayList<>();
        List<SocialMedia> socialMedias = Arrays.asList(
                new FacebookService(),
                new InstagramService(),
                new LinkedInService()
        );

        for (SocialMedia socialMedia : socialMedias) {
            if (socialMedia.login(SecurityContext.USERNAME, SecurityContext.PASSWORD)) {
                posts.addAll(socialMedia.getPostsFromAuthor(author));
            }
        }

        return posts;
    }

}
