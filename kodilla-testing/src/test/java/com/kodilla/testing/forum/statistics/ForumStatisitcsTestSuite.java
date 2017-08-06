package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisitcsTestSuite {

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

        int postsCounter = 0;

        double average = postsCounter / userNameList.size();

        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvAstatistics(statisticsMock);
        //Then
        Assert.assertEquals(average, );

    }
}