import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework10");

        System.out.println();

        System.out.println("Aufgabe 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov " + "Ivan " + "Ivanovich";
        System.out.println("Ф.И.О сотрудника - " + fullName);

        System.out.println();

        System.out.println("Aufgabe 2");
        fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println(fullName.toUpperCase());

        System.out.println();

        System.out.println("Aufgabe 3");
        fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);




    }
}