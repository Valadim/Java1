public class Java1Lesson1Task6 {
    public static void main(String[] args) {
        System.out.println(isPositiveOrNegative(-7));
    }
    public static boolean isPositiveOrNegative (int a){
        if(a >= 0){
            return false;
        } else {
            return true;
        }
    }
}


//Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;
