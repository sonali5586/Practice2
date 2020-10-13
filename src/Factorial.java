public class Factorial {
    public static void main(String[]args) {

        int n = 6;
        int fact = 1, i;
        for (i = 2; i <= n; i++) {
            fact = fact * i;


        }
        System.out.println(fact);
    }
}
//6!=6*5*4*3*2*1
//   =1*2*3*4*5*6
// fact=fact*1    1 is i value
//      2  =fact*2           2 is i value
//       6(2*3)  =fact*3
//       24(6*4)   = fact*4
