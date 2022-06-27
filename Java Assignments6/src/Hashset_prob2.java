import java.util.HashSet;

public class Hashset_prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Contact c1 = new Contact(123456789,"Chetan","Chetan@gmail.com",Contact.Gender.Male); 
      Contact c2 = new Contact(987654321,"Xyx","Xyz@gmail.com",Contact.Gender.Female); 
      Contact c3 = new Contact(456789123,"Abc","abc@gmail.com",Contact.Gender.Male); 
      
      
      
      HashSet<Contact> hs= new HashSet<>();
      hs.add(c1);
      hs.add(c2);
      hs.add(c3);
      
      
      System.out.println(hs);
      
     System.out.println("------------------------------------------------------------------------------");
      for(Contact c : hs) {
    	  System.out.println(c);
      }
      System.out.println("------------------------------------------------------------------------------");
      
      
      
	}

}
