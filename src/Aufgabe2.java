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
        System.out.println("Welch sind die "+n+" Elemente?");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        this.array=array;
    }

    public int eins(){
        int max=this.array[0];
        for(int i=0;i<this.n;i++) {
            if(this.array[i]>max)
                max=this.array[i];
        }
        return max;
    }

    public int zwei(){
        int min=this.array[0];
        for(int i=0;i<this.n;i++) {
            if(this.array[i]<min)
                min=this.array[i];
        }
        return min;
    }

    public int sum(){
        int sum=0;
        for(int i=0;i<this.n;i++) {
            sum+=this.array[i];
        }
        return sum;
    }



    public int drei(){
        return this.sum()-this.zwei();
    }

    public int vier(){
        return this.sum()-this.eins();
    }


}
