package com.udacity.javaoop.example;

public class Bishop extends Piece{
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) == Math.abs(newPosition.getRow() - this.getPosition().getRow())) {
            return true;
        } else {
            return false;
        }
    }
}
