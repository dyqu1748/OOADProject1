abstract class ZooEmployee{

    private String name;
    private float wage;
    private String role;
    //Every employee will have an id attribute to identify them. It will correlate to when they created with respect to the other employees.
    private int empID;
    private static int empCount = 0;

    public void clockIn(){
        System.out.println(this.role + " arrives ");
    }

    public void clockOut(){
        System.out.println(this.role + " goes home ");
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

    public void setEmpID(){
        empCount++;
        empID = empCount;
    }

    public int getEmpID(){
        return empID;
    }


}

class Zookeeper extends ZooEmployee{
    //Should take in an array/list of animals and iterate through them

    public Zookeeper(String name, int wage){
        this.setName(name);
        this.setWage(wage);
        this.setRole("Zookeeper");
        this.setEmpID();
    }

    public void wakeAnimals(Animal[] zoo){
        for (int i = 0; i < zoo.length; i++){
            String aniName = zoo[i].getName();
            String aniType = zoo[i].getAniType();
            System.out.println(this.getRole() + " wakes up " + aniName + " the " + aniType +".");
            zoo[i].wakeUp();
        }
    }

    public void rollCall(Animal[] zoo){
        for (int i = 0; i < zoo.length; i++){
            String aniName = zoo[i].getName();
            String aniType = zoo[i].getAniType();
            System.out.println(this.getRole() + " calls out to " + aniName + " the " + aniType + ".");
            zoo[i].makeNoise();
        }
    }

    public void feed(Animal[] zoo){
        for (int i = 0; i < zoo.length; i++){
            String aniName = zoo[i].getName();
            String aniType = zoo[i].getAniType();
            System.out.println(this.getRole() + " feeds " + aniName + " the " + aniType + ".");
            zoo[i].eat();
        }
    }

    public void exercise(Animal[] zoo){
        for (int i = 0; i < zoo.length; i++){
            String aniName = zoo[i].getName();
            String aniType = zoo[i].getAniType();
            System.out.println(this.getRole() + " orders " + aniName + " the " + aniType + " to go roam.");
            zoo[i].roam();
        }
    }

    public void putToSleep(Animal[] zoo){
        for (int i = 0; i < zoo.length; i++){
            String aniName = zoo[i].getName();
            String aniType = zoo[i].getAniType();
            System.out.println(this.getRole() + " puts " + aniName + " the " + aniType + " to sleep.");
            zoo[i].sleep();
        }
    }

}