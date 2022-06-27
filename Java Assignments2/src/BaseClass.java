abstract class Shape {
	
	  abstract void draw();

}
   class line extends Shape {

	@Override
	void draw() {
		
		// TODO Auto-generated method stub
		System.out.println("Drawing line ");
		
		
	}
   }
	class Rectangle extends Shape {

			@Override
			void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing Rectangle");
				
			}
	}
	class Cube extends Shape {

					@Override
					void draw() {
						// TODO Auto-generated method stub
						
						System.out.println("Drawing Cube");
						
					}
	
			  }

public class BaseClass {
	public static void  main(String[]arg) {
		  
		  Shape sp =new line();
		  sp.draw();
		  Shape r = new Rectangle();
		  r.draw();
		  Shape c = new Cube();
		  c.draw();
		  
	  }


}
