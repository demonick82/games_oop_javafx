package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenMoveRight() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.H8);
    }


    @Test(expected = OccupiedCellException.class)
    public void whenMoveOccopied() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.C3));
        logic.move(Cell.A1, Cell.H8);
    }


    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveImpossible() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.A8);
    }

    @Test (expected = FigureNotFoundException.class)
    public void whenMoveFigureNotFound() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.A1));
            logic.move(Cell.B2, Cell.A8);
    }
}