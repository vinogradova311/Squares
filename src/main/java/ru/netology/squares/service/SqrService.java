package ru.netology.squares.service;

public class SqrService {
    public int calcNumberOfSquares(int limitMin, int limitMax) {
        int calc = 0;
        for (int i = 10; i <= 99; i++) {
            if (limitMin <= (i * i) && (i * i) <= limitMax) {
                calc++;
            }

        }
        return calc;
    }
}