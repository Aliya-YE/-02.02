import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources characterResources = new Resources(
                inputGold,
                inputSilver,
                inputWood,
                inputHealth,
                inputHasHelper
        );

        int characterGold = (int) characterResources.gold;
        int characterSilver = characterResources.silver * 100;
        double characterWood = characterResources.wood;
        byte characterHealth = (byte) characterResources.health;

        byte characterHelpersNumber;
        if (characterResources.hasHelper) {
            characterHelpersNumber = 1;
        } else {
            characterHelpersNumber = 0;
        }

        Character character = new Character(
                characterGold,
                characterSilver,
                characterWood,
                characterHealth,
                characterHelpersNumber
        );

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}

class Resources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public Resources(long inputGold, byte inputSilver, short inputWood, long inputHealth, boolean inputHasHelper) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHelper;

    }
}

class Character {
    int gold;
    int silver;
    double wood;
    byte health;
    byte helpersNumber;

    public Character(int characterGold, int characterSilver, double characterWood, byte characterHealth, byte characterHelpersNumber) {
        gold = characterGold;
        silver = characterSilver;
        wood = characterWood;
        health = characterHealth;
        helpersNumber = characterHelpersNumber;

//        //Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.moneyRUB != null) {
            System.out.println("- RUB");
        }
        if (user.moneyUSD != null) {
            System.out.println("- USD");
        }
        if (user.moneyEUR != null) {
            System.out.println("- EUR");
        }
    }
}

class PersonAccount {
    String name;
    Double moneyRUB;
    Double moneyUSD;
    Double moneyEUR;

    PersonAccount(String userName) {
        name = userName;
    }
}

//Задание 3
String pixelKcalDay = "43";
String beefKcal = "30.2";
String chickenKcal = "23.8";
String creamKcal = "32.1";
String milkKcal = "13.5";

float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
int dayKcal = Integer.parseInt(pixelKcalDay);
float totalKcal = dayKcal + pixelChoice;


checkKcal(Float.valueOf(totalKcal));
        }

private static float getMinKcalsSum(String firstDishKcal, String secondDishKcal,
                                    String firstDesert, String secondDesert) {
    float dish1 = Float.parseFloat(firstDishKcal);
    float dish2 = Float.parseFloat(secondDishKcal);
    float desert1 = Float.parseFloat(firstDesert);
    float desert2 = Float.parseFloat(secondDesert);

    float minDishKcal = Float.min(dish1, dish2);
    float minDesertKcal = Float.min(desert1, desert2);

    return minDishKcal + minDesertKcal;
}

private static void checkKcal(Float catKcal) {
    if (catKcal == null) {
        System.out.println("Что-то пошло не так");
    } else {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
    }
}

