public class Java1Lesson1Task5 {
    public static void main(String[] args) {

        ifInteger(32);
    }
    public static void ifInteger (int a){
        if (a >=0){
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
}

// 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
// в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.