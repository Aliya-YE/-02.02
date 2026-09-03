import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задание 1
        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;

        System.out.print("У вас на счету " + rubles + " рублей. В долларах это " + dollars + "  долларов. Так держать!");

        //Задание 2
        String weather = scanner.nextLine();
        if (weather.equals("Дождь")) {
            System.out.println("Беру с собой зонт");

        } else {
            System.out.println("Иду налегке");
        }

        System.out.print("Люблю гулять!");

        //Задание 3
        int eggs = scanner.nextInt();
        if (eggs > 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else {
            System.out.println("Рекомендую позавтракать бутербродами.");
        }

        System.out.print("Приятного аппетита!");


    }
}
