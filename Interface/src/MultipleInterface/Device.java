package MultipleInterface;

public class Device implements Drawable, Printable,Readable,Writable {

	@Override
	public void Write() {
		System.out.println("Writing Information on pan");
		
	}

	@Override
	public void Read() {
		System.out.println("Reader Any data using Scanner");
		
	}

	@Override
	public void Print() {
		System.out.println("Printing any data using Printer");
		
	}

	@Override
	public void Draw() {
		System.out.println("Drawing ant Shape");
		
	}

	
}
