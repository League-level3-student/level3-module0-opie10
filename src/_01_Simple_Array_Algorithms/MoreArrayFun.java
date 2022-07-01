package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {

    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] prints = new String[6];
	String[] printsr = new String[6];
	String[] printsev = new String[6];
	String[] printsran = new String[6];
	prints[0]= "test";
	prints[1]= "test worked";
	prints[2]="impressive";
	prints[3]="hmm";
	prints[4]="insert filler text";
	prints[5]= "idk what to write";
	printsr[0]= "text";
	printsr[1]= "vroom";
	printsr[2]="car noises";
	printsr[3]="reverse";
	printsr[4]="computer";
	printsr[5]= "impress";
	printsev[0]= "dun dun dun";
	printsev[1]= "2";
	printsev[2]="hah";
	printsev[3]="nope";
	printsev[4]="rip";
	printsev[5]= "l";
	printsran[0]= "12345";
	printsran[1]= "245";
	printsran[2]="82";
	printsran[3]="90654";
	printsran[4]="different";
	printsran[5]= "a";

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
printstring(prints);


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

printstringr(printsr);

    //4. Write a method that takes an array of Strings and prints every other String in the array.
pringstringev(printsev);

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
pringstringrand(printsran);
	
	
	
	
	
}

public static void printstring(String[]p) {
	for (int i = 0; i < p.length; i++) {
		System.out.println(p[i]);
	}
}
public static void printstringr(String[]p) {
	for (int i = p.length-1; i>-1; i--) {
	
	System.out.println(p[i]);
	}
}
public static void pringstringev(String[]p) {
	for (int i = 0; i < p.length; i++) {
		System.out.println(p[i]);
		i =i+1;
	}
}
public static void pringstringrand(String[]p) {
	int random = 6;
	for (int i = 0; i < p.length; i++) {
		
		Random rand = new Random();
		rand.nextInt(random);
	
		System.out.println(p[random]);
		
	}
}

}

