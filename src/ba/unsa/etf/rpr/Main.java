package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int x){
        int s=0;
        while(x>0){
            int c=x%10;
            x/=10;
            s+=c;
        }
        return s;
    }
    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi n: ");
        n = ulaz.nextInt();
        for(int i=1; i<n; i++){
            int ss = sumaCifara(i);
            if(i%ss==0) System.out.println(i);
        }
    }
}
