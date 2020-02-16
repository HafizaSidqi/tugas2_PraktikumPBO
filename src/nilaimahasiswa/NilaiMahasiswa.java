//TUGAS 2 PRAKTIKUM PBO
//HAFIZA SIDQI AMINI
//123180130

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Ikhsan
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        Mahasiswa mhs = new Mahasiswa();
        nilai = new Poin();
        Scanner a = new Scanner(System.in);
        
        System.out.println("INPUT");
        System.out.println("Nama  : ");
        mhs.setName(a.nextLine());
        System.out.println("Nim   : ");
        mhs.setNim(a.nextLine());
        
        Scanner nilai_h = new Scanner(System.in);
        Scanner nilai_uts = new Scanner(System.in);
        Scanner nilai_uas = new Scanner(System.in);
        Scanner poin_tambahan = new Scanner(System.in);
        
        System.out.println("Nilai Harian : ");
        nilai.setNHarian(nilai_h.nextDouble());
        
        System.out.println("Nilai UTS : ");
        nilai.setNuts(nilai_uts.nextDouble());
        
        System.out.println("Nilai UAS : ");
        nilai.setNuas(nilai_uas.nextDouble());
        System.out.println("Nilai Murni : " + nilai.gettotalnilai());
        
        int jawab;
        System.out.println("Tambahan poin = ");
        jawab = poin_tambahan.nextInt();
        for(int i=0; i<jawab; i++)
            nilai.tambahpoin();
        
        System.out.println("OUTPUT");
        System.out.println("Nama  : " + mhs.getName());
        System.out.println("NIM   : " + mhs.getNim());
        System.out.println("Nilai : " + nilai.gettotalnilai());
    }
    
}
