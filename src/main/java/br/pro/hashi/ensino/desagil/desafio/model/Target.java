package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public void moveRandom(){
        Random random = new Random();
        int selector = random.nextInt(4);

        switch (selector) {
            case 0:
                moveUp();
                break;
            case 1:
                moveRight();
                break;
            case 2:
                moveDown();
                break;
            case 3:
                moveLeft();
                break;
        }
    }

    public void moveUp() {
        if (row > 0 && !board.isWall(row - 1, col)) {
            move(-1, 0);
        }
    }

    public void moveRight() {
        if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
            move(0, 1);
        }
    }

    public void moveDown() {
        if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
            move(1, 0);
        }
    }

    public void moveLeft() {
        if (col > 0 && !board.isWall(row, col - 1)) {
            move(0, -1);
        }
    }

}
