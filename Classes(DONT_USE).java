//Sources: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://stackoverflow.com/questions/52301869/count-the-number-of-objects-created-by-java
// https://www.javatpoint.com/string-concatenation-in-java
// https://www.w3schools.com/java/java_constructors.asp

import java.util.Random; 

abstract class Animal{
    private String name;
    private String aniType;
    //Every animal will have an id attribute to uniquely identify them. It will correlate to when they created with respect to the other animals.
    private int aniID;
    private static int aniCount = 0;
    
    public void wakeUp(){
        System.out.println(this.name + " the " + this.aniType + " wakes up.");
    }
    
    public void makeNoise(){
        System.out.println(this.name  + " the " + this.aniType + " makes a noise.");
    }
    
    public void eat(){
        System.out.println(this.name  + " the " + this.aniType + " eats.");
    }
    
    public void roam(){
        System.out.println(this.name  + " the " + this.aniType + " roams.");
    }
    
    public void sleep(){
        System.out.println(this.name  + " the " + this.aniType + " sleeps.");
    }
    
    
    //Getter and setter functions for the private name and animal-type attributes of the object (encapsulation).
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
        
    }
    
    public String getAniType(){
        return aniType;
    }
    
    public void setAniType(String newAniType){
        aniType = newAniType;
    }
    
    public void setAniID(){
        aniCount++;
        aniID = aniCount;
    }
    
    public int getAniID(){
        return aniID;
    }
    
}

// NOTE: For all random chance events below, the int variable chance will be between 1 and 100 inclusive.

class Feline extends Animal{
    
    //Unique version of sleep for felines (polymorphism). Implements the random chance aspect required by instructions.
    public void sleep(){
        Random rand = new Random(); 
        //Generates random number from 1-100
        int chance = rand.nextInt(100) + 1;
        //If chance is between 1 and 30 (30% chance), the feline will roam.
        if (chance <= 30){
            this.roam();
        }
        //If chance is between 31 and 60 (30% chance), the feline will make noise.
        else if (chance > 30 && chance <=60){
            this.makeNoise();
        }
        //Otherwise, the feline will sleep (40% chance).
        else{
            String aniName = this.getName();
            String aniType = this.getAniType();
            System.out.println(aniName + " the " + aniType + " sleeps.");
        }
    }
    
    //Unique version of make noise for felines (polymorphism).
    public void makeNoise(){
        String aniName = this.getName();
        System.out.println(aniName + " purrs.");
    }
    
}

//NOTE: Only create 2 of each type of animal. If you create more than 2, you will get an out of bounds error for the name setting. If you want to make more, append more names to the end of the nameChoice list.

class Tiger extends Feline{

    private static int numAni = 0; 
    private String[] nameChoice = {"Tina", "Tony"};
  
    
    public Tiger(){ 
        //Assign name according to the number of lions created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Tiger");
        this.setAniID();
        numAni++;
    }
    
}

class Cat extends Feline{
    
    private static int numAni = 0; 
    private String[] nameChoice = {"Charlie", "Carly"};
    
    public Cat(){
        //Assign name according to the number of cats created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Cat");
        this.setAniID();
        numAni++;
    }
    
}

class Lion extends Feline{
    
    private static int numAni = 0;
    String[] nameChoice = {"Leo", "Lily"};
    
    public Lion(){
        //Assign name according to the number of lions created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Lion");
        this.setAniID();
        numAni++;
    }
}

class Pachyderm extends Animal{
    
    //Unique version of roam for Pachyderms. Implements the random chance aspect required.
    public void roam(){
        Random rand = new Random(); 
        String aniName = this.getName();
        String aniType = this.getAniType();
        //Chance will be a number between 1 and 100
        int chance = rand.nextInt(100) + 1;
        //25% chance that the pachyderm will charge
        if (chance <= 25){
            System.out.println(aniName + " the " +  aniType + " charges.");
        }
        //75% chance the method works as originally intended.
        else{
            System.out.println(aniName + " the " +  aniType + " roams.");
        }
    }
}

//NOTE: I've implemented a unique version of makeNoise() for each subtype of pachyderm. Each one should make their own sound.

class Rhino extends Pachyderm{
    
    private static int numAni = 0;
    String[] nameChoice = {"Robbie", "Ryan"};
    
    public Rhino(){
        //Assign name according to the number of rhinos created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Rhino");
        this.setAniID();
        numAni++;
    }
    
    public void makeNoise(){
        String aniName = this.getName();
        String aniType = this.getAniType();
        System.out.println(aniName + " the " + aniType + " grunts.");
    }
    
}

class Hippo extends Pachyderm{
    
    private static int numAni = 0;
    String[] nameChoice = {"Harry", "Hannah"};
    
    public Hippo(){
        //Assign name according to the number of hippos created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Hippo");
        this.setAniID();
        numAni++;
    }
    
    public void makeNoise(){
        String aniName = this.getName();
        String aniType = this.getAniType();
        System.out.println(aniName + " the " + aniType + " groans.");
    }
    
}

class Elephant extends Pachyderm{
    
    private static int numAni = 0;
    String[] nameChoice = {"Ellie", "Evan"};
    
    public Elephant(){
        //Assign name according to the number of elephants created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Elephant");
        this.setAniID();
        numAni++;
    }
    
    public void makeNoise(){
        String aniName = this.getName();
        String aniType = this.getAniType();
        System.out.println(aniName + " the " + aniType + " trumpets.");
    }
    
}

class Canine extends Animal{
    
    //Unique version of makeNoise() method for Canines. All subtypes will growl.
    public void makeNoise(){
        String aniName = this.getName();
        String aniType = this.getAniType();
        System.out.println(aniName + " the " + aniType + " growls.");
    }
    
}

class Dog extends Canine{
    
    private static int numAni = 0;
    String[] nameChoice = {"Doug", "Dina"};
    
    public Dog(){
        //Assign name according to the number of dogs created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Dog");
        this.setAniID();
        numAni++;
    }
    
    //Unique version of roam() for dogs. Implements random chance aspect noted in requirements.
    public void roam(){
        Random rand = new Random(); 
        String aniName = this.getName();
        String aniType = this.getAniType();
        int chance = rand.nextInt(100) + 1;
        //25% chance the dog will dig.
        if (chance <= 25){
            System.out.println(aniName + " the " + aniType + " digs.");
        }
        //75% chance that the dog will roam normally.
        else{
            System.out.println(aniName + " the " + aniType + " roams.");
            
        }
    }
    
}

class Wolf extends Canine{
    
    private static int numAni = 0;
    String[] nameChoice = {"Will", "Wyatt"};
    
    public Wolf(){
        //Assign name according to the number of wolves created (max 2).
        this.setName(nameChoice[numAni]); 
        this.setAniType("Wolf");
        this.setAniID();
        numAni++;
    }
    
}

class Cervidae extends Animal{
    
    //Unique makeNoise() version for the Cervidae class. All subclasses will bellow.
    public void makeNoise(){
        String aniName = this.getName();
        String aniType = this.getAniType();
        System.out.println(aniName + " the " + aniType + " bellows.");
    }
    
}

class Moose extends Cervidae{

    private static int numAni = 0;
    String[] nameChoice = {"Manny", "Miles"};
    
    public Moose(){
        //Assign name according to the number of mooses created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Moose");
        this.setAniID();
        numAni++;
    }
}

class Caribou extends Cervidae{
    
    private static int numAni = 0;
    String[] nameChoice = {"Carl", "Carole"};
    
    public Caribou(){
        //Assign name according to the number of caribou created (max 2).
        this.setName(nameChoice[numAni]);
        this.setAniType("Caribou");
        this.setAniID();
        numAni++;
    }
}

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
