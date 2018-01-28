package java.forum.stream.forumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map <Integer, ForumUser> theResult = forum.getUserList().stream()
                 .filter(s -> s.getPublicOfPosts() > 0)
                 .filter(d -> d.getSex() =='M')
                 .filter(a ->a.getAge() >20)
                 .collect(Collectors.toMap(ForumUser::getUserId, a-> a ));

        System.out.println("# elements: " + theResult.size());
        theResult.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    }

