
public class Main {
    public static void main(String[] args) {
        Hoidla hoidla = new Hoidla(5);

        Eksemplar eksemplar1 = new Eksemplar("Eksemplar 1");
        Eksemplar eksemplar2 = new Eksemplar("Eksemplar 2");

        hoidla.lisaEksemplar(eksemplar1);
        hoidla.lisaEksemplar(eksemplar2);

        hoidla.kuvaEksemplarid();
    }
}
