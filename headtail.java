package hot;

import java.util.Random;

public class headtail{
    public static void main(String[] args){
    int head = 0,tail = 0,i;
    System.out.println("Tossing a coin...");
    for(i = 1; i < 4; i++){
            Random random = new Random();
            int randomValue = random.nextInt(2);
            if(randomValue == 0){
                System.out.println("Round "+i+": "+"Heads");
                head++;
            }
            else if(randomValue ==  1){
                System.out.println("Round "+i+": "+"Tails");
                tail++;
            }
        }
        System.out.println("Heads: "+head+","+" Tails: "+tail);
    }
}