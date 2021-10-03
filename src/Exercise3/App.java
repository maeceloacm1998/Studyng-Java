package Exercise3;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        
        Date momment = sdf.parse("02/05/1998 13:30:00");
        String title = "First post in my program";
        String content = "Hi dev, my name is Marcelo, I'm a mobile developer at React-Native. I'm currently studying java because in the future my dream job will be on Google Enterprise";
        Integer likes = 12;

        Comment c1 = new Comment("WOW, this is amazing");
        Comment c2 = new Comment("Very good Marcelo, great!");


        Post newPost = new Post(momment, title, content, likes);
        newPost.addComment(c1);
        newPost.addComment(c2);

        System.out.println(newPost.toString());
    }
}
