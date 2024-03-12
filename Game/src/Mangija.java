import java.util.Random;

public class Mangija {
    int xCoord;
    int yCoord;
    char symbol;
    Suund suund;

    public Mangija(Random random, int kaardiKorgus, int kaardiLaius){
        xCoord = saaKoordinaat(random, kaardiLaius);
        yCoord = saaKoordinaat(random, kaardiKorgus);
        symbol = 'X';
        suund = Suund.YLES;
    }
    public void liigu(String sisend, Maailm maailm) {
        switch (sisend) {
            case "w" -> suund = Suund.YLES;
            case "s" -> suund = Suund.ALLA;
            case "a" -> suund = Suund.VASAK;
            case "d" -> suund = Suund.PAREM;
        } // switch()
        switch (suund) {
        case YLES -> {
            if(yCoord > 1) yCoord--;
        }
        case ALLA -> {
            if (yCoord < maailm.kaardiKorgus - 1) yCoord++;
        }
        case VASAK -> {
            if (xCoord > 1) xCoord--;
        }
        case PAREM -> {
            if (yCoord < maailm.kaardiLaius - 1) xCoord++;
        }
    } // public void liigu


    private int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }
} //mangija

