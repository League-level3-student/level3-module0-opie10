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
		int westc = 0;
		int eastc = 0;
		int cowcount = 0;
		
		int[][] cowhead = new int[4][2];

		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length; j++) {

				// find most common cow
				

				// if (cowcount<=5) {
				// break;
				// }

				char car = field[i][j];

				if ('c' == car) {
					// north
					if (i > 2) {

						
							char carn = field[i][j];

							carn = field[i - 1][j];

							if (carn == 'o') {
								if (field[i-2][j]== 'w') {
								northc = northc + 1;
								cowcount = cowcount + 1;
								System.out.println(cowcount);
								cowhead[0] = new int[] {j,i};
								}

							} 
						
					}
					if (i + 2 < field.length) {

						// south
						
							char cars = field[i][j];

							cars = field[i + 1][j];

							if (cars == 'o') {
								if (field[i+2][j]== 'w') {
								southc = southc + 1;
								cowcount = cowcount + 1;
								cowhead[1] = new int[] {j,i};
								}
							} 
						
					}
					// east
					if (j>=2) {

						

							char care = field[i][j];

							care = field[i][j - 1];

							if (care == 'o') {
								if (field[i][j-2]== 'w') {
								eastc = eastc + 1;
								cowcount = cowcount + 1;
								cowhead[2] = new int[] {j,i};
								}
							} 
						
					}
					// west

					if (j<field[i].length-2) {
						
							char carw = field[i][j];

							carw = field[i][j + 1];

							if (carw == 'o') {
								if (field[i][j+2]== 'w') {
									
								
								westc = westc + 1;
								cowcount = cowcount + 1;
								cowhead[3] = new int[] {j,i};
								}
							} 
						}
					

				}

			}
		}
		
		if (northc == 1) {
			return cowhead[0];
		}
		if (southc == 1) {
			return cowhead[1];
		}
		if (eastc == 1) {
			return cowhead[2];
		}
		if (westc == 1) {
			return cowhead[3];
		}
		else {
		return null;
		}
		
	}
}
