import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];

            //input
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();
            }
            // for (int i = 0; i < numbers.length; i++) {
            //     System.out.println(numbers[i]);
            // }

            int largest=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            // only for Largest number
            // for (int i = 0; i < numbers.length; i++) {
            //     if (numbers[i]>largest) {
                    
            //         largest=numbers[i];
            //     }}
            //     for (int i = 0; i < numbers.length; i++) {
            //     if (numbers[i] < largest && numbers[i] > secondLargest ) {
            //         secondLargest = numbers[i];
            //     }}
            //     for (int i = 0; i < numbers.length; i++) {
            //      if (numbers[i] < secondLargest && numbers[i] > third ) {
            //         third = numbers[i];
            //     }
            // }
            // System.out.println("Largest no is : "+largest);

             // Finding the second largest element
            //  for (int i = 0; i < numbers.length; i++) {
                
            //     // Update second largest if the current element is greater
            //     // than second largest and not equal to the largest
            //     if (numbers[i] > secondLargest && numbers[i] != largest) {
            //         secondLargest = numbers[i];
            //     }
            // }

   //   its for both largest and Second Largest
            for (int num : numbers) {
                if (num > largest) {
                    third = secondLargest;
                    secondLargest = largest; // Update second largest
                    largest = num; // Update largest
                } else if (num > secondLargest && num < largest) {
                    third = secondLargest;
                    secondLargest = num; // Update second largest
                }
                else  if (num>third && num <secondLargest)
                third = secondLargest;
            }
            System.out.println("Largest no is : "+largest);
            System.out.println("Second largest number is: " + secondLargest);
            System.out.println("Third Largest no is : "+third);
        }

    }
    
}
