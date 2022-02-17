import java.util.Scanner;

public class Aufgabe4 {
    int mariusbuget;
    EleShop altex = new EleShop();

    public Aufgabe4() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Wie viel Geld hat Marius?");
        int m = sca.nextInt();
        mariusbuget = m;
    }

    public int unos() {
        int min = altex.usb[0];
        for (int i = 1; i < altex.n; i++) {
            if (altex.usb[i] < min)
                min = altex.usb[i];
        }
        System.out.println("Der billigste USB ist:");
        return min;
    }

    public int dos() {
        int max = altex.usb[0];
        for (int i = 1; i < altex.n; i++) {
            if (altex.usb[i] > max)
                max = altex.usb[i];
        }
        for (int i = 0; i < altex.m; i++) {
            if (altex.tastatur[i] > max)
                max = altex.tastatur[i];
        }
        System.out.println("Der teuerste Gegenstand ist:");
        return max;
    }

    public int tres() {
        int max = 0;
        for (int i = 1; i < altex.n; i++) {
            if (altex.usb[i] > max && altex.usb[i] <= mariusbuget)
                max = altex.usb[i];
        }
        System.out.println("Der teuerste USB, den Marius kaufen kann ist:");
        return max;
    }

    public void cuatro() {
        int max = 0, sem = -1;
        for (int i = 0; i < altex.n; i++)
            for (int j = 0; j < altex.m; j++) {
                if (altex.usb[i] + altex.tastatur[j] > max && altex.usb[i] + altex.tastatur[j] <= mariusbuget) {
                    max = altex.usb[i] + altex.tastatur[j];
                    sem = 1;
                }
            }
        System.out.println("Der maximale Geldbetrag, den Marius ausgeben kann(um beides zu kaufen), ist:");
        if (sem != 1)
            System.out.println("-1");
        else
            System.out.println(max);

    }

}
