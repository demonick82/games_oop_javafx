package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenMoveRight() {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.A1));
            logic.move(Cell.A1, Cell.H8);
        } catch (FigureNotFoundException e) {
            System.out.println("Фигуры нет на клетке.");
        } catch (OccupiedCellException e) {
            System.out.println("Ячейка занята");
        } catch (ImpossibleMoveException e) {
            System.out.println("Пользователь двигает фигуру не по правилам шахмат");
        }
    }

    @Test
    public void whenMoveOccopied() {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.A1));
            logic.add(new BishopBlack(Cell.C3));
            logic.move(Cell.A1, Cell.H8);
        } catch (FigureNotFoundException e) {
            System.out.println("Фигуры нет на клетке.");
        } catch (OccupiedCellException e) {
            System.out.println("Ячейка занята");
        } catch (ImpossibleMoveException e) {
            System.out.println("Пользователь двигает фигуру не по правилам шахмат");
        }
    }

    @Test
    public void whenMoveImpossible() {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.A1));
            logic.move(Cell.A1, Cell.A8);
        } catch (FigureNotFoundException e) {
            System.out.println("Фигуры нет на клетке.");
        } catch (OccupiedCellException e) {
            System.out.println("Ячейка занята");
        } catch (ImpossibleMoveException e) {
            System.out.println("Пользователь двигает фигуру не по правилам шахмат");
        }
    }

    @Test
    public void whenMoveFigureNotFoun() {
        try {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.A1));
            logic.move(Cell.B2, Cell.A8);
        } catch (FigureNotFoundException e) {
            System.out.println("Фигуры нет на клетке.");
        } catch (OccupiedCellException e) {
            System.out.println("Ячейка занята");
        } catch (ImpossibleMoveException e) {
            System.out.println("Пользователь двигает фигуру не по правилам шахмат");
        }
    }
}