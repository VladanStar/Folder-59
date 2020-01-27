package sakupljanjedragulja01;

public class Ranac {

    private int maxTezina;
    private int slobodnoTezina;

    public Ranac() {
    }

    public Ranac(int maxTezina, int slobodnoTezina) {
        this.maxTezina = maxTezina;
        this.slobodnoTezina = slobodnoTezina;
    }

    Ranac(double maxTezina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaxTezina() {
        return maxTezina;
    }

    public void setMaxTezina(int maxTezina) {
        this.maxTezina = maxTezina;
    }

    public int getSlobodnoTezina() {
        return slobodnoTezina;
    }

    public void setSlobodnoTezina(int slobodnoTezina) {
        this.slobodnoTezina = slobodnoTezina;
    }

    public boolean smestaDragulj(double tezina) {
        if (slobodnoTezina >= tezina) {
            slobodnoTezina -= tezina;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ranac{" + "maxTezina=" + maxTezina + ", slobodnoTezina=" + slobodnoTezina + '}';
    }
    

}
