
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int positiveSum = 0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0){
                break;
            }
            
            if(input > 0){
                positiveCount = positiveCount + 1;
                positiveSum = positiveSum + input;
            }
        }
        
        if(positiveCount  == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) positiveSum / positiveCount;
            System.out.println(average);
        }

    }
}
