
public class AllPossibleCombination {

	public static void printCombination(String s , String result)
	{  
	    if (s.length() == 0)
	    {
	        System.out.println(result);
	        return;
	    }
	     
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String lString = s.substring(0, i);
	        String rString = s.substring(i + 1);
	        String rest = lString + rString;
	        printCombination(rest, result + ch);
	    }
	}
	public static void main(String[] args) {
		String str = "ABC"; 
		printCombination(str,"");
	}
}
