public class Converter {
    double calories = 0.05;
    double kilometer = 0.0008;
    
    void convert(double stepsPerDay, int quantity) {
        while (true) {
        	if (quantity == 1) {
            	System.out.println("Сегодня вы потеряли: " + calories * stepsPerDay + " килокалорий");
		break;
        	} else if (quantity == 2) {
            	System.out.println("Сегодня вы прошли: " + kilometer * stepsPerDay + "километров");
		break;
        	} else {
            	System.out.println("Неверный ввод, повторите команду");
       		}
        }
    }
}