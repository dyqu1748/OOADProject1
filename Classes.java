public class Animal{
    String name;
    
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
    
}

public class Feline extends Animal{
    
    public void sleep(){
        int chance = rand.nextInt(100) + 1
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
            System.out.println();
        }
    }
    
    public void makeNoise(){
        System.out.println(this.name + " purrs.");
    }
    
}

public class Tiger extends Feline{
    String[] nameChoice = {"Tony", "Tina"};
    
    public Tiger(){
        //Assign name according to the number of tigers created
    }
    
}

public class Cat extends Feline{
    String[] nameChoice = {"Charlie", "Carly"};
    
    public Cat(){
        //Assign name according to the number of cats created
    }
    
}

public class Lion extends Feline{
    String[] nameChoice = {"Leo", "Lily"};
    
    public Lion(){
        //Assign name according to the number of lions created
    }
}

public class Pachyderm extends Animal{
    
    public void roam(){
        int chance = rand.nextInt(100) + 1
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
    String[] nameChoice = {"Robbie", "Ryan"};
    
    public Rhino(){
        //Assign name according to the number of rhinos created
    }
    
    public void makeNoise(){
        System.out.println(this.name + " grunts.");
    }
    
}

public class Hippo extends Pachyderm{
    String[] nameChoice = {"Harry", "Hannah"};
    
    public Hippo(){
        //Assign name according to the number of hippos created
    }
    
    public void makeNoise(){
        System.out.println(this.name + " groans.");
    }
    
}

public class Elephant extends Pachyderm{
    String[] nameChoice = {"Ellie", "Evan"};
    
    public Elephant(){
        //Assign name according to the number of elephants created
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
    String[] nameChoice = {"Doug", "Dina"};
    
    public Dog(){
        //Assign name according to the number of dogs created
    }
    
    public void roam(){
        int chance = rand.nextInt(100) + 1
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
    String[] nameChoice = {"Will", "Wyatt"};
    
    public Wolf(){
        //Assign name according to the number of wolves created
    }
    
}

public class Cervidae extends Animal{
    
    public void makeNoise(){
        System.out.println(this.name + " bellows.");
    }
    
}

public class Moose extends Cervidae{
    String[] nameChoice = {"Manny", "Miles"};
    
    public Moose(){
        //Assign name according to the number of mooses created
    }
}

public class Caribou extends Cervidae{
    String[] nameChoice = {"Carl", "Carole"};
    
    public Caribou(){
        //Assign name according to the number of caribou created
    }
}

public class ZooEmployee{
    String name;
    int wage;
        
    
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
