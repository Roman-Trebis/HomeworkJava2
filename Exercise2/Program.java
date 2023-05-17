package Exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * Задание 2. 
 * 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
*/

public class Program {
    
    public static void main(String[] args) throws IOException {
        int[] numbers = {5, 3, 8, 6, 4, 2, 1, 7};

        FileWriter fw = new FileWriter("log.txt");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                    fw.write("Iteration(Итерация) #" + (i+1) + ": " + Arrays.toString(numbers) + "\n");
                }
            }
        }
        fw.close();
    }
}