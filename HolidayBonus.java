/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 11/18/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
public class HolidayBonus {

	public static double[] calculateHolidayBonus( double[][] data, double high,double low, double other) {
		double[] total = new double[data.length];
		TwoDimRaggedArrayUtility use = new TwoDimRaggedArrayUtility();
		
		
		for(int i = 0; i < data.length; i++) {
			
		if(use.getLowestInArray(data) == low) {
			total[i] = low;
		} else if(use.getHighestInArray(data) == high) {
			total[i] = high;
		} else {
			total[i] = other;
		}
		
		}
	    return total;
	}
	
	public static double calculateTotalHolidayBonus( double[][] data, double high,double low, double other) {
		double total = 0;
		TwoDimRaggedArrayUtility use = new TwoDimRaggedArrayUtility();
		
		
		for(int i = 0; i < data.length; i++) {
			
		if(use.getLowestInArray(data) == low) {
			total += low;
		} else if(use.getHighestInArray(data) == high) {
			total += high;
		} else {
			total += other;
		}
		
		}
	    return total;
	}
}
