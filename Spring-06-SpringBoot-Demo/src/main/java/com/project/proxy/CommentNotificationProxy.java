package com.project.proxy;

import com.project.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
