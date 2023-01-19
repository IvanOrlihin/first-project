import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Converter converter = new Converter();
	StepTracker stepTracker = new StepTracker();
	int rate = 10000;
	int stepPerDay = 0;
    	while (true) {
            printMenu();
            if (command == 1) {
			System.out.println("Введите новую цель:");
			int rate = scanner.nextInt();
			}
            if (command == 2) {
			System.out.println("Какой сегодня месяц?");
			int month = scanner.nextInt();
			System.out.println("Какое сегодня число?");
			int day = scanner.nextInt();
			System.out.println("Сколько шагов вы прошли за сегодняшний день?");
			int stepPerDay = scanner.nextInt();
			stepTracker.inputStat(month, day, stepPerDay);
			stepTracker.dailyRate(rate, stepPerDay);
			}
            if (command == 3) {
			System.out.println("За какой месяц вывести статистику?");
			int month = scanner.nextInt();
			stepTracker.queryStat(month);
            }
            if (command == 4) {
			System.out.println("1 - Вывести статистику в килокалориях.");
			System.out.println("2 - Вывести статистику в километрах.");
			int quantity = scanner.NextInt();
			converter.convert(stepsPerDay, quantity);
            }
            if (command == 0) {
			break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Здравствуйте. Что вы хотите сделать? ");
        System.out.println("1 - Ввести цель для колличества шагов за день.");
        System.out.println("2 - Ввести количество шагов пройденное за день.");
        System.out.println("3 - Вывод статистики за месяц.");
	System.out.println("4 - Вывод статистики за день в километрах и килокалориях.");
        System.out.println("0 - Выход.");
    }
}



