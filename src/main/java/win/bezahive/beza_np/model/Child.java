package win.bezahive.beza_np.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


@Entity


public class child {
    @Id
    private String id;
    private String name;
}
