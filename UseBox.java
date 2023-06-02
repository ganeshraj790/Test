package lms;

public class UseBox {
	public static void main(String[] args) {
		Box b=(length,breadth,height)->length*breadth*height;
	
		System.out.println(b.cube(40, 50, 60));
	}

}
