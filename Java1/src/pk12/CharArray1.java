package pk12;

public class CharArray1 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch='a';
		
		for(int i=0; i<alphabets.length; i++,ch++) {
			alphabets[i] = ch;
			
			//System.out.println(alphabets[i]);
		}
		for(int i=0; i<alphabets.length; i++) {
			
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}
