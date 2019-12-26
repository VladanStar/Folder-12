
package javamtnajvecibrojdelilaca;

import java.util.Scanner;

public class JavaMTNajveciBrojDelilaca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int brojSaNajBrojemDelilaca = 1;
       int maxBrojDelioca = 1;
       int brojDelioca = 0;
        System.out.println("Unesite gornju granicu intervala (vecu od 1)");
        System.out.println("u kojem se trazi broj sa najvecim brojem delioca.");
        int n = input.nextInt();
        for(int k=1; k<=n;k++){
            brojDelioca = 0;
            for(int j=1; j<=k; j++)
                if(k%j==0)
                    brojDelioca++;
            if(maxBrojDelioca < brojDelioca){
                maxBrojDelioca = brojDelioca;
                brojSaNajBrojemDelilaca = k;
            }
        
        }
        System.out.println("Broj sa najvecim brojem delioca je: " + brojSaNajBrojemDelilaca);
        System.out.println("Broj delioca tog broja je: " + brojDelioca);
    }
    
}
