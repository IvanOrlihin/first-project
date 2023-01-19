public class stepTracker {
	int [][] data = new int [12][31];
    void inputStat(int month, int day, int stepPerDay) {
		while (true) {
			if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("Введено неверное значение, повторите опперацию ввода.");
			} else { 
			data [month - 1][day - 1] = data [month - 1][day - 1] + stepPerDay;
			stepPerDay = data [month - 1][day - 1];
			break;
			}
		}
	}
	void queryStat(int month) {
		while (true) {
			if (month < 1 || month > 12) {
			System.out.println("Введено неверное значение, повторите опперацию ввода.");
			} else {
				int sumPerMonth = 0;
				for (int i = 0; i < 32; i++) {
        			sumPerMonth = sumPerMonth + data [month - 1][i];
				System.out.println("Ваш результат за " + mount + " месяц = " + sumPerMonth);
				}	
			}
		}
	}	
	void dailyRate(int rate, int stepPerDay) {
		if (rate <= stepPerDay) {
			System.out.println("Цель в " + rate + " шагов, выполнена!");
		} else {
			System.out.println("Цель в " + rate + " шагов, не выполнена! Необходимо пройти еще " + rate - stepPerDay + " шагов.");	
		}
	}
}