import java.util.Scanner;

public class EightCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String textTo = scanner.nextLine();
        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();
        scanner.nextLine();

        char[] textToCode = textTo.toCharArray();
        coding(textToCode, key);

        System.out.print("Текст после преобразования: ");
        System.out.println(textToCode);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine();

       while (!answer.equals("y") && !answer.equals("n")){
           System.out.println("Введите корректный ответ");
           answer = scanner.nextLine();
       }
        if (answer.equals("y")) {
            coding(textToCode, -key);
            System.out.println(textToCode);
        } else {
            System.out.println("До свидания!");
        }
    }
    private static void coding(char[] textToCode, int key) {
        for (int i = 0; i < textToCode.length; i++) {
            textToCode[i] = (char) (textToCode[i] + key);
        }
    }
}
