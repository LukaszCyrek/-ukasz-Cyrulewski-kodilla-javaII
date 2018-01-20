package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publicOfPosts;

    public ForumUser(final int userId, final String userName, final char sex, int yearOfBorn,final int monthOfBorn, final int dayOfBorn, final int publicOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBorn, monthOfBorn, dayOfBorn);
        this.publicOfPosts = publicOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublicOfPosts() {
        return publicOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publicOfPosts=" + publicOfPosts +
                '}';
    }
}
