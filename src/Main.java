import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        // write your code here
        for (Country c : Country.values()) {
            System.out.println(c);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите страну:");
        String input = in.nextLine();

        try {
            Country.valueOf(input).printInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
            try {
                Country.getByRuName(input).printInfo();
            } catch (NoSuchCountryException e2) {
                System.out.println("Страны '" + input + "' не существует.");
            }
        } catch (Exception e) {
            System.out.println("Все сломалось: " + e);
        }
    }
}
