


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    //Array som holder bilene
    public final List<Motorvogn> motorvognregister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(Motorvogn bil){
        motorvognregister.add(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle() { return  motorvognregister; }
}
