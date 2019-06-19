package br.pro.hashi.ensino.desagil.desafio.model;

@SuppressWarnings("ALL")
public abstract class Player extends Element {
    final Board board;

    Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }
}
