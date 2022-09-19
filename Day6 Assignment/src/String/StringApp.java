package String;

public class StringApp {

	public static void main(String[] args) {
		StringOperation operation = new StringOperation();
		System.out.println("Reverse of String : " + operation.reverseString("YAsh"));
		
		System.out.println("Occurance of letter 'S' is : " + operation.occuranceOfChar("YM YASH", 'S') );
	
		String str1 = "Yash";
		String str2 = "Barcelona";
		if(operation.anagramString(str1, str2))
			System.out.println(str1 + " And " + str2 + " are anagram strings");
		else
			System.out.println(str1 + " And " + str2 + " are not anagram strings");

	}

}