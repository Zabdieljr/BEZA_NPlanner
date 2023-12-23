package win.bezahive.beza_np.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import win.bezahive.beza_np.model.Activity;
import win.bezahive.beza_np.model.Child;
import win.bezahive.beza_np.repositories.ActivityRepository;
import win.bezahive.beza_np.repositories.ChildRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    ChildRepository childRepository;
    @Autowired
    ActivityRepository activityRepository;

    @GetMapping("/home")
    public String displayIndex(Model model) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        List<Child> Children = childRepository.findAll();
        model.addAttribute("childrenlist", Children);


        List<Activity> activities = activityRepository.findAll();
        model.addAttribute("activitieslist", activities);

        return "home/index";




    }


}
