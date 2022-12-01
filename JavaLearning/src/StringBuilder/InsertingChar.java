package StringBuilder;

public class InsertingChar {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Welcome transflower");
		
		//inserting character
		sb.insert(0, 's');
		System.out.println(sb);

	}

}
