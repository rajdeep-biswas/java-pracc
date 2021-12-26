import java.util.Random;

public class QuickSortZero {
	
static int size = 10;
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] numbers = new int[size];
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = rand.nextInt(100000);
		}
		
		printArray(numbers);
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println();
		printArray(numbers);
	}
	
	public static void printArray(int[] numbers) {
		for(int i = 0; i < size; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	public static void quickSort(int[] inArr, int li, int ri) {
		
		if(li >= ri) {
			return;
		}
		
		int piv = inArr[ri];
		
		int lp = li;
		int rp = ri;
		
		while(lp < rp) {
			while(inArr[lp] <= piv && lp < rp) {
				lp++;
			}
			while(inArr[rp] >= piv && lp < rp) {
				rp--;
			}
			swap(inArr, lp, rp);
		}
		
		// The step that I was missing was swapping left pointer lp with the pivot element (ri), instead of swapping it with rp.
		swap(inArr, lp, ri);
		
		
		quickSort(inArr, li, lp - 1);
		quickSort(inArr, lp + 1, ri);
	}
	
	public static void swap(int arr[], int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}
