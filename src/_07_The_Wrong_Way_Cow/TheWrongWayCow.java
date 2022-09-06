/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int northc = 0;
    	int southc = 0;
    	int westc =0;
    	int eastc =0;
    	int cowcount=0;
    	String cowl = new String();
    	int[] found = new int[2];
    
for (int i = 0; i < field.length; i++) {
	
	for (int j = 0; j < field.length; j++) {
		
		//find most common cow
		if (cowcount >= 2) {
			if (northc >2) {
				cowl = "north";
			}
			if (southc >2) {
				cowl = "south";
			}
			if (eastc > 2) {
				cowl = "east";
			}
			if (westc >2) {
				cowl = "west";
			}
		}
		System.out.println(cowcount);
		//if (cowcount<=5) {
		//	break;
		//}
		
		
		char car = field[i][j];
		String ca = new String();
		ca.valueOf(car);
		if (ca == "c"){
			//north 
			if (i>2) {
				
			if (cowl == "north") {
				continue;
			}
			else {
			char carn = field[i][j];
			String can = new String();
				carn = field[i-1][j];
				can.valueOf(carn);
				if (can == "o") {
					northc = northc+1;
					cowcount = cowcount+1;
					
					found[0] =	j;
					found[1]=i;
				}
				else
				{continue;
					
				}
			}
			}
			//south
			if (cowl == "south") {
				continue;
			}
			else {
				char cars = field[i][j];
				String cas = new String();
					cars = field[i+1][j];
					cas.valueOf(cars);
					if (cas == "o") {
						southc = southc+1;
						cowcount = cowcount+1;
						
					found[0] =	j;
					found[1]=i;
					}
					else
					{continue;
						
					}
			}
			//east
			
				if (cowl == "east") {
					continue;
				}
				else {
				
				char care = field[i][j];
				String cae = new String();
					care = field[i][j+1];
					cae.valueOf(care);
					if (cae == "o") {
						eastc = eastc+1;
						cowcount = cowcount+1;
						
						found[0] =	j;
						found[1]=i;
					}
					else
					{continue;
						
					}
				}
			
			//west
			
				
				if (cowl == "west") {
					continue;
				}
				else {
				char carw = field[i][j];
				String caw = new String();
					carw = field[i][j-1];
					caw.valueOf(carw);
					if (caw == "o") {
						westc = westc+1;
						cowcount = cowcount+1;
						found[0] =	j;
						found[1]=i;
					}
					else
					{continue;
						
					}
				}
			}
		
			
			
			
			
			
		}
		
		
	}
System.out.println(found);
        return found ;
    }
}
