package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        int finalYear = 2020;
        while (year <= finalYear) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }
}
