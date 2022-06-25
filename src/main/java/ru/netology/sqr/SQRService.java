package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerLimit, int upperLimit) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (lowerLimit <= (i * i) && (i * i) <= upperLimit) {
                sum++;
            }
        }
        return sum;
    }
}
