package sakupljanjedragulja01;

public class Rudnik extends ObjekatIgre {

    private int otvorenJos;
    double trzinaDragulja;

    public Rudnik() {
    }

    public Rudnik(int otvorenJos, double trzinaDragulja) {
        this.otvorenJos = otvorenJos;
        this.trzinaDragulja = trzinaDragulja;
    }

    public Rudnik(String naziv, int x, int y,double trzinaDragulja, int vremeTrajanja) {
        super(naziv, x, y);
        this.otvorenJos = otvorenJos;
        this.trzinaDragulja = trzinaDragulja;
        vremeTrajanja = vremeTrajanja;
       
    }


    public int getOtvorenJos() {
        return otvorenJos;
    }

    public void setOtvorenJos(int otvorenJos) {
        this.otvorenJos = otvorenJos;
    }

    public double getTrzinaDragulja() {
        return trzinaDragulja;
    }

    public void setTrzinaDragulja(double trzinaDragulja) {
        this.trzinaDragulja = trzinaDragulja;
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

    public int getVremePostojanja() {
        return otvorenJos;
    }
    public boolean isOtvoren(){
        return otvorenJos > 0;
    }

    @Override
    public void izvrsiAkciju() {
        if(isOtvoren()){
        otvorenJos--;
    }
    }

}
