import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	public boolean enabled() default false;
   String test() default "Running";
}
public class CustomAnnotation {
	
	@Test(enabled=true)
	public void testCaseMethod(){
	//	if(false)              
		System.out.println("This is custom annotation");
		
	}
	
	

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		CustomAnnotation ca= new CustomAnnotation();
		Method c=ca.getClass().getMethod("testCaseMethod");
		Annotation a=c.getAnnotation(Test.class);
		Test t=(Test) a;
		System.out.println(t.test());
		if(t.enabled())
			ca.testCaseMethod();
			
	}
	

}
