import java.util.Random;

public class MergeSortOne {
	
	static int size = 10;
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[size];
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = rand.nextInt(100000);
		}
		
		printArray(numbers);
		mergeSort(numbers);
		System.out.println();
		printArray(numbers);
	}
	
	public static void printArray(int[] numbers) {
		for(int i = 0; i < size; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void mergeSort(int[] array) {
		int l = array.length;
		int m = l / 2;
		
		if(l < 2) {
			return;
		}
		
		int[] leftArray = new int[m];
		int[] rightArray = new int[l - m];
		
		for(int i = 0; i < m; i++) {
			leftArray[i] = array[i];
		}
		
		for(int i = 0; i < l - m; i++) {
			rightArray[i] = array[m + i];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		int i = 0, j = 0, k = 0;
		
		while(i < leftArray.length && j < rightArray.length) {
			if(leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < leftArray.length) {
			array[j] = leftArray[i];
			i++;
			k++;
		}
		
		while(j < rightArray.length) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
}
