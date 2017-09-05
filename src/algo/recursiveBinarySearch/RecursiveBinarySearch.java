package algo.recursiveBinarySearch;

public class RecursiveBinarySearch {

	public static int recursiveBinarySearch(int[] arr, int p, int r, int val) {
		//base condition
		if(p > r)
			return -1;
		System.out.println("p = "+ p + " r = "+ r);
		int q  = (r + p) / 2;
		
		if(arr[q] == val ) {
			return q;
		}
				
		if( val > arr[q] ) {
			return recursiveBinarySearch(arr,q+1,r,val);
		}else {
			return recursiveBinarySearch(arr,p,q-1,val);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int result = recursiveBinarySearch(arr,0,arr.length -1, 11); 
		System.out.println("Index is " + result);
	}

}
