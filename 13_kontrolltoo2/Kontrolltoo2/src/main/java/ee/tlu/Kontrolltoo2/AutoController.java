package ee.tlu.Kontrolltoo2;

import ee.tlu.Kontrolltoo2.Auto;
import ee.tlu.Kontrolltoo2.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class AutoController {

    AutoRepository autoRepository;

    public AutoController(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    // localhost:8080/api/autod
    @GetMapping("autod")
    public List<Auto> saaAutod() {
        return autoRepository.findAll();
    }

    // localhost:8080/api/autod/Toyota/Avensis/2006/250321
    // localhost:8080/api/autod/Volvo/V70/2000/440123
    @PostMapping("autod")
    public List<Auto> lisaAuto(@RequestBody Auto autoEntity) {
        autoRepository.save(autoEntity);
        return autoRepository.findAll();
    }


}