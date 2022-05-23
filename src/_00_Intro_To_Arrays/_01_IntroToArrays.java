package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] introArray = new String [5];
introArray[0] = "hello";
introArray[1] = "there";
introArray[2] = "general";
introArray[3] = "kenobi";
introArray[4] = "that was a star wars reference";
        // 2. print the third element in the array
System.out.println(introArray[2]);
        // 3. set the third element to a different value
introArray[2]= "vroom corrupt le code";
        // 4. print the third element again
System.out.println(introArray[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < introArray.length; i++) {
	introArray[i] = "EVILLLLLL";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < introArray.length; i++) {
	System.out.println(introArray[i]);
}
        // 7. make an array of 50 integers
int[] fiftynumArray = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
for (int i = 0; i < fiftynumArray.length; i++) {
	
	Random rand = new Random();
	int ri =rand.nextInt(1000);

	fiftynumArray[i] = ri ;
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallestNum = 1001;
//for (int i = 0; i < fiftynumArray.length; i++) {
	
 //if (smallestNum>fiftynumArray[i]) {
//	smallestNum = fiftynumArray[i];
//}
//}
//System.out.println(smallestNum);
        // 10 print the entire array to see if step 8 was correct
for (int i = 0; i < fiftynumArray.length; i++) {
	System.out.println(fiftynumArray[i]);
}
        // 11. print the largest number in the array.
//int LargestNum = 0;
//for (int i = 0; i < fiftynumArray.length; i++) {
	
 //if (LargestNum<fiftynumArray[i]) {
//	LargestNum = fiftynumArray[i];
//}
//}
//System.out.println(LargestNum);
        // 12. print only the last element in the array
System.out.println(fiftynumArray[fiftynumArray.length-1]);
    }
}
