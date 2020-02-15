
public class Test {
    public static void main(String[] args){
        int n0 = 1;
        int n1 = 1;
        int n;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){
            n=n0+n1;
            System.out.print(n+" ");
            n0=n1;
            n1=n;
        }
        System.out.println();
    }
}