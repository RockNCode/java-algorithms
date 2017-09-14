package algo.quickSort;

public class QuickSort {
	int partition (int [] arr,int start, int end) {
		int i = start-1;
		int j = start;

		while(j <= end) {
			if(arr[j] <= arr[end] ) {
				i++;
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}

		return i;
	}
	void quickSort(int [] arr, int start, int end) {
		if(start < end) {
			int q = partition(arr,start,end);
			quickSort(arr,start,q-1);
			quickSort(arr,q+1,end);
		}
	}

	void sort(int [] arr) {
		quickSort(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
		QuickSort sorter = new QuickSort();
		sorter.sort(inputArray);

		for(int i= 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

	}

}
