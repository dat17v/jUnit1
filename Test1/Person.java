public class Person {
   private String firstname;
   private String lastname;
   
   public Person(String firstname, 
      String lastname) {
      
      this.firstname = firstname;
      this.lastname = lastname;
   }
   
   public String getFirstname() {
      return firstname;
   }
   
   public static void main(String args[]) {
      System.out.println("Hej");
   }
}