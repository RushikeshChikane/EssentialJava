package StringBuilder;

public class SetCharacter {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Welcome transflower");
		
		//set character no 3 with e
		sb.setCharAt(3, 'e');
		System.out.println(sb);

	}

}
