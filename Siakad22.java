import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        String nilaiAkhirHuruf; 
        String nilaiAkhirKualifikasi;

        
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = ((nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35));
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if(nilaiAkhir <= 39) {
            nilaiAkhirHuruf = "E";
            nilaiAkhirKualifikasi = "Gagal";
        }
        else if (nilaiAkhir >= 40 && nilaiAkhir <=50) {
            nilaiAkhirHuruf = "D";
            nilaiAkhirKualifikasi = "Kurang";
        }
        else if (nilaiAkhir >= 51 && nilaiAkhir <=60) {
            nilaiAkhirHuruf = "C";
            nilaiAkhirKualifikasi = "Cukup";
        }
        else if (nilaiAkhir >= 61 && nilaiAkhir <=65) {
            nilaiAkhirHuruf = "C+";
            nilaiAkhirKualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir >=66 && nilaiAkhir <=73) {
            nilaiAkhirHuruf = "B";
            nilaiAkhirKualifikasi = "Baik";
        }
        else if (nilaiAkhir >=74 && nilaiAkhir <=80) {
            nilaiAkhirHuruf = "B+";
            nilaiAkhirKualifikasi = "Lebih dari baik";
        }
        else {
            nilaiAkhirHuruf = "A";
            nilaiAkhirKualifikasi = "Sangat Baik";
        }
        
        System.out.println("Nilai huruf: " + nilaiAkhirHuruf);
        System.out.println("Nilai kualifikasi: " + nilaiAkhirKualifikasi);
    }
}