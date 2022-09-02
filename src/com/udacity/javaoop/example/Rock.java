package com.udacity.javaoop.example;

public class Rock extends Piece{

    public Rock(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }
        if (newPosition.getColumn() == this.getPosition().getColumn()
                && newPosition.getRow() == this.getPosition().getRow()) {
            return true;
        }else{
            return false;
        }
    }
}
