package com.project.repository;

import com.project.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
