import java.util.ArrayList;

public class LambdaAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array= new ArrayList<>();
		array.add("Chetan");
		array.add("Xyz");
		array.add("Abc");
		
		array.removeIf( n->(n.length()%2!=0));
		for(String s:array) {
			System.out.println(s);
		}
		

	}

}
