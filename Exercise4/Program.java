package Exercise4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Предыдущее
/*
 * Задание 3. 
 * 3. Реализовать простой калькулятор
*/

//Следующее
/*
 * Задание 4. 
 * 4. К калькулятору из предыдущего ДЗ добавить логирование.
*/

public class Program {
    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.log(Level.INFO, "Начало работы программы");

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            // Сложение
            LOGGER.log(Level.INFO, "Сложение " + num1 + " и " + num2);
            System.out.println("Сложение: " + (num1 + num2));
  
            // Вычетание
            LOGGER.log(Level.INFO, "Вычитание " + num1 + " и " + num2);
            System.out.println("Вычетание: " + (num1 - num2));
  
            // Умножение
            LOGGER.log(Level.INFO, "Умножение " + num1 + " и " + num2);
            System.out.println("Умножение: " + (num1 * num2));
  
            // Деление
            LOGGER.log(Level.INFO, "Деление " + num1 + " на " + num2);
            System.out.println("Деление: " + (num1 / num2));
        }
        LOGGER.log(Level.INFO, "Завершение работы программы");
    }
}