import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class reversewords {

	public static void main(String ars[])
	{
		String s=reverseWords("this is java world");
		System.out.println("value " + s);
	}
		public static String reverseWords(String sentence) {
//			if (sentence.trim().isEmpty()) {
//	            return sentence;
//	        }
	 
	        StringBuilder reverse = new StringBuilder();
	        String[] sa = sentence.trim().split("\\s");
	 
	        for (int i = sa.length - 1; i >= 0; i--) {
	            reverse.append(sa[i]);
	            reverse.append(' ');
	        }
	 
	        return reverse.toString().trim();
	    }

}



