import java.util.Random; 

class Animal{
    private String name;
    
    public void wakeUp(){
        System.out.println(this.name + " wakes up.");
    }
    
    public void makeNoise(){
        System.out.println(this.name + " makes a noise.");
    }
    
    public void eat(){
        System.out.println(this.name + " eats.");
    }
    
    public void roam(){
        System.out.println(this.name + " roams.");
    }
    
    public void sleep(){
        System.out.println(this.name + " sleeps.");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
        
    }
    
}

class Feline extends Animal{
    
    public void sleep(){
        Random rand = new Random(); 
        int chance = rand.nextInt(100) + 1;
        if (chance <= 30){
            // roam instead
            this.roam();
        }
        else if (chance > 30 && chance <=60){
            // make noise
            this.makeNoise();
        }
        else{
            // sleep
            String aniName = this.getName();
            System.out.println(aniName + " sleeps.");
        }
    }
    
    public void makeNoise(){
        String aniName = this.getName();
        System.out.println(aniName + " purrs.");
    }
    
}

public class Tiger extends Feline{
    //https://stackoverflow.com/questions/52301869/count-the-number-of-objects-created-by-java

    private String aniType = "Tiger";
    private static int numAni = 0; 
    private String[] nameChoice = {"Tina", "Tony"};
  
    
    public Tiger(){
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
}

public class Cat extends Feline{
    
    private String aniType = "Cat";
    private static int numAni = 0; 
    private String[] nameChoice = {"Charlie", "Carly"};
    
    public Cat(){
        //Assign name according to the number of cats created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
}

public class Lion extends Feline{
    
    private String aniType = "Lion";
    private static int numAni = 0;
    String[] nameChoice = {"Leo", "Lily"};
    
    public Lion(){
        //Assign name according to the number of lions created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
}

public class Pachyderm extends Animal{
    
    public void roam(){
        int chance = rand.nextInt(100) + 1;
        if (chance <= 25){
            // charge
            System.out.println(this.name + " charges.");
        }
        else{
            // roam
            System.out.println(this.name + " roams.");
        }
    }
}

public class Rhino extends Pachyderm{
    
    private String aniType = "Rhino";
    private static int numAni = 0;
    String[] nameChoice = {"Robbie", "Ryan"};
    
    public Rhino(){
        //Assign name according to the number of rhinos created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
    public void makeNoise(){
        System.out.println(this.name + " grunts.");
    }
    
}

public class Hippo extends Pachyderm{
    
    private string aniType = "Hippo";
    private static int nunAni = 0;
    String[] nameChoice = {"Harry", "Hannah"};
    
    public Hippo(){
        //Assign name according to the number of hippos created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
    public void makeNoise(){
        System.out.println(this.name + " groans.");
    }
    
}

public class Elephant extends Pachyderm{
    
    private String aniType = "Elephant";
    private static int numAni = 0;
    String[] nameChoice = {"Ellie", "Evan"};
    
    public Elephant(){
        //Assign name according to the number of elephants created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
    public void makeNoise(){
        System.out.println(this.name + " trumpets.");
    }
    
}

public class Canine extends Animal{
    
    public void makeNoise(){
        System.out.println(this.name + " growls.");
    }
    
}

public class Dog extends Canine{
    
    private string aniType = "Dog";
    private static int numAni = 0;
    String[] nameChoice = {"Doug", "Dina"};
    
    public Dog(){
        //Assign name according to the number of dogs created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
    public void roam(){
        int chance = rand.nextInt(100) + 1;
        if (chance <= 25){
            // Dig 
            System.out.println(this.name + " digs.");
        }
        else{
            //roam
            System.out.println(this.name + " roams.");
            
        }
    }
    
}

public class Wolf extends Canine{
    
    private string aniType = "Wolf";
    private static int numAni = 0;
    String[] nameChoice = {"Will", "Wyatt"};
    
    public Wolf(){
        //Assign name according to the number of wolves created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
    
}

public class Cervidae extends Animal{
    
    public void makeNoise(){
        System.out.println(this.name + " bellows.");
    }
    
}

public class Moose extends Cervidae{
    private string aniType = "Moose";
    private static int numAni = 0;
    String[] nameChoice = {"Manny", "Miles"};
    
    public Moose(){
        //Assign name according to the number of mooses created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
}

public class Caribou extends Cervidae{
    
    private String aniType = "Caribou";
    private static int numAni = 0;
    String[] nameChoice = {"Carl", "Carole"};
    
    public Caribou(){
        //Assign name according to the number of caribou created
        if (numAni <= 1 ){
            this.setName(nameChoice[numb]);
            numAni++;
        }
        else{
            System.out.println("No more room for any more " + aniType + "s.");
        }
    }
}

public class ZooEmployee{
    private String name;
    private int wage;
    
    public void setEmpName(String empName){
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
        
    
}

public class ZooKeeper extends ZooEmployee{
    
    public void wakeAnimals(){
        
    }
    
    public void rollCall(){
        
    }
    
    public void feed(){
        
    }
    
    public void exercise(){
        
    }
    
    public void putToSleep(){
        
    }
    
}
