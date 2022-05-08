package ru.netology.sqr;

public class SQRService {

  public int squareCalculation (int limit1, int limit2) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int x = i * i;

            //  if (x >= limit1) {
            //     if (x <= limit1) {
            //     count++;
            //     }
            //  }

            for (int c = limit1; c <= limit2; c++) {

                if (c == x) {
                    count++;
                }
            }
        }
        return count;
    }
}
