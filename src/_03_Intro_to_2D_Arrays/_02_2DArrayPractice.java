package _03_Intro_to_2D_Arrays;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          0, 1, 2
     *          3, 4, 5
     *          6, 7, 8
     */
	Integer[][] array1 = new Integer[3][3];
	
    public Integer[][] test1() {
        
        return array1;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          "a", "b", "c", "d",
     *          "e", "f", "g", "e"
     */
    String[][]array2 = new String[2][4];
    public String[][] test2() {
        
        return array2;
    }
    
    /*
     * Return a 2D array that can accommodate the grid of values below:
     *          true, false,
     *          false, false,
     *          false, true,
     *          true, true,
     *          true, false
     */
    Boolean[][]array3 = new Boolean[5][2];
    public Boolean[][] test3() {
        
        return array3;
    }
    
    /*
     * Draw the grid of values for the following 2D array of ints:
     * Assume all the elements in the 2D array are initialized to random ints
     * 
     * int[][] grid = new int[2][3];
     * 		col0	col1 col3 
     * row0  0        8    12
     * row1  2        6    56
     * row2  14		  3    23
     * row3   1		  54   84
     * 
     * Show your teacher the grid you created
     */
    
    /*
     * Draw the grid of values for the following 2D array of Robots
     * Assume all the elements in the 2D array are initialized.
     * 
     * Robot[][] robots = new Robot[4][2];
     * 		col0		col1	col2	col3   col4   
     * row0  jim		  joe    tim     jill  merm
     * row1	 alex         mark   leia   raandy  paul
     * row2 creative		rob		ot	names	here
     * 
     * Show your teacher the grid you created
     */
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, null, null
     *          null, null, null, Object
     */
    public Object test4() {
        Object[][] objects = { {null, null, null, null}, {null, null, null, new Object()} };
        
        return objects[1][3];
    }
    
    /* Given the array of Objects below, return the element that is not null
     *          null, null, Object, null
     *          null, null, null, null
     */
    public Object test5() {
        Object[][] objects = { {null, null, new Object(), null}, {null, null, null, null} };
        
        return objects[0][2];
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first row (row 0)
     */
    public Integer test6() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int sum=0;
        for (int i = 0; i < nums[0].length; i++) {
			sum = sum +nums[0][i];
		}
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * first column (column 0)
     */
    public Integer test7() {
        int[][] nums = { {8, 7, 6, 5}, {4, 3}, {2, 1, 0} };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i][0];
		}
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified row
     */
    public Integer getSumByRow(int[][] matrix, int row) {
    	int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
			sum = sum + matrix[row][i];
		}
        return sum;
    }
    
    /*
     * Write an algorithm to return the sum of all the numbers in the
     * specified column
     */
    public Integer getSumByColumn(int[][] matrix, int col) {
    	int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
			sum = sum + matrix[i][col];
		}
        return sum;
    }
    
    /*
     * Return the value of the element adjacent to the specified row and column
     * The directions East, West, North, South are relative to the 2D array
     * matrix/grid. For example in this 3x3 2D array:
     * 
     *          [1][2][3]
     *          [4][5][6]
     *          [7][8][9]
     * 
     * for the 5 in the middle (row = 1, column = 1), then
     * East neighbor = 6
     * West neighbor = 4
     * North neighbor = 2
     * South neighbor = 8
     * 
     * 1. Assume input row and column values are valid indexes in the matrix.
     * 2. If the neighbor does not exist, i.e. it's outside the grid
     *    boundaries, return null.
     */
    public Integer getEastNeighbor(int[][] matrix, int row, int col) {
    	int en = matrix[row][col];
    	
    	if (col+1<matrix[row].length) {
    		en =matrix[row][col+1];
        	
			return en;
			
		}
		 else {
			 return null;
		 }
    	
		 
		
   
    }
    
    public Integer getWestNeighbor(int[][] matrix, int row, int col) {
        
int wn = matrix[row][col];
    	
    	if (col-1>-1) {
    		wn =matrix[row][col-1];
        	
			return wn;
			
		}
		 else {
			 return null;
		 }
    }
    
    public Integer getNorthNeighbor(int[][] matrix, int row, int col) {
int nn = matrix[row][col];
    	
    	if (row-1>0) {
    		nn =matrix[row-1][col];
        
			return nn;
			
		}
		 else {
			 return null;
		 }
    }
    
    public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
int sn = matrix[row][col];
    	
    	if (row+1<matrix[col].length) {
    		sn =matrix[row+1][col];
        	
			return sn;
			
		}
		 else {
			 return null;
		 }
    }
}
