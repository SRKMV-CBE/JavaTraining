abstract class Bank{
    /*Abstract Is Used For Common Behaviour And Properties...
    It Is Compulsory Overridden in SubSequence Class ...*/
    abstract public void RateOfInterest();
    public int principle=10000;
    public double roi;
}
class sbi extends Bank{
    public void RateOfInterest(){
        roi=principle*(11.4/100);
        double Total=principle+roi;
        System.out.println("Rate Of Interest Of sbi : "+roi);
        System.out.println("Total Amount Of Repayment : "+Total);
        System.out.println("-------------------------------------- ");
    }
}
class iob extends Bank{
    public void RateOfInterest(){
        roi=principle*(8.0/100);
        double Total=principle+roi;
        System.out.println("Rate Of Interest iob : "+roi);
        System.out.println("Total Amount Of Repayment : "+Total);                System.out.println("-------------------------------------- ");
    }
}
class bob extends Bank{
    public void RateOfInterest(){
        roi=principle*(8.0/100);
        double Total=principle+roi;
        System.out.println("Rate Of Interest bob : "+roi);
        System.out.println("Total Amount Of Repayment : "+Total); 
        System.out.println("-------------------------------------- ");   
    }
}
class canara extends Bank{
    public void RateOfInterest(){
        roi=principle*(22.2/100);
        double Total=principle+roi;
        System.out.println("Rate Of Interest canara : "+roi);
        System.out.println("Total Amount Of Repayment : "+Total);
        System.out.println("-------------------------------------- ");
    }
}
class kvb extends Bank{
    public void RateOfInterest(){
        roi=principle*(43.0/100);
        double Total=principle+roi;
        System.out.println("Rate Of Interest kvb : "+roi);
        System.out.println("Total Amount Of Repayment : "+Total);
        System.out.println("-------------------------------------- ");
    }
}

class TestBalance{
    public static void main(String args[]){
        Bank s=new sbi();
        s.RateOfInterest();
        Bank i=new iob();
        i.RateOfInterest();
        Bank b=new bob();
        b.RateOfInterest();
        Bank c=new canara();
        c.RateOfInterest();
        Bank k=new kvb();
        k.RateOfInterest();
    }
}
