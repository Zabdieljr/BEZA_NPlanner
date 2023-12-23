package win.bezahive.beza_np.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import win.bezahive.beza_np.model.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

}