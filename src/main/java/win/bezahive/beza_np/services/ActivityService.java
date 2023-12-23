package win.bezahive.beza_np.services;

import org.springframework.stereotype.Service;
import win.bezahive.beza_np.model.Activity;
import win.bezahive.beza_np.repositories.ActivityRepository;

import java.util.List;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;


    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    //add methods

    public List<Activity> getAllActivities() {
        System.out.println("All activities in Repo: " + activityRepository.findAll());
        return activityRepository.findAll();
    }

    public Activity getActivityById(Long id) {
        return activityRepository.findById(id).orElseThrow(() -> new RuntimeException("Activity not found"));
    }

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public Activity updateActivity(Long id, Activity activity) {
        Activity existingActivity = getActivityById(id);
        existingActivity.setName(activity.getName());
        existingActivity.setDescription(activity.getDescription());
        existingActivity.setDay(activity.getDay());
        existingActivity.setHour(activity.getHour());
        existingActivity.setLocation(activity.getLocation());
        existingActivity.setImportance(activity.getImportance());
        existingActivity.setType(activity.getType());
        return activityRepository.save(existingActivity);
    }

    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }


}
