package sakupljanjedragulja01;

import java.util.Random;

public class Tragac extends ObjekatIgre {

    private Ranac ranac1;
    private static String smerKretanja = "";
    private static Random random = new Random();

    public Tragac() {
    }

    public Tragac(Ranac ranac1) {
        this.ranac1 = ranac1;
    }

    public Tragac(String naziv, int x, int y, Ranac ranac1) {
        super(naziv, x, y);
        this.ranac1 = ranac1;
    }

    public Ranac getRanac1() {
        return ranac1;
    }

    public void setRanac1(Ranac ranac1) {
        this.ranac1 = ranac1;
    }

    public static String getSmerKretanja() {
        return smerKretanja;
    }

    public static void setSmerKretanja(String sk) {
        if (sk.equalsIgnoreCase("dd") || sk.equalsIgnoreCase("gl")) {
            smerKretanja = sk;
        }
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        Tragac.random = random;
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

    public boolean pokupiDragulj(Rudnik rudnik) {
        return ranac1.smestaDragulj(rudnik.getTrzinaDragulja());
    }

    @Override
    public void izvrsiAkciju() {
        boolean horizontalno = random.nextBoolean();
        if (smerKretanja.equalsIgnoreCase("dd")) {
            if (horizontalno) {
                x++;
            } else {
                y++;
            }
        } else if (smerKretanja.equalsIgnoreCase("gl")) {
            if (horizontalno) {
                x--;
            } else {
                y++;
            }
        } else {
            System.out.println("Ovo ne bi trebalo da se desi! smer=" + smerKretanja);
        }
    }

    Object getRanac() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
