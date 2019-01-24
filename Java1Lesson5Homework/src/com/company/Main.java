package com.company;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Top manager", "ivanovii@mail.ru", 350000, 47);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", "manager",
                "petrovpp@mail.ru", 55000, 31);
        employees[2] = new Employee("Sidorov", "Sidor", "Sidorovich",
                "manager", "sidorovss@mail.ru", 37000, 55);
        employees[3] = new Employee("Pupkin", "Vasilii", "Ivanovich",
                "manager", "pupkinvi@mail.ru", 850000, 41);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "semenovss@mail.ru", 900000, 22);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();

    }
}
