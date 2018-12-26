public class Java1Lesson1Task4 {
    public static void main(String[] args) {

        System.out.println(cheked10And20(15,17));
    }

    public static boolean cheked10And20 (int a, int b){

        if(a >= 10 && b <=20){
            return true;
        } else {
            return false;
            }

    }
}

// 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;