package Perhitungannilai07335;
import java.util.Scanner;

public class Perhitungannilai_07335 {
    
    public static void main(String[] args){
        int datamatkul07335, nilaimatkul07335, totalnilaimatkul07335;
        int rata07335;
        String matkul07335;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        datamatkul07335=input.nextInt();
        totalnilaimatkul07335 = 0;
        nilaimatkul07335 = 0;
        int i07335 = 1;
        
        do{
            i07335++;
            System.out.print("Masukkan Nilai Mata Kuliah: ");
            nilaimatkul07335 =input.nextInt();
            System.out.print("Masukkan Nama Mata Kuliah: ");
            matkul07335 =input.next();
            totalnilaimatkul07335 +=nilaimatkul07335;
        }while(i07335<=datamatkul07335);
        {
            rata07335 = totalnilaimatkul07335/datamatkul07335;
            System.out.println("\nNilai Rata-Rata Mata Kuliah: "+rata07335);
        }
        
        if(rata07335<=70){
            System.out.println("GUGUR");
        }else
            System.out.println("LULUS");
    }
}
