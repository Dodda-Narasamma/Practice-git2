import java.util.*;
interface Calci{
public abstract int getSum(int n1,int n2);
}
class CalciImpl implements Calci{
public int getSum(int n1,int n2){
return n1+n2;
}

}
class Main4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
   System.out.println("enter a num1");
int n1=sc.nextInt();
    System.out.println("enter a num2");
int n2=sc.nextInt();
CalciImpl c=new ClaciImpl();
   int n3=c.getSum(n1,n2);
System.out.println(n3);
}
}
