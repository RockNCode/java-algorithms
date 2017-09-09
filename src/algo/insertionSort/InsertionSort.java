package algo.insertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {10,9,8,7,6,5,4,3,2,1};
		insertionSort(arr);
		System.out.println("After insertion sort");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int [] arr) {
		for(int i = 1; i < arr.length; i++) {
			int element = arr[i]; // element that is to be moved to sorted area
			int j = i-1; // last index of the sorted area
			
			while(j >= 0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = element;
		}
		
	}
}
