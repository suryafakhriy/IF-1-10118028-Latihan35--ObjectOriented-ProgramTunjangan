/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan35.objectoriented.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author User
 *  NAMA      : Surya Fakhriy Hasbi
    KELAS     : IF-01 2018
    NIM       : 10118028
    DESKRIPSI :(Object Oriented) Program Tunjangan

 */
public class IF110118028Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);
    }
    
}
