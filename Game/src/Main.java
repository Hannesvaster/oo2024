import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Maailm maailm = new Maailm(5, 10);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);

        Scanner scanner = new Scanner(System.in); // jrg tund selgitab

        prindiKaart(kaardiKorgus, kaardiLaius, mangija, draakon, ork);
        String sisend = scanner.nextLine();

        mangija.liigu(sisend);

        // if (boolean || andmebaasiKüsimine())
        // if (boolean && andmebaasiKüsimine())
        while (!sisend.equals("end")) { // .equals --> == !m.equals() --> !=
            prindiKaart(kaardiKorgus, kaardiLaius, mangija, draakon, ork);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);

        }

    } // main (args)

    private static void prindiKaart(int kaardiKorgus, int kaardiLaius, Mangija mangija, Draakon draakon, Ork ork) {
        for (int y = 0; y < kaardiKorgus; y++) {
            for (int x = 0; x < 10; x++) {
                char symbol;
                if (y == 0 || y == kaardiKorgus -1) {
                    //System.out.print('-');
                    symbol = '-';
                } else if (x == 0 || x == kaardiLaius -1) {
                    //System.out.print('|');
                    symbol = '|';
                } else {
                    if (x == mangija.xCoord && y == mangija.yCoord) {
                        symbol = mangija.symbol;
                    } else if (x == draakon.xCoord && y == draakon.YCoord) {
                        symbol = draakon.symbol;
                    }  else if (x == ork.xCoord && y == ork.yCoord) {
                        symbol = ork.symbol;
                    }   else {
                        symbol = ' ';
                    }
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }
} //main ()