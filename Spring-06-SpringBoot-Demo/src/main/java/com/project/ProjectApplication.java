package com.project;

import com.project.model.Comment;
import com.project.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

       ApplicationContext context = SpringApplication.run(ProjectApplication.class, args);

      CommentService cs = context.getBean(CommentService.class);
      cs.publishComment(comment);

    }

}
