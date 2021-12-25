public class MergeSortThree {
	
	int arr[] = {4, 65, 32, 23, 59, 22, 80, 63, 33, 48};
	
	public void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void mergeSort(int arr[]) {
		int l = arr.length;
		int m = l / 2;
		
		if(l < 2) {
			return;
		}
		
		int lArr[] = new int[m];
		int rArr[] = new int[l - m];
		
		for(int i = 0; i < m; i++) {
			lArr[i] = arr[i];
		}
		
		for(int i = 0; i < l - m; i++) {
			rArr[i] = arr[m + i];
		}
		
		mergeSort(lArr);
		mergeSort(rArr);
		
		int i, j, k;
		i = j = k = 0;
		
		while(i < lArr.length && j < rArr.length) {
			if(lArr[i] < rArr[j]) {
				arr[k++] = lArr[i++];
			}
			else {
				arr[k++] = rArr[j++];
			}
		}
		
		while(i < lArr.length) {
			arr[k++] = lArr[i++];
		}
		
		while(j < lArr.length) {
			arr[k++] = rArr[j++];
		}
	}
	
	public static void main(String[] args) {
		MergeSortThree mergeSort = new MergeSortThree();
		mergeSort.printArray(mergeSort.arr);
		mergeSort.mergeSort(mergeSort.arr);
		mergeSort.printArray(mergeSort.arr);
	}
}
