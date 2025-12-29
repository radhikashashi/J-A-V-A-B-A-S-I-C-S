public class File05 {
    public static void main(String[] args) {
        // String S1 = " J o h n";

        // System.out.println(S1.toUpperCase());
        // System.out.println(S1.toLowerCase());

        // String S = "H E L L O W O R L D";
        // System.out.println(S.trim());

        // String S = "Automation Testing";
        // System.out.println(S.contains("Testing"));

        // String S = "Java Programming";
        // System.out.println(S.startsWith("Java"));
        // System.out.println(S.endsWith("ing"));

        String S = "Java, Python, C++";
        String arr[] = S.split(",");
        for(String lang:arr) 
        {
            System.out.println(lang+"");
        }
    }
}
