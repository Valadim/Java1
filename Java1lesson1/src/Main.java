public class Main {

    public static void main(String[] args) {

        byte a1 = 127;
        short a2 = 23456;
        int a3 = 456789123;
        long a4 = 987654321L;

        float a5 = 24.4f;
        double a6 = 4345667.2345d;

        char c = 'V';

        boolean bool = true;

        System.out.println(myCalculate(4,10,12,20));
        System.out.println(cheked10And20(15,17));
        ifInteger(32);
        System.out.println(isPositiveOrNegative(-7));
        helloName("Вадим");
        System.out.println(isMegaYear(2000));

    }

    public static int myCalculate (int a, int  b, int  c, int  d){
        return a * (b + (c / d));

    }

    public static boolean cheked10And20 (int a, int b){

        if(a >= 10 && b <=20){
            return true;
        } else {
            return false;
        }

    }

    public static void ifInteger (int a){
        if (a >=0){
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static boolean isPositiveOrNegative (int a){
        if(a >= 0){
            return false;
        } else {
            return true;
        }
    }

    public static void helloName(String s){
        System.out.println("Привет, " + s + "!");
    }

    public static boolean isMegaYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}