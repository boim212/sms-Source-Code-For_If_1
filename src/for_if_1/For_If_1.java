package for_if_1;

import java.util.Scanner;

public class For_If_1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int masuk, baris, kolom;
        byte titik;
        titik = '.';
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Min 2) = ");
            masuk = input.nextInt();
        }
        while(masuk < 2);
        
        System.out.println("");
        System.out.println("+-----Tugas For if 1 -----+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 0; kolom < masuk; kolom++) 
            {
                if(kolom <= baris)
                {
                    System.out.printf("%3d ", kolom);
                }
                else
                {
                    System.out.printf("%3c ", titik);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
