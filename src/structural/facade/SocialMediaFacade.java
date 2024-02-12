package structural.facade;

import java.util.ArrayList;
import java.util.List;

import structural.facade.complexLogic.authentication.AuthenticationService;
import structural.facade.complexLogic.favorite.FavoriteService;
import structural.facade.complexLogic.post.Post;
import structural.facade.complexLogic.post.PostService;

// FACADE TO HIDE ALL COMPLEX LOGIC BEHIND
public class SocialMediaFacade {

    public List<Post> fetchPostsForFavoriteAuthors() {
        List<Post> posts = new ArrayList<>();

        AuthenticationService authenticationService = new AuthenticationService();
        FavoriteService favoriteService = new FavoriteService();
        PostService postService = new PostService();

        // AUTHENTICATE
        authenticationService.authenticate();

        // GET FAVORITE AUTHORS
        List<String> favoriteAuthors = favoriteService.myFavoriteAuthors();

        // GET ALL POSTS FOR AUTHORS
        for (String author : favoriteAuthors) {
            posts.addAll(postService.fetchPosts(author));
        }

        return posts;
    }

}
