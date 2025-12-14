import java.util.Scanner;

public class session2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = -1;
        do {
            System.out.print("Nhập tuổi của bạn: ");
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
                continue;
            }
            try {
                age = Integer.parseInt(input);
                if (age <= 0) {
                    System.out.println("Vui lòng nhập vào một số nguyên  và lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0");
            }
        } while (age <= 0);
        System.out.printf("Tuổi của bạn là %d !%n", age);
        scanner.close();
    }
}
