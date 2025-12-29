// Methods

public class File06
{

    int add(int a, int b) {

    int c = a +  b;
    return c;
    }

    public static void main(String[] args) 
    {
        File06 obj = new File06();
        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
