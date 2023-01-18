public class MonthData {
	int[] stepPerMonth = new int[12];
		
	void entryDataMonthly(double stepPerDay, int month) {
		stepPerMonth[month - 1] = stepPerMonth[month - 1] + stepPerDay
	} 
