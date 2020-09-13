//Source: https://www.w3schools.com/java/java_arraylist.asp

import java.util.ArrayList;

//Abstract class for all types of zoo employees. Has the attributes and methods expected of employee types as well as the getter/setter methods for said attributes.
abstract class ZooEmployee{

    private String name;
    private float wage;
    private String role;
    //Every employee will have an id attribute to identify them. It will correlate to when they created with respect to the other employees.
    private String empID;
    private static int empCount = 0;

    //clockIn and clockOut will be utilized to notify the user that the zookeeper has arrived on day X. They should be used in conjuction with a print statement in main.

    public String clockIn(){
        return(this.role + " arrives ");
    }

    public String clockOut(){
        return(this.role + " goes home ");
    }

    //Getter and setter functions for ZooEmployee's private attributes
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

    //Methods below provide abstraction for the responsibilities expected or the zookeeper (feed animals, wake them up, put them to sleep, etc.)
    //The methods below will take in an arraylist of animals, iterate through them, and perform the appropriate action on them.
    //Each method will also announce that the zookeeper is perfoming said action on the current animal in the arraylist

    public void wakeAnimals(ArrayList<Animal> zoo){
        int len = zoo.size();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            System.out.println(this.getRole() + " wakes up " + aniName + " the " + aniType +".");
            zoo.get(i).wakeUp();
        }
    }

    public void rollCall(ArrayList<Animal> zoo){
        int len = zoo.size();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            System.out.println(this.getRole() + " calls out to " + aniName + " the " + aniType + ".");
            zoo.get(i).makeNoise();
        }
    }

    public void feed(ArrayList<Animal> zoo){
        int len = zoo.size();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            System.out.println(this.getRole() + " feeds " + aniName + " the " + aniType + ".");
            zoo.get(i).eat();
        }
    }

    public void exercise(ArrayList<Animal> zoo){
        int len = zoo.size();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            System.out.println(this.getRole() + " orders " + aniName + " the " + aniType + " to go roam.");
            zoo.get(i).roam();
        }
    }

    public void putToSleep(ArrayList<Animal> zoo){
        int len = zoo.size();
        for (int i = 0; i < len; i++){
            String aniName = zoo.get(i).getName();
            String aniType = zoo.get(i).getAniType();
            System.out.println(this.getRole() + " puts " + aniName + " the " + aniType + " to sleep.");
            zoo.get(i).sleep();
        }
    }

}
