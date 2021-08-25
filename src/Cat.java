public class Cat {
    
    // Attribut | Field | Property
    private String name = "nobody";
    private String furColor;
    private int age;
    
    // Constructor
    Cat(String name, String furColor, int age){
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }



    public Cat tellYourAddress(){
        return this;
    }

    String tellYourName(){
        return this.name;
    }

    public void changeYourName(String name){
        this.name = name;
    }

    String tellYourColor(){
        return this.furColor;
    }
    
    public void dyeYourFur(String furColor){
        this.furColor = furColor;
    }

    Integer tellYourAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    // Age String
    String alter = Integer.toString(age);
    String alter2 = "" + age;

    String tellYourAlter(){
        return String.valueOf(age);
    }
}
