package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Marek", 'M', 1988, 02, 21, 3));
        theUserList.add(new ForumUser(2, "Darek", 'M', 2000, 03, 21, 21));
        theUserList.add(new ForumUser(3, "Anna", 'F', 1999, 02, 21, 3));
        theUserList.add(new ForumUser(4, "Franciszek", 'M', 2012, 03, 12, 0));
    }
        public  List<ForumUser> getUserList() {
            return new ArrayList<>(theUserList);

        }
    }

