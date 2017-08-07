package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Start of the tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("End of the tests.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock =  mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();
        userNameList.add("Rick");
        userNameList.add("Morty");
        userNameList.add("Summer");

        int postsCounter = 0;
        int commentsCounter = 0;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, forumStatistics.getPostsPerUserAverage(), 0.1);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerUserAverage(), 0.1);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerPostAverage(), 0.1);
    }

    @Test
    public void testThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();
        userNameList.add("Rick");
        userNameList.add("Morty");
        userNameList.add("Summer");

        int postsCounter = 1000;
        int commentsCounter = 0;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(333.33, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();
        userNameList.add("Rick");
        userNameList.add("Morty");
        userNameList.add("Summer");

        int postsCounter = 10;
        int commentsCounter = 0;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(3.33, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();
        userNameList.add("Rick");
        userNameList.add("Morty");
        userNameList.add("Summer");

        int postsCounter = 2338;
        int commentsCounter = 663;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(779.33, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(221.00, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(0.28, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void testCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();
        userNameList.add("Rick");
        userNameList.add("Morty");
        userNameList.add("Summer");

        int postsCounter = 84;
        int commentsCounter = 213;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(28.00, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(71.00, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(2.53, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNameList = new ArrayList<>();

        int postsCounter = 0;
        int commentsCounter = 0;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(0.0, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void testHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int mortyCounter = 0;
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            mortyCounter += 1;
            userNameList.add("Morty clone #" + mortyCounter);
        }

        int postsCounter = 42;
        int commentsCounter = 763;

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.42, forumStatistics.getPostsPerUserAverage(), 0.01);
        Assert.assertEquals(7.63, forumStatistics.getCommentsPerUserAverage(), 0.01);
        Assert.assertEquals(18.16, forumStatistics.getCommentsPerPostAverage(), 0.01);
    }
}
