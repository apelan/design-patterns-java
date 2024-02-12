package structural.facade.complexLogic.socialMedia;

import java.util.List;

import structural.facade.complexLogic.post.Post;

public interface SocialMedia {

    String name();

    boolean login(String username, String password);

    List<Post> getPostsFromAuthor(String author);

}
