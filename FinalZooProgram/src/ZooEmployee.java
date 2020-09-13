//Source: https://www.w3schools.com/java/java_arraylist.asp

import java.util.ArrayList;

//Abstract class for all types of zoo employees. Has the attributes and methods expected of employee types as well as the getter/setter methods for said attributes.
public abstract class ZooEmployee{

    //Employee's name, wage, role, and id are private attributes (encapsulation). These values should not be easily accessible as their values do not often change (or at all in the case of name).
    private String name;
    private float wage;
    private String role;
    //Every employee will have an id attribute to identify them. It will correlate to when they created with respect to the other employees.
    private String empID;
    private static int empCount = 0;

    //clockIn and clockOut will be utilized to notify the user that the zookeeper has arrived on day X. They should be used in conjunction with a string indicating the day in main.

    public String clockIn(){
        return(this.role + " arrives at Zoo ");
    }

    public String clockOut(){
        return(this.role + " goes home ");
    }

    //Getter and setter functions for ZooEmployee's private attributes (abstraction).
    public void setName(String empName){
        name = empName;
    }

    public String getEmpName(){
        return name;
    }

    public void setWage(float curWage){
        wage = curWage;
    }

    public float getWage(){
        return wage;
    }

    public void setRole(String empRole){
        role = empRole;
    }

    public String getRole(){
        return role;
    }

    //Employee ID's will have EMP at the front to distinguish them from the animals' IDs.
    public void setEmpID(){
        empCount++;
        empID = "EMP" + empCount;
    }

    public String getEmpID(){
        return empID;
    }


}

class Zookeeper extends ZooEmployee{

    public Zookeeper(String name, float wage){
        this.setName(name);
        this.setWage(wage);
        this.setRole("Zookeeper");
        this.setEmpID();
    }

    //Methods below provide abstraction for the responsibilities expected of the zookeeper (feed animals, wake them up, put them to sleep, etc.)
    //The methods below will take in an arraylist of animals, iterate through them, and perform the appropriate action on them.
    //Each method will also announce that the zookeeper is performing said action on the current animal in the arraylist
    //The methods will return the actions of both the zookeeper and each animal in an arraylist.

    public ArrayList<String> wakeAnimals(ArrayList<Animal> zoo){
        int len = zoo.size();
        ArrayList<String> actions = new ArrayList<>();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            String zkAction = this.getRole() + " wakes up " + aniName + " the " + aniType +".";
            String aniAction = zoo.get(i).wakeUp();
            actions.add(zkAction);
            actions.add(aniAction);
        }
        return(actions);
    }

    public ArrayList<String> rollCall(ArrayList<Animal> zoo){
        int len = zoo.size();
        ArrayList<String> actions = new ArrayList<>();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            String zkAction = this.getRole() + " calls out to " + aniName + " the " + aniType + ".";
            String aniAction = zoo.get(i).makeNoise();
            actions.add(zkAction);
            actions.add(aniAction);
        }
        return(actions);
    }

    public ArrayList<String> feed(ArrayList<Animal> zoo){
        int len = zoo.size();
        ArrayList<String> actions = new ArrayList<>();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            String zkAction = this.getRole() + " feeds " + aniName + " the " + aniType + ".";
            String aniAction = zoo.get(i).eat();
            actions.add(zkAction);
            actions.add(aniAction);
        }
        return(actions);
    }

    public ArrayList<String> exercise(ArrayList<Animal> zoo){
        int len = zoo.size();
        ArrayList<String> actions = new ArrayList<>();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            String zkAction = this.getRole() + " orders " + aniName + " the " + aniType + " to go roam.";
            String aniAction = zoo.get(i).roam();
            actions.add(zkAction);
            actions.add(aniAction);
        }
        return(actions);
    }

    public ArrayList<String> putToSleep(ArrayList<Animal> zoo){
        int len = zoo.size();
        ArrayList<String> actions = new ArrayList<>();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            String zkAction = this.getRole() + " puts " + aniName + " the " + aniType + " to sleep.";
            String aniAction = zoo.get(i).sleep();
            actions.add(zkAction);
            actions.add(aniAction);
        }
        return(actions);
    }

}
