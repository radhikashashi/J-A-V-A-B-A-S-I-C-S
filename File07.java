public class File07 

{

    int classLevelVariable = 204;

    void method() 

    {

        File07 obj = new File07();

        System.out.println(obj.classLevelVariable);

    }

    public static void main(String[] args)
    
    {
        File07 obj = new File07();

        obj.method();

        System.out.println(obj.classLevelVariable);

    }

}