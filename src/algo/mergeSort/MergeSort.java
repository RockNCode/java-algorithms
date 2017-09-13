package algo.mergeSort;

public class MergeSort {

	public static void sort(int [] arr ) {
		sort(arr,0,arr.length-1);

	}

	public static void sort(int [] arr, int start , int end ) {
		if(end <= start) {
			return;
		}
		int mid = (end + start) / 2;
		sort(arr,start,mid);
		sort(arr,mid+1,end);
		merge(arr,start,mid,end);

	}

	public static void merge(int [] arr, int start, int mid, int end) {
		int [] tempArr = new int[end - start +1];
		int i = start; // left slot
		int j = mid+1; // right slot
		int k = start; // index start

		for(k = 0; k < tempArr.length; k++) {
			if( j > end || (i <= mid && arr[i] < arr[j] ) ) {
				tempArr[k] = arr[i];
				i++;
			}
			else {
				tempArr[k] = arr[j];
				j++;
			}
		}

		for(int m = start; m <= end; m++) {
			arr[m] = tempArr[m - start];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};

		int [] checkMerge = {1,3,5,8,2,4,6,7};

		sort(inputArray);

		for(int i= 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

}
