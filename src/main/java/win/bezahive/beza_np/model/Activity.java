package win.bezahive.beza_np.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Activity {

    // add id, name, description, day, hour, location, importance, and type
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "day", nullable = true)
    private String day;

    @Column(name = "hour", nullable = true)
    private String hour;

    @Column(name = "location", nullable = true)
    private String location;

    @Column(name = "importance", nullable = true)
    private String importance;

    @Column(name = "type", nullable = true)
    private String type;

    // jpa relationships many to one child
    @ManyToOne
    @JoinColumn(name = "child_id")
    private Child child;


}
