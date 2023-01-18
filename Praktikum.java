import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Converter converter = new Converter();
	MonthData monthData = new MonthData();
	StepTracker stepTracker = new StepTracker();
	int rate = 10000;
	int stepPerDay = 0;
    	While (true) {
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
			stepTracker.inputStat(int mount, int day, int stepPerDay);
			
			}
			
			

			//
    public static void printMenu() {
        System.out.println("Здравствуйте. Что вы хотите сделать? ");
        System.out.println("1 - Ввести цель для колличества шагов за день.");
        System.out.println("2 - Ввести количество шагов пройденное за день.");
        System.out.println("3 - Вывод статистики за месяц.");
        System.out.println("0 - Выход.");
    }



