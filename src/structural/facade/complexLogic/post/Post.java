package structural.facade.complexLogic.post;

public class Post {

    private final String author;
    private final String title;
    private final String imageUrl;

    public Post(String author, String title, String imageUrl) {
        this.author = author;
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}
