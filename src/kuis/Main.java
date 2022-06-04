
package kuis;

import java.util.Scanner;
import perhitungan.Web;
import perhitungan.Android;
public class Main {

    
    public static void main(String[] args) {
       int menu;
        
        Scanner input = new Scanner(System.in); 
        Scanner inputString = new Scanner(System.in);
        
       
        System.out.println("FORMULIR PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Develompent");
        System.out.print("Pilih Jenis Formulir : ");
        menu = input.nextInt();
        
        System.out.println("\nFORMULIR PENDAFTARAN\n");
        System.out.print("Input NIK : ");
        String nik = inputString.nextLine();
        
        System.out.print("Input Nama : ");
        String nama = inputString.nextLine();
        
        System.out.print("Input Nilai Tes Tulis : ");
        double tesTulis = input.nextDouble();
        
        System.out.print("Input Nilai Tes Coding : ");
        double tesCoding = input.nextDouble();
        
        System.out.print("Input Nilai Tes Wawancara : ");
        double tesWawancara = input.nextDouble();
        if(menu == 1){
            Android Andro = new Android(nama, nik, tesTulis, tesCoding, tesWawancara);
            while(true){
                Andro.hitungHasil();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.println("\nFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis : ");
                        tesTulis = input.nextDouble();
                        Andro.setNilaiTulis(tesTulis);
                        
                        System.out.print("Input Nilai Tes Coding : ");
                        tesCoding = input.nextDouble();
                        Andro.setNilaiCoding(tesCoding);

                        System.out.print("Input Nilai Tes Wawancara : ");
                        tesWawancara = input.nextDouble();
                        Andro.setNilaiWawancara(tesWawancara);
                        
                        break;
                    case 2 :
                        System.out.println("Nilai Akhir : "+Andro.getHitungHasil());
                        if(Andro.getHitungHasil() >= 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada "+Andro.getNama()+" telah diterima sebagai Android");
                        }else{
                            System.out.println("KETERANGAN : GAGAL");
                            System.out.println("Mohon maaf kepada "+Andro.getNama()+" telah ditolak sebagai Android");
                        }
                        break;
                    case 3 :
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        }else if(menu == 2){
            Web Web = new Web(nama, nik, tesTulis, tesCoding, tesWawancara);
             while(true){
                Web.hitungHasil();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.println("\nFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis : ");
                        tesTulis = input.nextDouble();
                        Web.setNilaiTulis(tesTulis);
                        
                        System.out.print("Input Nilai Tes Coding : ");
                        tesCoding = input.nextDouble();
                        Web.setNilaiCoding(tesCoding);

                        System.out.print("Input Nilai Tes Wawancara : ");
                        tesWawancara = input.nextDouble();
                        Web.setNilaiWawancara(tesWawancara);
                        
                        break;
                    case 2 :
                        System.out.println("Nilai Akhir : "+Web.getHitungHasil());
                        if(Web.getHitungHasil() >= 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada "+Web.getNama()+" telah diterima sebagai Web");
                        }else{
                            System.out.println("KETERANGAN : GAGAL");
                            System.out.println("Mohon maaf kepada "+Web.getNama()+" telah ditolak sebagai Web");
                        }
                        break;
                    case 3 :
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        }       
    }   
    
}
