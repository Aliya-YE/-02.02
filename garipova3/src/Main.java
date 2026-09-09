import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> speeds = new ArrayList<>(); // объявите список
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (int speed : speeds) {
            sum += speed;
            ;  // сложите все значения в списке
        }

        double averageSpeed = (double) sum / speeds.size(); // вычислите среднюю скорость
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");

        }
    }
