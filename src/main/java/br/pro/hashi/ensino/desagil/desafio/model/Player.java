package br.pro.hashi.ensino.desagil.desafio.model;

@SuppressWarnings("ALL")
public abstract class Player extends Element {
    private final Board board;

    public Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    public void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }
}
