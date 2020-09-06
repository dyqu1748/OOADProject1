public class Animal{
    
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
    String name;
    
    public Tiger(){
        name = "Tony";
    }
    
}

public class Cat extends Feline{
    String name;
    
    public Cat(){
        name = "Charlie";
    }
    
}

public class Lion extends Feline{
    String name;
    
    public Lion(){
        name = "Leo";
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
    String name;
    
    public Rhino(){
        name = "Robbie";
    }
    
    public void makeNoise(){
        System.out.println(this.name + " grunts.");
    }
    
}

public class Hippo extends Pachyderm{
    String name;
    
    public Hippo(){
        name = "Harry";
    }
    
    public void makeNoise(){
        System.out.println(this.name + " groans.");
    }
    
}

public class Elephant extends Pachyderm{
    String name;
    
    public Elephant(){
        name = "Ellie";
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
    String name;
    
    public Dog(){
        name = "Doug";
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
    String name;
    
    public Wolf(){
        name = "Willis";
    }
    
}

public class Cervidae extends Animal{
    
    public void makeNoise(){
        System.out.println(this.name + " bellows.");
    }
    
}

public class Moose extends Cervidae{
    String name;
    
    public Moose(){
        name = "Manny";
    }
}

public class Caribou extends Cervidae{
    String name;
    
    public Caribou(){
        name = "Carl";
    }
}

public class ZooEmployee{
    
    public void wakeAnimals(){
        
    }
    
    public void rollCall(){
        
    }
    
    public void feed(){
        
    }
    
    public void exercise(){
        
    }
    
    public void sleep(){
        
    
}

public class ZooKeeper extends ZooEmployee{
    
}
