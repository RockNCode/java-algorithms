package algo.selectionSort;

public class SelectionSort {

	public static void selectionSort(int [] arr ) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if( arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,9,8,7,6,5,4,3,2,1 };
		
		selectionSort(arr);
		System.out.println("After sort" );
		for(int i = 0; i < arr.length; i++) {
			System.out.println(""+ arr[i]);
		}

	}

}
