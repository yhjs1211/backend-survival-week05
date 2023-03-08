package kr.megaptera.assignment.dtos.comment;

import kr.megaptera.assignment.model.comment.*;

public class CommentDto {
    private String id;
    private String author;
    private String content;

    public CommentDto(String id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public CommentDto() {
    }

    public CommentDto(Comment comment) {
        this(
                comment.id().toString(),
                comment.author(),
                comment.content()
        );
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}