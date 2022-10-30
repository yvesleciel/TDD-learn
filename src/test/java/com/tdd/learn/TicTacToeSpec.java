package com.tdd.learn;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class TicTacToeSpec {

@Rule
public ExpectedException exception = ExpectedException.none();

private TicTacToe ticTacToe;

@Before
public final void before(){
    ticTacToe = new TicTacToe();
}

@Test
public void whenXOutsideBoardThenRuntimeException(){
    exception.expect(RuntimeException.class);
    ticTacToe.play(5,2);
}

@Test
public void whenYOutsideBoardThenRuntimeException(){
    exception.expect(RuntimeException.class);
    ticTacToe.play(2, 5);
}

@Test
public void whenAPlaceAlreadyOccupiedThenRuntimeException(){
    ticTacToe.play(1, 2);
    exception.expect(RuntimeException.class);
    ticTacToe.play(1, 2);
}


@Test
public void testIfFirstPlayerIsX(){
    assertEquals("X", ticTacToe.nextPlayer());
}

@Test
public void whenLastTurnPlayedByXThenNextTurnByO(){
    ticTacToe.play(1,2);
    assertEquals("O", ticTacToe.nextPlayer());
}
/*
    @Test
    public void whenLastTurnPlayedByOThenNextTurnByX(){
        ticTacToe.play(1,2);
        assertEquals("X", ticTacToe.nextPlayer());
    }*/
}
