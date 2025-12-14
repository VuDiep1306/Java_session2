import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class session2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhap so nguyen n
        System.out.print("Nhập số nguyên n:");
        int n = scanner.nextInt();
        //kiem tra
        if (n == 0) {
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        } else if(n%2 == 0) {
            System.out.printf("Số %d là số chẵn.%n", n);
        } else {
            System.out.printf("Số %d là số lẻ.%n", n);
        }
        scanner.close();
    }
}