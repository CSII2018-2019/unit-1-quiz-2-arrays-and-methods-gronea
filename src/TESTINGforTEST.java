
public class TESTINGforTEST {

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		//#1: return the average of all the values in the array
		int average = average (array);
		System.out.println("The average is: " + average);
		//#2: return the range of the values (highest - lowest)
		int range = range (array);
		System.out.println("The range is: " + range);
	}
	public static int average (int [] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		int answer = total / array.length;
		return answer;
	}
	public static int range (int [] array) {
		int lowestValue = array[0];
		int highestValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < lowestValue) {
				lowestValue = array[i];
			}
			if (array[i] > highestValue) {
				highestValue = array[i];
			}
		}
		int answer = highestValue - lowestValue;
		return answer;
	}
}
