import java.util.Scanner;

public class tekSayiToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int n;
        do {
            System.out.print("Sayı giriniz: ");
            n = scan.nextInt();
            if (n % 2 == 1) {
                total += n;
            }
        } while (n >= 0);
        System.out.println("Toplam: " + total);


    }
}
