// Constructor
public class File011 {

    String name;
    int age;
    File011(String n, int a)
    {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        File011 obj = new File011("Student", 20);
        System.out.println(obj.name+""+obj.age);
    }
    
}
