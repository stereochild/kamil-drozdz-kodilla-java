package com.kodilla.testing.forum;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String author, String postBody) {
        this.author = author;
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostBody() {
        return postBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!postBody.equals(forumPost.postBody)) return false;
        return author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
