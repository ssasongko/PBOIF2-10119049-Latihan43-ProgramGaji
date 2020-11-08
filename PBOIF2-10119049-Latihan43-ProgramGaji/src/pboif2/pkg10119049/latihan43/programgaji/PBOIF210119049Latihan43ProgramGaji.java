package pboif2.pkg10119049.latihan43.programgaji;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program penggajian pegawai
**/
import Instansi.Pegawai;
import java.util.Scanner;
public class PBOIF210119049Latihan43ProgramGaji {
    public static void main(String[] args) {
        // instance the object
        Scanner scan = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jl. Semar dlm 4 No 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(pegawai.getUangTransport(),pegawai.getUangTunjangan(), pegawai.getGajiPokok()));
        pegawai.tampilData(pegawai.getNama(),pegawai.getAlamat(),pegawai.getUangTransport(),pegawai.getUangTunjangan(),pegawai.getGajiPokok(),pegawai.getTotalGaji());
        
    }
    
}
