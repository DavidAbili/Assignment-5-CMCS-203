/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 11/18/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */


import java.io.*;
import java.util.Arrays;

public class TwoDimRaggedArrayUtility {

	public static double [][] readFile( File file) throws java.io.FileNotFoundException
	{

		double [][] arr = new double [10][10];
		String text = " ";
		try {
			String name = file.getName();
			BufferedReader bufferedReader = new BufferedReader(new FileReader(name));

			for(int i = 0; i < 10; i++) {

				text = bufferedReader.readLine();
				String token[] = text.split(" ");

				for(int j = 0; j < 10; j++) {
					if(token[j].length() > 0) {
						arr[i][j] = Double.parseDouble(token[j]);
					}
				}
			}
		}
		catch(IOException ex) {

		}
		return arr;
	}

	public static void writeToFile(double [][] data, File outputFile) throws java.io.FileNotFoundException
	{
		try {
			FileWriter output = new FileWriter(outputFile);

			for(int i = 0; i < data.length; i++) {
				String word = " ";
				for(int j = 0; j < data[i].length; j++) {
					System.out.print(data[i][j] + " ");
					word += data[i][j];
				}
				System.out.println(" ");
				word += "\n";
				output.write(word);
			}
			output.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block

		}

	}

	public static double getTotal(double [][] data) {
		double total = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length;j++) {
				total += data[i][j];	
			}
		}
		return total;
	}

	public static double getAverage(double [][] data) {
		double total = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length;j++) {
				total += data[i][j];	
				total /= data.length;
			}
		}
		return total;
	}

	public static double getRowTotal(double [][] data, int row) {
		double total = 0;
		for(int i = 0; i < data[row].length; i++) {

			total += data[row][i];	
		}
		return total;
	}

	public static double getColumnTotal(double [][] data, int col) {
		double total = 0;

		for(int j = 0; j < data.length;j++) {
			total += data[j][col];		
		}
		return total;
	}

	public static double getHighestInRow(double [][] data, int row) {
		double max = 0;
		for(int i = 0; i < data[row].length; i++) {

			if(max < data[row][i]) {
				max = data[row][i];	
			}
		}
		return max;
	}

	public static double getHighestInRowIndex(double [][] data, int row) {
		double max = 0;
		for(int i = 0; i < data[row].length; i++) {

			if(max < data[row][i]) {
				max = i;	
			}
		}
		return max;
	}

	public static double getHighestInColumn(double [][] data, int col) {
		double max = data[0][col];

		for(int j = 0; j < data.length;j++) {		
			if(max < data[j][col]) {
				max = data[j][col];
			}
		}
		return max;
	}

	public static double getHighestInColumnIndex(double [][] data, int col) {
		double max = data[0][col];
		double ind = 0;

		for(int j = 0; j < data.length;j++) {
			if(max < data[j][col]) {
				ind = j;
			}
		}
		return ind;
	}

	public static double getLowestInRow(double [][] data, int row) {
		double max =  data[row][0];
		for(int i = 0; i < data[row].length; i++) {

			if(max > data[row][i]) {
				max = data[row][i];	
			}
		}
		return max;
	}

	public static double getLowestInRowIndex(double [][] data, int row) {
		double min =  data[row][0];
		double ind = 0;

		for(int i = 0; i < data[row].length; i++) {

			if(min > data[row][i]) {
				ind = i;	
			}
		}
		return ind;
	}

	public static double getLowestInColumn(double [][] data, int col) {
		double max = data[0][col];
		double ind = 0;

		for(int j = 0; j < data.length;j++) {
			if(max < data[j][col]) {
				max = data[j][col];
			}
		}
		return max;
	}

	public static double getLowestInColumnIndex(double [][] data, int col) {
		double max =  data[0][col];
		double ind = 0;

		for(int j = 0; j < data.length;j++) {
			if(max > data[j][col]) {
				ind = j;

			}
		}
		return ind;
	}

	public static double getHighestInArray(double [][] data) {
		double max = 0;
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length;j++) {
				if(max < data[i][j])
					max = data[i][j];	
			}
		}
		return max;
	}

	public static double getLowestInArray(double [][] data) {
		double max = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length;j++) {
				if(max > data[i][j])
					max = data[i][j];	
			}
		}
		return max;
	}
}
