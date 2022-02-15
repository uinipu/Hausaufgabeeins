import java.util.Scanner;

public class Aufgabe2 {
    int n;
    int[] array;

    public Aufgabe2(){
        Scanner s=new Scanner(System.in);
        System.out.println("Wie viele Elemente in dem Array?");
        int n=s.nextInt();
        this.n=n;
        int[] array=new int[10];
        System.out.println("Welch sind die "+n+"Elemente?");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        this.array=array;
    }


}
