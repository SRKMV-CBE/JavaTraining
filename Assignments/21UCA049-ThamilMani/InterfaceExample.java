import java.util.Scanner;
interface student{
    public void Mark();
    public void StdAttends();
    public void Activities();
}
interface staff{
    public void StfAttends();
    public void UpdateSkill();
}
class college implements student,staff{
    public void Mark(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Mark One By One : ");
        int s1=input.nextInt();
        int s2=input.nextInt();
        int s3=input.nextInt();
        int s4=input.nextInt();
        int Total=s1+s2+s3+s4;
        int per=Total/4;
        System.out.println("Total Mark Of Students : "+Total);
        System.out.println("Percentage of Studens : "+per);
        
    }
    public void StdAttends(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Student is Present Or Not (1 or 0): ");
              int attendsss=input.nextInt();
        if(attendsss==1)
        System.out.println("Student Is Present...");
        else
        System.out.println("Student Is Absentee...");
    }
    public void Activities(){
         Scanner input=new Scanner(System.in);
        System.out.println("Enter The Student Involve Activity or Not (1 or 0): ");
              int Involved=input.nextInt();
        if(Involved==1)
        System.out.println("The Student Involved Is Active");
        else
        System.out.println("The Student Not Involved Any Active");
    }
    public void StfAttends(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Staff is Present Or Not (1 or 0): ");
       int attendsss=input.nextInt();
        if(attendsss==1)
        System.out.println("Staff Is Present...");
        else
        System.out.println("Staff Is Absent....");
    }
    public void UpdateSkill(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Staff Upgrade His Skill (1 or 0): ");
       int upgradeornot=input.nextInt();
       if(upgradeornot==1){
        System.out.println("If The Staff Upgrade His Skill Which Subjects (eg.java): ");
        String update=input.next();
        System.out.println("Staff Upgrade In : "+update);
       }
       else{
        System.out.println("Staff Is No Upgrade His Skill,He Idle,please Upgrade");
       }
    }
}
class InterfaceExample{
    public static void main(String args[]){
        student s=new college();
        s.Mark();
        s.StdAttends();
        s.Activities();
        staff ss=new college();
        ss.StfAttends();
        ss.UpdateSkill();
    }
}
