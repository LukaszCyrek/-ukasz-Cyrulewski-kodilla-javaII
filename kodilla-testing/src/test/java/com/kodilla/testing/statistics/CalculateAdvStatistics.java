package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistic;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatistics {
    @Test
    public void  testCalculateNoPost() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> Lists = new ArrayList<String>();
        Lists.add("Marek Marecki");
        when(statisticsMock.usersNames()).thenReturn(Lists);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,calculateStatistic.averageCommentsPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsUser);
        Assert.assertEquals(0, calculateStatistic.averagePostUser);
    }
}
