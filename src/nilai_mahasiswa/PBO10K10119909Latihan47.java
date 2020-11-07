package nilai_mahasiswa;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan47 {

    public static void main(String[] args) {
        double quiz, uts, uas, nilai_akhir;
        String indeks, keterangan;
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.print("QUIZ\t\t\t= ");
        mhs1.setNilaiQuiz(scanner.nextDouble());
        System.out.print("UTS\t\t\t\t= ");
        mhs1.setNilaiUTS(scanner.nextDouble());
        System.out.print("UAS\t\t\t\t= ");
        mhs1.setNilaiUAS(scanner.nextDouble());

        quiz = mhs1.getNilaiQuiz();
        uts = mhs1.getNilaiUTS();
        uas = mhs1.getNilaiUAS();
        nilai_akhir = mhs1.nilaiAkhir(quiz,uts,uas);
        indeks = mhs1.indexNilai(nilai_akhir);

        System.out.println("\nNilai Akhir\t\t= "+ nilai_akhir);
        System.out.println("\nIndex = "+ indeks);
        System.out.println("Keterangan = "+ mhs1.keteraganNilai(indeks));
    }
}
