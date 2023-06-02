package lms;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e=(a,b)->a+b;
		Employee f=(v,m)->v*m;
		System.out.println(f.salary(5, 5));
		System.out.println(e.salary(200, 200));
	}

}
