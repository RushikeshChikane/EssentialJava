package String;

public class SubString {

	public static void main(String[] args) {
		//subString is used for getting only required from string or sentence,
		
		String name="TonntStark";
		//it gives String from 0 index to 5th index
		System.out.println(name.substring(0, 5));
		//it gives from 5 index to last index of string
		System.out.println(name.substring(5, name.length()));

	}

}
