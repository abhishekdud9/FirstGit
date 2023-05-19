public class MyMultiply {
    public int multiply(int a,int b){
       int c=a*b;
       return c;
    }
    public static void main(String []args){
        MyMultiply mm=new MyMultiply();
       int res= mm.multiply(5,4);
        System.out.print(res);

    }
}
