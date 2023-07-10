import java.lang.*;
class CmdLine
{
    public static void main(String args[])
     {
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

