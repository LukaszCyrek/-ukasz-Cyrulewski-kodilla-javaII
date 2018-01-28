package java.forum.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Marek", 'M', 1988, 02, 21, 30, 0));
        theUserList.add(new ForumUser(2, "Darek", 'M', 2000, 03, 21, 18, 21));
        theUserList.add(new ForumUser(3, "Anna", 'F', 1999, 02, 21, 21, 32));
        theUserList.add(new ForumUser(4, "Franciszek", 'M', 2012, 03, 12, 6, 53));
        theUserList.add(new ForumUser(5,"Andrzej", 'M', 1999,11,21, 21, 423));
    }
        public  List<ForumUser> getUserList() {
            return new ArrayList<>(theUserList);

        }
    }

