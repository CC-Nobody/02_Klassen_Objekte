public class App {
    
    public static void main(String[] args) {
        
    Cat cat  = new Cat(); 
    
    ausgabe("Blick von aussen: " + cat);
    ausgabe("Blick von innen: " + cat.tellYourAddress());
    // cat.tellYourAddress();
   
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
