package com.kodilla.testing.forum.statistics;


import java.util.List;

public class CalculateStatistic implements Statistics {
   public double userCount;
   public double postCount;
   public double commentCount;
   public double averagePostUser;
   public double averageCommentsUser;
   public double averageCommentsPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
if (userCount == 0){
    averageCommentsPost = 0;
    averageCommentsUser = 0;
    averagePostUser = 0;
} else {
    if (postCount == 0){
        averagePostUser = 0;
    } else {
        averagePostUser = postCount / userCount;
    }
    if (commentCount == 0) {
        averageCommentsUser = 0;
        averageCommentsPost = 0;
    } else {
        averageCommentsPost = commentCount / userCount;
        averageCommentsUser = commentCount / postCount;
    }
}

}

    @Override
    public List<String> usersNames() {
        return null;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}

