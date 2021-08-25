public class App {
    
    public static void main(String[] args) {
        
    Cat cat1  = new Cat("Grizabella","White",83);
    // cat1.changeYourName("Grizabella");
    // cat1.dyeYourFur("White");
    // cat1.setAge(83);

    ausgabe("RAM-Adresse: " + cat1.tellYourAddress());
    ausgabe("Name: " + cat1.tellYourName());
    ausgabe("Farbe: " + cat1.tellYourColor());
    ausgabe("Alter: " + cat1.tellYourAge());
    ausgabe("Alter: " + cat1.tellYourAlter());
    // ausgabe(cat1.name);
    
    // ausgabe("Blick von aussen: " + cat1);
    // ausgabe("Blick von innen: " + cat1.tellYourAddress());

    ausgabe("");
    ausgabe("--------------------");
    ausgabe("");

    Cat cat2  = new Cat("Alonzo","Brown",42); 
    // cat2.changeYourName("Alonzo");
    // cat2.dyeYourFur("Brown");
    // cat2.setAge(42);

    ausgabe("RAM-Adresse: " + cat2.tellYourAddress());
    ausgabe("Name: " + cat2.tellYourName());
    ausgabe("Farbe: " + cat2.tellYourColor());
    ausgabe("Alter: " + cat2.tellYourAge());
    // ausgabe(cat2.name);

    ausgabe("");
    ausgabe("--------------------");
    ausgabe("");
  
    Cat cat3 = new Cat("Blitzo","Red",32);
    ausgabe("RAM-Adresse: " + cat3.tellYourAddress());
    ausgabe("Name: " + cat3.tellYourName());
    ausgabe("Farbe: " + cat3.tellYourColor());
    ausgabe("Alter: " + cat3.tellYourAge());

    // ausgabe("Blick von aussen: " + cat2);
    // ausgabe("Blick von innen: " + cat2.tellYourAddress());
    }


    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
