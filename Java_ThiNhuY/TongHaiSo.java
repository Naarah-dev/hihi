import java.util.Scanner;
//for review
public class TongHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();

        int tong = a + b;

        System.out.println("Tong hai so a va b = " + tong);

        scanner.close();
    }

}
