package Exercise1;

import java.util.random.RandomGenerator;

public class randomArray {

    public static void main(String[] args) {

        //Spara 10 slumptal från 1-100 i en array
        //Skriv ut innehållet i arrayn till konsolen
        //Skapa en metod som returnerar slumptal från 1-100 i en array
        //Storleken på arrayn är också ett slumptal ifrån 1-100

        int[] randomArray = new int[10];
        int min = 1;
        int max = 100;
        int range = max - min + 1;


        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            randomArray[i] = rand;
        }
        //for (int i = 0; i < 10; i++) {
            //System.out.println(randomArray[i]);
        //}
        randomGenerator generator = new randomGenerator();
        int[] newArray = generator.randomArray();

        for (int i = 0; i < 10; i++) {
            System.out.println(newArray[i]);
        }
    }


