package win.bezahive.beza_np.model;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "child")
public class Child {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = true)
    private String name;
    //add age field
    private int age;
    // add Create date
    @Column(name = "created_date", nullable = true)
    @CreatedDate
    private Date createdDate;
    // add update date
    @Column(name = "updated_date", nullable = true)
    @UpdateTimestamp
    private Date updatedDate;

    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL)

    private List<Activity> activities;


}
