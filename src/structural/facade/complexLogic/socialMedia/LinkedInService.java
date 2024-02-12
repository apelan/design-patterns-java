package structural.facade.complexLogic.socialMedia;

import java.util.ArrayList;
import java.util.List;

import structural.facade.complexLogic.post.Post;

public class LinkedInService implements SocialMedia {
    @Override
    public String name() {
        return "LinkedIn";
    }

    @Override
    public boolean login(String username, String password) {
        // SIMULATE LOGIN
        return true;
    }

    @Override
    public List<Post> getPostsFromAuthor(String author) {
        // SIMULATE FETCHING POSTS
        List<Post> posts = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            posts.add(new Post(author, "Post" + i, "li_image_url_" + i));
        }
        return posts;
    }
}
