package Lesson_01;

public class HomeWorkAppClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Aplle");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 11;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительна");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100 ) {
            System.out.println("Желтый");
        }

    }

    public static void  compareNumbers() {
        int a = 30;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}
