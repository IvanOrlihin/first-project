public class stepTracker {
	int [][] data = new int [12][31];
	void inputStat(int mount, int day, int stepPerDay) {
		if (month < 1 || month > 12 || day < 1 || day > 31) {
		data [mount - 1][day - 1] = data [mount - 1][day - 1] + stepPerDay;
		} else { 
		System.out.println("	
	void queryStat(int mount, int day) {
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