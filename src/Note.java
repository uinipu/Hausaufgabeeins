public class Note {
    int wert;

    public Note(int wert){
        this.wert=wert;
    }

    public boolean wirdaufgerundet(){
        if(this.wert<38)
            return false;
        return true;
    }

    public boolean istausreichend(){
        if(this.wert>=40)
            return false;
        return true;
    }

    public int nachstv5(int x){
        int y=x;
        while(y%5!=0)
            y++;
        return y;
    }

    public int aufrunden(){
        if(nachstv5(this.wert)-this.wert<3)
            return nachstv5(this.wert);
        return this.wert;
    }
}
