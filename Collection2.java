import java.util.*;

class Collection2
{
    public static void main(String A[])
    {
        Stack <String> sobj = new Stack<String>();

        sobj.push("C proggraming");
        sobj.push("C++ programming");
        sobj.push("Java programming");
        sobj.push("Python Programming");

        System.out.println(sobj);

        String ret = sobj.pop();

        System.out.println(ret);

        System.out.println(sobj);
        
    }
}