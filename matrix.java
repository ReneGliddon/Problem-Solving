package Problem_Solving;

import java.util.Scanner;

public class matrix {

	 public static void main(String[] args) {
		    Scanner intScan = new Scanner(System.in);
		        
		      //  System.out.println("Enter The Number Of Matrix Rows/Columns: ");
		         
		      //  int matrixNum = intScan.nextInt();
		         
		      //defining 2D array to hold matrix data
		      //char[][] matrix = new char[matrixNum][matrixNum];
		      
		        
		       // Enter Matrix Data
		       // enterMatrixData(intScan, matrix, matrixNum, matrixNum);
		      
		      
		        char[][] matrix = { {'d','o','g',},
		        					 {'a', 'v', 't'},
		        					 {'y', 'a', 'p'} };
		        
		      System.out.println("We will enter words to search for. When you are finished, enter \"-99\".");
		      
		      
		        System.out.println("Enter the word to search for: ");
		        Scanner textScan = new Scanner(System.in);
		        String search = textScan.nextLine();
		        
		        while(!search.equals("-99")) {
		        	search(search, matrix);
		        	System.out.println("Enter the word to search for: ");
			         search = textScan.nextLine();
		        }	        
		        
		        // Print Matrix Data
		      
		        //printMatrix(matrix, matrixNum, matrixNum);
}

	 //search for a word in the matrix, both up and down columns, and up and down rows, but no diagonal
public static void search(String search, char[][] matrix) {
	 
   
	String wordColumn = "";
	String wordRow = "";
   
	//search 
	for(int i = 0; i < matrix.length; i++) {
		for(int j = 0; j < matrix.length; j++) {
			
			wordColumn = wordColumn + matrix[i][j];
			wordRow = wordRow + matrix[j][i];
		}
		
		if(wordColumn.equals(search) || new StringBuilder(wordColumn).reverse().toString().equals(search) ) {
			System.out.println("Yes");
		}
		else if(wordRow.equals(search) || new StringBuilder(wordRow).reverse().toString().equals(search)) {
			System.out.println("Yes");
		}
		wordRow = "";
		wordColumn = "";
	}//search 
	
}
//if you want a user entered matrix, use this
	 public static void enterMatrixData(Scanner scan, char[][] matrix, int matrixRow, int matrixCol){
	     System.out.println("Enter Matrix Data");
	  
	     //search down columns
	          for (int i = 0; i < matrixRow; i++)
	          {
	              for (int j = 0; j < matrixCol; j++)
	              {
	                  matrix[i][j] = scan.next().charAt(0);
	              }
	          }
	  }
	 
//if you want to print the matrix, use this  
	  public static void printMatrix(char[][] matrix, int matrixRow, int matrixCol){
	    System.out.println("Your Matrix is : ");
	        
	        for (int i = 0; i < matrixRow; i++)
	        {
	            for (int j = 0; j < matrixCol; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	            }
	             
	            System.out.println();
	        }
	  }
	}