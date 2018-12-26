public class Java1Lesson1Task8 {
    public static void main(String[] args) {

        System.out.println(isMegaYear(2000));
    }

    public static boolean isMegaYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}

// 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.