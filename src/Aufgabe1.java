import java.util.Scanner;
//import Hausaufgabeeins.Note;

public class Aufgabe1 {
    Note[] noten;
    int anz;

    public Aufgabe1() {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Wie viele Noten?");
        n = s.nextInt();
        Note[] liste = new Note[10];

        System.out.println("Geben Sie die Noten ein:");
        for (int i = 0; i < n; i++) {
            Note x = new Note(s.nextInt());
            //x.wert=s.nextInt();
            liste[i] = x;
        }
        this.anz = n;
        this.noten = liste;

    }

    public void a1ub1() {
        for (int i = 0; i < this.anz; i++) {
            if (noten[i].wirdaufgerundet() == true)
                noten[i].aufrunden();
        }
        Note[] nichtgenug = new Note[10];
        int j = 0;
        for (int i = 0; i < this.anz; i++) {
            if (noten[i].istausreichend() == false)
                nichtgenug[j++] = noten[i];
        }
        int k = 0;
        System.out.println("Die nicht ausreichenden Noten sind:");
        for (k = 0; k < j - 1; k++) {
            System.out.print(nichtgenug[k].wert);
            System.out.print(", ");
        }
        System.out.print(nichtgenug[k].wert);
    }

    public int a1ub2() {
        int s = 0;
        for (int i = 0; i < this.anz; i++) {
            s += this.noten[i].wert;
        }
        System.out.println("Die Mittelnote ist: ");
        return s / this.anz;
    }

    public void a1ub3() {
        System.out.println("Die abgerundeten Noten sind:");
        for (int i = 0; i < this.anz; i++) {
            if (noten[i].wirdaufgerundet() == true) {
                System.out.print(noten[i].aufrunden());
                System.out.print(" ");
            } else {
                System.out.print(noten[i].wert);
                System.out.print(" ");
            }
        }

    }

    public int a1ub4() {
        int max = 0;
        for (int i = 0; i < this.anz; i++) {
            if (noten[i].wirdaufgerundet() == true)
                if (noten[i].aufrunden() > max && noten[i].aufrunden() != noten[i].wert)
                    max = noten[i].aufrunden();
        }
        System.out.println("Die maximale abgerundete Note ist:");
        return max;
    }

    //public
}
