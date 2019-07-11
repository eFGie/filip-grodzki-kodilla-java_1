package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1,"user_1",'M',LocalDate.of(2000, 1, 12),4));
        theUserList.add(new ForumUser(2,"user_2",'F',LocalDate.of(1999, 2, 12),0));
        theUserList.add(new ForumUser(3,"user_3",'M',LocalDate.of(1967, 3, 12),26));
        theUserList.add(new ForumUser(4,"user_4",'F',LocalDate.of(2002, 4, 12),34));
        theUserList.add(new ForumUser(5,"user_5",'M',LocalDate.of(1957, 5, 12),58));
        theUserList.add(new ForumUser(6,"user_6",'F',LocalDate.of(2008, 6, 12),464));
        theUserList.add(new ForumUser(7,"user_7",'M',LocalDate.of(1977, 7, 12),0));
        theUserList.add(new ForumUser(8,"user_8",'M',LocalDate.of(1987, 8, 12),362));
        theUserList.add(new ForumUser(9,"user_9",'F',LocalDate.of(1996, 7, 12),1));
        theUserList.add(new ForumUser(10,"user_10",'M',LocalDate.of(2005, 7, 12),11));
        theUserList.add(new ForumUser(11,"user_11",'M',LocalDate.of(1997, 7, 12),25));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
