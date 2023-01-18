public class stepTracker {
	int [][] data = new int [12][31];
	void inputStat(int mount, int day, int stepPerDay) {
		while (true) {
			if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("Введено неверное значение, повторите опперацию ввода.");
			} else { 
			data [mount - 1][day - 1] = data [mount - 1][day - 1] + stepPerDay;
			break;
			}
		}
	}
	void queryStat(int mount, int day) {
		while (true) {
		
		if (month < 1 || month > 12 || day < 1 || day > 31) {
		System.out.println("Ваш результат за " + day " число" + mount " месяца.");
	}	
	voif dailyRate(int rate, int stepPerDay) {
		if (rate <= stepPerDay) {
			System.out.println("Цель в " + rate + " шагов, выполнена!");
		} else {
			System.out.println("Цель в " + rate + " шагов, не выполнена! Необходимо пройти еще " + rate - stepPerDay + " шагов.");	
		}
	}
}