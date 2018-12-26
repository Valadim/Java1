public class Java1Lesson1Task7 {
    public static void main(String[] args) {
        helloName("Вадим");
    }
    public static void helloName(String s){
        System.out.println("Привет, " + s + "!");
    }
}

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//   метод должен вывести в консоль сообщение «Привет, указанное_имя!»