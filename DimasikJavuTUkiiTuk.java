import java.util.Scanner;

public class DimasikJavuTUkiiTuk {
 public static double calculateFunction(int x, double a, double b) {
     double result = Double.NaN;

        // Використання оператора if для перевірки x
        if (x >= 1 && x <= 3) {
            switch (x) {
                case 1:
                case 2:  // Якщо x = 1 або 2
                    result = 9 / (a * x);
                    break;
                case 3:  // Якщо x = 3
                    result = (a * x * x + x + b) / x;
                    break;
                default:
                    result = Double.NaN;
            }
        } else {
            System.out.println("Значення x повинно бути в межах [1, 3]");
        }

        return result;
    }

    // Завдання 2: Підрахунок кількості речень у тексті з використанням while та do-while
    public static int countSentencesUsingWhile(String text) {
        int count = 0;
        int i = 0;
        String sentenceEndings = ".!?";

        // Використання циклу while
        while (i < text.length()) {
            if (sentenceEndings.indexOf(text.charAt(i)) != -1) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static int countSentencesUsingDoWhile(String text) {
        int count = 0;
        int i = 0;
        String sentenceEndings = ".!?";

        // Використання циклу do-while
        if (text.length() > 0) {
            do {
                if (sentenceEndings.indexOf(text.charAt(i)) != -1) {
                    count++;
                }
                i++;
            } while (i < text.length());
        }

        return count;
    }

    // Завдання 3: Виведення чисел у діапазоні з циклом for
    public static void printRangeWithoutMultiples(int start, int end, int primeNumber) {
        for (int number = start; number <= end; number++) {
            if (number % primeNumber == 0) {
                continue;  // Пропускаємо числа, кратні введеному простому числу
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 1: Обчислення значення функції f(x) з використанням if та switch-case
        System.out.println("Завдання 1: Обчислення значення функції f(x)");
        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть x (1, 2 або 3): ");
        int x = scanner.nextInt();
        double result = calculateFunction(x, a, b);
        if (!Double.isNaN(result)) {
            System.out.println("Результат: " + result);
        }

        // Завдання 2: Підрахунок кількості речень у введеному тексті з використанням while та do-while
        scanner.nextLine();  // Очищуємо буфер після вводу чисел
        System.out.println("\nЗавдання 2: Підрахунок кількості речень у тексті");
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        
        // Підрахунок з циклом while
        int sentenceCountWhile = countSentencesUsingWhile(text);
        System.out.println("Кількість речень (while): " + sentenceCountWhile);
        
        // Підрахунок з циклом do-while
        int sentenceCountDoWhile = countSentencesUsingDoWhile(text);
        System.out.println("Кількість речень (do-while): " + sentenceCountDoWhile);

        // Завдання 3: Виведення діапазону чисел з циклом for
        System.out.println("\nЗавдання 3: Виведення діапазону чисел");
        System.out.print("Введіть початковий діапазон: ");
        int start = scanner.nextInt();
        System.out.print("Введіть кінцевий діапазон: ");
        int end = scanner.nextInt();
        System.out.print("Введіть просте число (від 1 до 9): ");
        int primeNumber = scanner.nextInt();
        if (primeNumber == 2 || primeNumber == 3 || primeNumber == 5 || primeNumber == 7) {
            System.out.print("Числа в діапазоні (" + start + " - " + end + "), які не кратні " + primeNumber + ": ");
            printRangeWithoutMultiples(start, end, primeNumber);
        } else {
            System.out.println("Введено не просте число.");
        }

        scanner.close();
    }
}