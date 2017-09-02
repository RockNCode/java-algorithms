package algo.binarySearch;

public class BinarySearch {
	public static int binary_search(int[] arr ,int val) {
		int p = 0;
		int r = arr.length-1;
		int q = r/2; // value to check
		
		while(p <= r) {
			System.out.println("At search q = " + q +" p = " + p + " r = " + r  );
			q = (r + p) / 2;
			if( arr[q] == val)
				return q;
			
			if( val > arr[q] ) {
				p = q+1;
			}else {
				r = q-1;
			}
			
		}
		return -1;
	}
}
