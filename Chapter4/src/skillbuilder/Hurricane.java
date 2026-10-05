package skillbuilder; 

import java.util.Scanner; 

public class Hurricane { 
    public static void main(String[] args) { 
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Enter the category of hurricane (1-5): "); 
            int category = scanner.nextInt(); 
            
            if (category == 1) {
                System.out.println("The speed of the hurricane is 74-95 mph or 64-82 kt or 119-153 kph"); 
            }
            if (category == 2) {
                System.out.println("The speed of the hurricane is 96-110 mph or 83-95 kt or 154-177 kph"); 
                
            }
            if (category == 3) {
                System.out.println("The speed of the hurricane is 111-130 mph or 96-113 kt or 178-209 kph"); 
                
            }
            if (category == 4) {
                System.out.println("The speed of the hurricane is 131-155 mph or 114-135 kt or 210-249 kph"); 
                
            }
            if (category == 5) {
                System.out.println("The speed of the hurricane is greater than 155 mph or 135 kt or 249 kph"); 
            }
        } 
    } 
}
