package algo.recursiveLinearSearch;

public class RecursiveLinearSearch {
	public static int recursiveLinearSearch(int [] arr , int i , int val) {
		// base
		if(i == arr.length-1)
			return -1;
		else if(arr[i] == val)
			return i;
		else
			return recursiveLinearSearch(arr,i+1,val);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Index of 6 = " + recursiveLinearSearch(arr,0,11) );
	}

}
