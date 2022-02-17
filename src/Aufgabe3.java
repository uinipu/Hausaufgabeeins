import java.util.Scanner;


public class Aufgabe3 {

   /* public Aufgabe3(){
        System.out.println("Wie viele Ziffern haben die Zahlen?");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        System.out.println("Die Ziffern der ersten Zahl sind:");
        int[] x=new int[10];
        for(int i=0;i<n;i++){
            x[i]=s.nextInt();
        }
        int[] y=new int[10];
        System.out.println("Die Ziffern der zweiten Zahl sind:");
        for(int i=0;i<n;i++){
            y[i]=s.nextInt();
        }
    }*/

    public void unu() {
        System.out.println("Wie viele Ziffern haben die Zahlen?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Die Ziffern der ersten Zahl sind:");
        int[] x = new int[10];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }

        int[] y = new int[10];
        System.out.println("Die Ziffern der zweiten Zahl sind:");
        for (int i = 0; i < n; i++) {
            y[i] = s.nextInt();
        }

        int p = 0;
        int[] result = new int[11];
        result[0] = -1;
        for (int i = n; i > 0; i--) {
            int a = x[i] + y[i] + p;
            if (a > 9) {
                p = a / 10;
                a = a % 10;
            } else
                p = 0;
            result[i] = a;
        }
        if (p != 0) {
            result[0] = p;
            for (int i = 0; i <= n; i++)
                System.out.print(result[i]);
        } else {
            for (int i = 1; i <= n; i++)
                System.out.print(result[i]);
        }
    }

    public void doi() {
        System.out.println("Wie viele Ziffern haben die Zahlen?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Die Ziffern der ersten Zahl sind:");
        int[] x = new int[10];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }

        int[] y = new int[10];
        System.out.println("Die Ziffern der zweiten Zahl sind:");
        for (int i = 0; i < n; i++) {
            y[i] = s.nextInt();
        }

        int p = 0;
        int[] result = new int[10];
        for (int i = n - 1; i >= 0; i--) {
            //int a=x[i]-y[i];
            if (x[i] - y[i] < 0) {
                x[i - 1] -= 1;
                int b = 10 + x[i];
                result[i] = b - y[i];
            } else
                result[i] = x[i] - y[i];
        }

        if (result[0] != 0) {
            for (int i = 0; i < n; i++)
                System.out.print(result[i]);
        } else {
            for (int i = 1; i < n; i++)
                System.out.print(result[i]);
        }
    }

    public void trei() {
        System.out.println("Wie viele Ziffern hat die Zahl?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Die Ziffern der ersten Zahl sind:");
        int[] x = new int[10];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }

        int a;
        System.out.println("Die zweite Zahl ist:");
        a = s.nextInt();

        int p = 0;
        int[] result = new int[10];
        for (int i = n - 1; i >= 0; i--) {
            if (x[i] * a + p > 10) {
                result[i] = (x[i] * a + p) % 10;
                p = (x[i] * a + p) / 10;
            } else {
                result[i] = x[i] * a + p;
                p = 0;
            }

        }


        for (int i = 0; i < n; i++)
            System.out.print(result[i]);

    }

    public void patru() {
        System.out.println("Wie viele Ziffern hat die Zahl?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Die Ziffern der ersten Zahl sind:");
        int[] x = new int[10];
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
        }

        int a;
        System.out.println("Die zweite Zahl ist:");
        a = s.nextInt();

        int[] result = new int[10];
        int p=0;

        for (int i = 0; i < n; i++) {
            result[i]=(p*10+x[i])/a;
            p=x[i]%a;
        }


       for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
        }
    }
}
