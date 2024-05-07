package ee.tlu.Kontrolltoo2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "auto")
@Entity
@NoArgsConstructor
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String mark;
    private double pikkus;
    private double kaal;
    private int aasta;

//    public AutoEntity(String tootja, String mudel, int aasta, int labisoit) {
//        this.tootja = tootja;
//        this.mudel = mudel;
//        this.aasta = aasta;
//        this.labisoit = labisoit;
//    }
}
