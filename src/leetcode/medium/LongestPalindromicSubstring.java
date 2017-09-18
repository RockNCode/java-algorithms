package leetcode.medium;

public class LongestPalindromicSubstring {

	static boolean isPalindrome(String s, int start, int end) {
		//System.out.println("start = "  + start + " end = " + end);
		int mid = (start + end )/2 ;
		//int i = 0;
		while(start < mid) {
			//System.out.println("at while");
			if(s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		if(s.charAt(start) != s.charAt(end))
			return false;
		return true;
	}
	static String longestPalindromicString(String s) {
		int start = 0;
		int end = s.length()-1;
		int i = start;
		int longest_start =0;
		int longest_end = 1;
		int max_len = 1;
		boolean notFound = true;
		if(s.length() == 1)
			return s;
		while(i < s.length() ||
				!(max_len > ( s.length() - 1 - i))
				)
		{
			notFound = false;
			while(!isPalindrome(s,i,end))
			{
				end--;
				if(end <= i) {
					//System.out.println("Not found");
					notFound= true;
					break;
				}
			}
			if((end - i) >= max_len && !notFound) {
				//System.out.println("Updating len");
				max_len = end - i;
				longest_start = i;
				longest_end = end;
				i++;
				end = s.length()-1;
				continue;
			}
			notFound = true;
			i++;
			end = s.length()-1;
		}

		//System.out.println("Max len " + max_len + "start = "+ longest_start + " end = " + longest_end);
		/*if(notFound) {
			System.out.println("NOT FOUND");
			return s.substring(longest_start,longest_end);
		}*/
		if(s.charAt(longest_start) != s.charAt(longest_end))
			return s.substring(longest_start,longest_end);
		return s.substring(longest_start,longest_end+1);
	}

	public static void main(String []args) {
		String str1 = "babad";
		String str2 = "bb";
		String str3 = "anitalavalatina";
		String str4 = "babadada";
		String str5 = "abcda";
		System.out.println("Longest palindromic string is " + longestPalindromicString(str1));
		System.out.println("Longest palindromic string is " + longestPalindromicString(str2));
		System.out.println("Longest palindromic string is " + longestPalindromicString(str3));
		System.out.println("Longest palindromic string is " + longestPalindromicString(str4));
		System.out.println("Longest palindromic string is " + longestPalindromicString(str5));

		System.out.println(isPalindrome("cb",0,1));
	}
}
