package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

public class BishopBlackTest  {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        Cell[] expect = {Cell.E5, Cell.F6, Cell.G7, Cell.H8};
        assertThat(bishopBlack.way(Cell.H8), is(expect));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenCopyDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D4);
        bishopBlack.way(Cell.H7);
    }
}