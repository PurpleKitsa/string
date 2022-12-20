public class Main {
    public static void main(String[] args) {
        task1();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1-2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        System.out.println(fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника "+ fullName);
    }
}