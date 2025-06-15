import java.util.*;
class Post {
    private String content;
    private Set<String> likedBy;
    public Post(String content) {
        this.content = content;
        this.likedBy = new HashSet<>();
    }

    public void likePost(String userId) {
        if (likedBy.add(userId)) {
            System.out.println(userId + " liked the post: " + content);
        } else {
            System.out.println(userId + " has already liked this post");
        }
    }
    public int getLikesCount() {
        return likedBy.size();
    }
}
public class socialmediaapp {
    public static void main(String[] args) {
        Post post = new Post("Birthday");
        post.likePost("sneaky_ps_ycho_x");
        post.likePost("sai_kumar_royal.1723");
        post.likePost("deel_looser");
        post.likePost("kanna_.18");
        post.likePost("rana_saketh");
        post.likePost("sneaky_ps_ycho_x");
        System.out.println("Total likes: " + post.getLikesCount());
    }
}