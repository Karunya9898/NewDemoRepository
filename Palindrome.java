import java.lang.*;

public class Palindrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam1";
		StringBuffer strRev = new StringBuffer(str);
		strRev.reverse();
		if(str.equals(strRev.toString())) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}
