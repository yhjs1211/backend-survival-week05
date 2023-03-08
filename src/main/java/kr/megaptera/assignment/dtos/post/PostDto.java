package kr.megaptera.assignment.dtos.post;

import kr.megaptera.assignment.model.post.*;

public class PostDto {
    private String id;
    private String title;
    private String author;
    private String content;

    public PostDto() {
    }

    public PostDto(String id, String title, String author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public PostDto(Post post) {
        this(post.id().toString(),
                post.title(),
                post.author(),
                post.postContent().toString());
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}