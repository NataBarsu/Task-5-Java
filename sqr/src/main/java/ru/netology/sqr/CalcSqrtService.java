package ru.netology.sqr;

public class CalcSqrtService {
    public int calcSqrt(int x, int y) {
        int z = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                z++;

            }
        }
        return z;
    }
}
