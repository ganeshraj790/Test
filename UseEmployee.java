package iterator;
import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("ram",25000,101);
		Employee e2=new Employee("gokul",25000,102);
		Employee e3=new Employee("ramesh",30000,103);
		Employee e4=new Employee("raman",20000,104);
		Employee e5=new Employee("hari",24000,105);
		HashMap<Integer,Employee>emp=new HashMap<>();
		emp.put(e1.getid(), e1);
		emp.put(e2.getid(), e2);
		emp.put(e3.getid(), e3);
		emp.put(e4.getid(), e4);
		emp.put(e5.getid(), e5);
		Iterator<Employee>itr=emp.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getid()<=101) {
				itr.remove();
			}
		}
		emp.forEach((x,y)->System.out.println(y));
		
		
	}

}
