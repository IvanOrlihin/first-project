public class Converter {
    double calories = 0,05;
    double kilometer = 0,0008;
    
    void convert(double stepsPerDay, int quantity) {
        if (quantity == 1) {
            System.out.println("Сегодня вы потеряли: " + calories * stepsPerDay + " килокалорий");
        } else if (quantity == 2) {
            System.out.println("Сегодня вы прошли: " + kilometer * stepsPerDay + "километров");
        } else {
            System.out.println("Неверный ввод, повторите команду");
        }
    }
}