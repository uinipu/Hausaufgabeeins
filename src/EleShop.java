import java.util.Scanner;

public class EleShop {
    int[] usb = new int[10];
    int[] tastatur = new int[10];
    int n, m;

    public EleShop() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele USBs gibt es?");
        this.n = scanner.nextInt();
        System.out.println("Die Preise der USBs sind:");
        for (int i = 0; i < this.n; i++) {
            this.usb[i] = scanner.nextInt();
        }
        System.out.println("Wie viele Tastaturen gibt es?");
        this.m = scanner.nextInt();
        System.out.println("Die Preise der Tastaturen sind:");
        for (int i = 0; i < this.m; i++) {
            this.tastatur[i] = scanner.nextInt();
        }

    }
}
