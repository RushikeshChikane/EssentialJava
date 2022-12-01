package StringBuilder;

public class DeleteChar {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Welcome transflower");
	  //deleting char from string
		sb.delete(2, 4);
		System.out.println(sb);
	}

}
