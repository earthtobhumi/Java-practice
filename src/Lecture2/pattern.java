package Lecture2;

public class pattern {
    public static void main(String[] args) {
        int n=5;
        int nsp=3;
        for(int row = 0; row<n; row++){
            for(int cst=0;cst<n;cst++) {
                if(row==0 || row==n-1){
                    System.out.print("*");
                }
                else{
                    for(int csp=0;csp<nsp;csp++){
                        System.out.println();
                    }
                }
            }
        }
    }
}
