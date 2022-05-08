package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int squareNum = service.squareCalculation(200, 300);
        System.out.println(squareNum);
    }
}
