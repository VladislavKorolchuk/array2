import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String str = Arrays.toString(arr);
        int sum = 0; // Сумма трат за весь период
        int minWaste = 0; // Минимальное значение трат
        int maxWaste = 0; // Максимальное значение трат
        for (int i : arr) {
            sum = sum + i;
            if (i > maxWaste) { // Вычисление максимальной траты
                maxWaste = i;
            }
        }
        minWaste = maxWaste;  // Вычисление минимальной траты
        for (int i : arr) {
            if (i < minWaste) {
                minWaste = i;
            }
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxWaste + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", (float) sum / arr.length) + " рублей");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        int size = reverseFullName.length;
        for (int i = 0; i < size / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[size - 1 - i];
            reverseFullName[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }

    // Метод генерации случайный чисел для массива arr
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}