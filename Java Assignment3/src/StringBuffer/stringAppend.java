package StringBuffer;

public class stringAppend {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb= new StringBuffer();
       sb.append("StringBuffer ");
       sb.append("is a peer class of String ");
       sb.append("that provides much of ");
       sb.append("the functionality of strings.");
       
       System.out.println(sb);
       System.out.println("-----------------------------------------------------------------------------");
       
       StringBuffer sb1=new StringBuffer("It is Used to _ at the specified index position");
       System.out.println(sb1);
       
       
     //  sb1.indexOf("Insert text", 14);
       sb1.insert(14,"Insert text");
       System.out.println(sb1);
       System.out.println("-----------------------------------------------------------------------------");
       
       StringBuffer sb2=new StringBuffer();
       sb2.append("This method returns the reversed object on which it was called");
       System.out.println(sb2);
       sb2.reverse();
       System.out.println(sb2);
	}


	

}

