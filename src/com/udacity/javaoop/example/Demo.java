package com.udacity.javaoop.example;

public class Demo {
    public static void main(String[] args) {
        Queen queen = new Queen(new Position(0, 4));
        Position testPosition = new Position(3, 10);
        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}
