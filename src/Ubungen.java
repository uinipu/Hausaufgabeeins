import java.util.Scanner;
//import Hausaufgabeeins.Note;

public class Ubungen {
    Note[] noten;
    int anz;

    public Ubungen(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Wie viele Noten?");
        n=s.nextInt();
        Note[] liste=new Note[10];

        System.out.println("Geben Sie die Noten ein:");
        for(int i=0;i<n;i++){
            liste[i].wert=s.nextInt();
        }
        this.anz=n;
        this.noten=liste;

    }

    public void ub1(){
        for(int i=0;i<this.anz;i++){
            if(noten[i].wirdaufgerundet()==true)
                noten[i].aufrunden();
        }
        Note[] nichtgenug=new Note[10];
        int j=0;
        for(int i=0;i<this.anz;i++){
            if(noten[i].istausreichend()==false)
                nichtgenug[j++]=noten[i];
        }
        int k=0;
        for(k=0;k<j-1;k++) {
            System.out.print(nichtgenug[k]);
            System.out.print(", ");
        }
        System.out.print(nichtgenug[k]);
    }
}
