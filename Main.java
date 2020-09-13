import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //Create the Zoo
        zoo AnnasZoo = new zoo();
        ArrayList<Animal> Animals = AnnasZoo.BuildAnimals();

        //intalize a Zookeeper... need to figure out how to randomize this and run for 7 days
        Zookeeper z = new Zookeeper("Caral", 20);

        //for a period of 7 days
        for(int i = 1; i < 8; i++){
            System.out.println("Start of day " + i);
            //zookeeper must clock in,exercise, tell animals to sleep, clock out
            System.out.println(z.clockIn());

            //zookeeper wakes the animals & Animals Wake up
            z.wakeAnimals(Animals);

            //zookeeper roll calls the animals
            z.rollCall(Animals);

            //zookeeper feeds animals
            z.feed(Animals);

            //exercise animals
            z.exercise(Animals);

            //tell animals to sleep
            z.putToSleep(Animals);

            //zookeeper clocks out
            System.out.println(z.clockOut());

            System.out.println("End of day " + i);
        }

    }

}
