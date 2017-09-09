package algo.wordCount;

public class WordCount {

	public static int countWords(String str) {
		int cnt = 0;
		boolean outsideWord = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				// inside word
				if(outsideWord) {
					outsideWord = false;
					cnt ++;
				}
			}
			else {
				// outside word
				if(!outsideWord)
					outsideWord = true;
			}
			
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   This   is    a word ";
		System.out.println("Word has " + countWords(str) + " words.");
	}

}
