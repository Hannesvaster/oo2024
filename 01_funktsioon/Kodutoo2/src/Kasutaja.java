public class Kasutaja {
    String nimi;
    boolean aktiivne;
    int vanus;
    char lyhend;
    double raha;

    // parem klops + generate + constructor shift vali koik
    public Kasutaja(String nimi, boolean aktiivne, int vanus, char lyhend, double raha) {
        this.nimi = nimi;
        this.aktiivne = aktiivne;
        this.vanus = vanus;
        this.lyhend = lyhend;
        this.raha = raha;
    }

    public void muudaAktiivne() {
        aktiivne = !aktiivne;
    }
    public double muudaAktiivne() {
        raha = raha + summa;
        return raha;
    }

}
