
package sakupljanjedragulja01;


public abstract class ObjekatIgre implements Comparable<ObjekatIgre>{
     private String naziv; // naziv Objekta
     protected int x;
     protected int y;

    public ObjekatIgre() {
    }

    public ObjekatIgre(String naziv, int x, int y) {
        this.naziv = naziv;
        this.x = x;
        this.y = y;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ObjekatIgre{" + "naziv=" + naziv + ", x=" + x + ", y=" + y + '}';
    }
     public abstract void izvrsiAkciju();
     
     @Override
     public int compareTo(ObjekatIgre o){
         
      return 1;   
     }
}
