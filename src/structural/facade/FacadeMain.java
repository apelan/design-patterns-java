package structural.facade;

import java.util.List;

import structural.facade.complexLogic.post.Post;

public class FacadeMain {

    public static void main(String[] args) {

        SocialMediaFacade socialMediaFacade = new SocialMediaFacade();

        List<Post> posts = socialMediaFacade.fetchPostsForFavoriteAuthors();

        System.out.println("-------- FETCHED POSTS --------");
        for (Post post : posts) {
            System.out.println(post);
        }
        System.out.println("-------------------------------");

    }

}
