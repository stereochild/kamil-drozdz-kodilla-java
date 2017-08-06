package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private double postsPerUserAverage;
    private double commentsPerUserAverage;
    private double commentsPerPostAverage;

    public void calculateAdvAstatistics(Statistics statistics) {
        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        if(statistics.usersNames().size() != 0) {
            postsPerUserAverage = (double)postsAmount / (double)usersAmount;
            commentsPerUserAverage = (double)commentsAmount / (double)usersAmount;
        }else{
            postsPerUserAverage = 0;
            commentsPerUserAverage = 0;
        }
        if(statistics.postsCount() !=0) {
            commentsPerPostAverage = (double)commentsAmount / (double)postsAmount;
        }else{
            commentsPerPostAverage = 0;
        }
    }

    public void ShowStatistics(){
        System.out.println("Users amount: " + usersAmount);
        System.out.println("Posts amount: " + postsAmount);
        System.out.println("Comments amount: " + commentsAmount);
        System.out.println("Average amount of posts per user: " + postsPerUserAverage);
        System.out.println("Average amount of comments per user: " + commentsPerUserAverage);
        System.out.println("Average amount of commnets per post: " +commentsPerPostAverage);
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public double getPostsPerUserAverage() {
        return postsPerUserAverage;
    }

    public double getCommentsPerUserAverage() {
        return commentsPerUserAverage;
    }

    public double getCommentsPerPostAverage() {
        return commentsPerPostAverage;
    }
}
