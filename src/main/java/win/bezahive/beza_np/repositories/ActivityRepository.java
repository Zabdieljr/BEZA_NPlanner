package win.bezahive.beza_np.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import win.bezahive.beza_np.model.Activity;
@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
}