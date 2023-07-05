import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class CrowdSourc{
    public static void main(String args[]){

        List<String> Tasks = new ArrayList<>(null);
        Tasks.add("t1");
        Tasks.add("t2");

        List<String> task1 = new ArrayList<>();
        task1.add("Teaching");
        task1.add("ChildCare");
        task1.add("Cokking");

        List<String> tasks2 = new ArrayList<>(null);
        tasks2.add("Teaching");
        tasks2.add("NutritionList");
        tasks2.add("Nursing");

        List<String> volunteers = new ArrayList<>();
        volunteers.add("v1");
        volunteers.add("v2");
        volunteers.add("v3");

         List<String> volunteer1 = new ArrayList<>();
        volunteers.add("Child-care");
        volunteers.add("Guitarist");
        volunteers.add("Nursing");
        
        List<String> volunteer2 = new ArrayList<>(null);
        volunteer2.add("Cooking");
        volunteer2.add("Nursing");
        volunteer2.add("Nutritionist");

        List<String> volunteer3 = new ArrayList<>(null);
        volunteer3.add("Cooking");
        volunteer3.add("Teaching");
        volunteer3.add("Nursing");


        Map<List<String>,List<String>> skillTaskMapper = new HashMap<>();
        skillTaskMapper.put(Tasks,task1);
        skillTaskMapper.put(Tasks,tasks2);

        Map<List<String>,List<String>> VolunteerSkillMapper = new HashMap<>();
        VolunteerSkillMapper.put(volunteers,volunteer1);
        VolunteerSkillMapper.put(volunteers, volunteer2);
        VolunteerSkillMapper.put(volunteers, volunteer3);

        Map<String,Integer> remuneration = new HashMap<>();
        remuneration.put("v1", 25);
        remuneration.put("v2",20);
        remuneration.put("v3", 30);
        
        Map<List<String>,List<String>> allocationMap = new HashMap<>();
        Map<List<String>,List<String>> Gst = new HashMap<>();

        String volunteer = findVolunteer(volunteers,remuneration);
    }
}
