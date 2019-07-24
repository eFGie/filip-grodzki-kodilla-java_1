package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Board.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoListTaskAdd("todo1");
    //    board.inProgressListTaskAdd("inprogress1");
   //     board.doneListTaskAdd("done1");
        //Then
        //do nothing
    }
}
