interface Calci{
public abstract int getSum(int n1,int n2);
}
class ClaiciImpl implements Calci{
public int getSum(int n1,int n2){
return n1+n2;
}

}