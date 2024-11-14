package lv.rvt;
import java.io.BufferedReader;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {






        BufferedReader reader = Utils.getReader("persons.csv");


        ArrayList<Person> personList = new ArrayList<>();

        String Line;
        Integer totalAge = 0;
        while ((Line = reader.readLine()) != null) {
            String[] parts = Line.split(", ");
            totalAge += Integer.valueOf(parts[1]);


            System.out.println("Array: " + Arrays.toString(parts));
            

            Person person = new Person(parts[0], 0, 0, 0);

            personList.add(person);

            
            

            System.out.println("CSV line: " + Line);

        }
        reader.close();

        


        double averageAge = (double) totalAge / personList.size();
        System.out.println("Average Age: " + averageAge);

        

        
        














        //     PaymentCard paulsCard = new PaymentCard(20);

    //     PaymentCard mattsCard = new PaymentCard(30);

    //     paulsCard.eatHeartily();

    //     mattsCard.eatAffordably();

    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);

    //     paulsCard.addMoney(20);

    //     mattsCard.eatHeartily();

    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);

    //     paulsCard.eatAffordably();
    //     paulsCard.eatAffordably();

    //     mattsCard.addMoney(50);

    //     System.out.println("Paul: " + paulsCard);
    //     System.out.println("Matt: " + mattsCard);
    // }

    }
}