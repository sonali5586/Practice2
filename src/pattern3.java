public class pattern3 {
    public static void main (String arg[]){

        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
            {

                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=1;i<=4;i++){

        for (int j=3;j>=i;j--) //(j=1 do take it we need 3 colm )
        {
            System.out.print("*");

        }
            System.out.println();

        }


    }
}
