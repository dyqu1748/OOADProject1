//Source for combining 2 arraylists: https://www.geeksforgeeks.org/join-two-arraylists-in-java/#:~:text=Approach%3A%20ArrayLists%20can%20be%20joined,end%20of%20the%20first%20ArrayList.
//Sources for file writing:https://stackoverflow.com/questions/6548157/how-to-write-an-arraylist-of-strings-into-a-text-file
////https://www.w3schools.com/java/java_files_create.asp
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args){

        //Create the Zoo
        Zoo AnnasZoo = new Zoo();
        //create a variable to hold all the Animals from the Zoo
        ArrayList<Animal> Animals = AnnasZoo.BuildAnimals();

        //intalize a Zookeeper
        Zookeeper z = new Zookeeper("Caral", 20);

        ArrayList<String> allActions = new ArrayList<>();

        //for a period of 7 days
        for(int i = 1; i < 8; i++){
            //zookeeper must clock in,exercise, tell animals to sleep, clock out
            allActions.add(z.clockIn() + "on Day " + i + ".");


            //zookeeper wakes the animals & Animals Wake up
            allActions.addAll(z.wakeAnimals(Animals));

            //zookeeper roll calls the animals
            allActions.addAll(z.rollCall(Animals));

            //zookeeper feeds animals
            allActions.addAll(z.feed(Animals));

            //exercise animals
            allActions.addAll(z.exercise(Animals));

            //tell animals to sleep
            allActions.addAll(z.putToSleep(Animals));

            //zookeeper clocks out
            allActions.add(z.clockOut() + "on Day " + i + ".");
        }

        //Attempt to create output file for all actions performed in the program
        try{
            FileWriter zooRecord = new FileWriter("dayatthezoo.out");
            //If file creation is successful, write every action to the output file
            for(String act: allActions) {
                try{
                    zooRecord.write(act + System.lineSeparator());
                    if (act.contains("goes home on")){
                        zooRecord.write(System.lineSeparator());
                    }
                } catch (IOException errW) {
                    //Error occurred when attempting to write to file.
                    System.out.println("An error occurred.");
                    errW.printStackTrace();
                }
            }
            zooRecord.close();
        } catch (IOException err) {
            //An error occurred when attempting to create file.
            System.out.println("An error occurred.");
            err.printStackTrace();
        }
    }

}
