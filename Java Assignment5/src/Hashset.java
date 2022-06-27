import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employeee> s = new HashSet<>();
		Employeee e = new Employeee(1, "Chetan ", 300000, "Analyst");
		s.add(e);
       e.displayDetails();
	   System.out.println(s);
	}

}
