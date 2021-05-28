package TesString;

public class StringOperations {

	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = "Lisa";
		String string3 = " ";
		string3 = "How are you ".concat(string2);
		System.out.println("string3 : " + string3);
		//get length
		System.out.println("Length : " + string1.length());
		//get substring beginning with character 0, up to, but not
		//including character 5
		System.out.println("sub : " + string3.substring(0,5));
		//upper case
		System.out.println("upper : " + string3.toUpperCase());
		
		String string4 = "How are you " + string2;
		System.out.println("string4 : " + string4);
		System.out.println("string : " + (string1 += string2));
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
	}

}
