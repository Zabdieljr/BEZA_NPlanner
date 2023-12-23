package win.bezahive.beza_np.services;

import org.springframework.stereotype.Service;
import win.bezahive.beza_np.model.Child;
import win.bezahive.beza_np.repositories.ChildRepository;

import java.util.List;

@Service
public class ChildService {

    //add repository
    private final ChildRepository childRepository;


    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    //add methods

    public List<Child> getAllChildren() {
        System.out.println("All children in Repo: " + childRepository.findAll());
        return childRepository.findAll();
    }

    public Child getChildById(Long id) {
        return childRepository.findById(id).orElseThrow(() -> new RuntimeException("Child not found"));
    }

    public Child createChild(Child child) {
        return childRepository.save(child);
    }

    public Child updateChild(Long id, Child child) {
        Child existingChild = getChildById(id);
        existingChild.setName(child.getName());
        existingChild.setAge(child.getAge());
        return childRepository.save(existingChild);
    }

    public void deleteChild(Long id) {
        childRepository.deleteById(id);
    }


}
