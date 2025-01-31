public class Singleton {
    private int age;
    private String name;
    private static final Singleton obj = new Singleton();
    private Singleton(){
        this.age = 10;
        this.name = "Small";
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public static Singleton getInstance(){
        return obj;
    }
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age;
    }
}
