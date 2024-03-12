
class Hoidla {
    private Eksemplar[] eksemplarid;
    private int maksimumEksemplarid;

    public Hoidla(int maksimumEksemplarid) {
        this.maksimumEksemplarid = maksimumEksemplarid;
        this.eksemplarid = new Eksemplar[maksimumEksemplarid];
    }

    public void lisaEksemplar(Eksemplar eksemplar) {
        for (int i = 0; i < maksimumEksemplarid; i++) {
            if (eksemplarid[i] == null) {
                eksemplarid[i] = eksemplar;
                System.out.println("Eksemplar lisatud hoidlasse.");
                return;
            }
        }
        System.out.println("Hoidla on täis, ei saa lisada uut eksemplari.");
    }

    public void kuvaEksemplarid() {
        for (int i = 0; i < maksimumEksemplarid; i++) {
            if (eksemplarid[i] != null) {
                System.out.println("Eksemplar " + (i + 1) + ": " + eksemplarid[i]);
            }
        }
    }
}
