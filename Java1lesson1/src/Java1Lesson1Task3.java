public class Java1Lesson1Task3 {
    public static void main(String[] args) {

        System.out.println(myCalculate(4,10,12,20));

    }

    public static int myCalculate (int a, int  b, int  c, int  d){
        return a * (b + (c / d));

    }
}


// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;