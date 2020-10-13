public class FiboRec {
    static  int a=0,b=1,c;

    public static void main(String[] args) {
        System.out.println( a+" "+b);
        FiboRec sc=new FiboRec();
        sc.Printfib(15);

    }

    private void Printfib(int i) {

        if(i>=15)
        {

            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            Printfib(i-1);


        }

    }

}
