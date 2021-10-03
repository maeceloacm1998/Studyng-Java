package Exercise3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    
    private Date momment;
    private String title;
    private String content;
    private Integer likes;
    private static SimpleDateFormat sdf = new SimpleDateFormat();

    private List<Comment> arrayComment = new ArrayList<>();

    public Post(Date momment, String title,String content, Integer likes){
        this.momment = momment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }   

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getMomment() {
        return momment;
    }

    public void addComment(Comment comment){
        arrayComment.add(comment);
    }

    
    public void removeComment(Comment comment){
        arrayComment.remove(comment);
    }

    public String toString() {
        StringBuilder post = new StringBuilder();

        post.append(title + "\n");
        post.append(likes + " Likes - " + sdf.format(momment) + "\n");
        post.append(content + "\n");
        post.append("Comments: \n");
        
        for(Comment allComments : arrayComment){
            post.append(allComments.getText() + "\n");
        }

        return post.toString();
    }
}

