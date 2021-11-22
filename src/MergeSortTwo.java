import java.util.Random;

public class MergeSortTwo {
static int size = 10;
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[size];
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = rand.nextInt(100000);
		}
		
		printArray(numbers);
		mergeSort(numbers);
		printArray(numbers);
	}
	
	static void printArray(int[] inArr) {
		for(int i = 0; i < inArr.length; i++) {
			System.out.print(inArr[i] + " ");
		}
		System.out.println();
	}
	
	static void mergeSort(int[] inArr) {
		
		int l = inArr.length;
		if (l < 2) {
			return;
		}
		
		int m = l / 2;
		
		int lArr[] = new int[m];
		int rArr[] = new int[l - m];
		
		for(int i = 0; i < m; i++) {
			lArr[i] = inArr[i];
		}
		
		for(int i = 0; i < l - m; i++) {
			rArr[i] = inArr[m + i]; 
		}
		
		mergeSort(lArr);
		mergeSort(rArr);
		
		merge(inArr, lArr, rArr);
	}
	
	static void merge(int[] inArr, int[] lArr, int[] rArr) {
		
		int i = 0, j = 0, k = 0;
		
		while(i < lArr.length && j < rArr.length) {
			if(lArr[i] <= rArr[j]) {
				inArr[k++] = lArr[i++];
			}
			else {
				inArr[k++] = rArr[j++];
			}
		}
		
		while(i < lArr.length) {
			inArr[k++] = lArr[i++];			
		}
			
		while(j < rArr.length) {
			inArr[k++] = rArr[j++];
		}
	}

}
