package com.kodilla.stream.forumUser;

import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
         forum.getUserList().stream()

                 .forEach(System.out::println);
    }
}
