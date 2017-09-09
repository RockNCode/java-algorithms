package algo.wordCount;

public class MinDeletions {

	public static int minDeletions(String str1 , String str2) {
		int count =0;
		
		int [] hash = new int[256];
		
		for (int i = 0; i < str1.length(); i++) {
			hash[str1.charAt(i) - 'a'] ++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			hash[str2.charAt(i) - 'a'] --;
		}
		
		for(int i = 0; i < hash.length; i++) {
			count+= Math.abs(hash[i]);
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "godfdf";
		String word2 = "dogfd";
		
		System.out.println("Minimum amount of deletions is " + minDeletions(word1,word2));
	}

}
