public class InvertTriangel {
    public static void main(String[] args) {
        int n=11;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //i==0 && j>0 && j<(n-1)/2
                if((i-j==(n-1)/2||(i>=(n-1)/2&&i-j<=(n-1)/2&&i+j<=(n-1)+(n-1)/2)||i+j==(n-1)+(n-1)/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
