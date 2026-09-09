import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню зоопарка");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное в список");
            System.out.println("3. Удалить животное из списка");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить, есть ли животное в зоопарке");
            System.out.println("0. Выйти");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст.");
                    } else {
                        System.out.println("Животные в зоопарке (" + animals.size() + "):");
                        for (String animal : animals) {
                            System.out.println("- " + animal);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Введите название животного для добавления: ");
                    String newAnimal = scanner.nextLine();
                    animals.add(newAnimal);
                    System.out.println("Животное \"" + newAnimal + "\" добавлено.");
                    break;

                case 3:
                    if (animals.isEmpty()) {
                        System.out.println("Список пуст. Нечего удалять.");
                    } else {
                        System.out.print("Введите название животного для удаления: ");
                        String removeAnimal = scanner.nextLine();
                        if (animals.remove(removeAnimal)) {
                            System.out.println("Животное \"" + removeAnimal + "\" удалено.");
                        } else {
                            System.out.println("Животное \"" + removeAnimal + "\" не найдено.");
                        }
                    }
                    break;

                case 4:
                    if (!animals.isEmpty()) {
                        animals.clear();
                        System.out.println("Список очищен.");
                    } else {
                        System.out.println("Список уже пуст.");
                    }
                    break;

                case 5:
                    System.out.print("Введите название животного для поиска: ");
                    String searchAnimal = scanner.nextLine();
                    if (animals.contains(searchAnimal)) {
                        System.out.println("Да, животное \"" + searchAnimal + "\" есть в зоопарке.");
                    } else {
                        System.out.println("Нет, животное \"" + searchAnimal + "\" не найдено.");
                    }
                    break;

                case 0:
                    System.out.println("До свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
