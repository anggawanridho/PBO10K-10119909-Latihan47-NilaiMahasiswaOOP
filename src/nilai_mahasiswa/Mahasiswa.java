package nilai_mahasiswa;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Mahasiswa {
    private double nilaiQuiz, nilaiUTS, nilaiUAS, akhir;
    private String index, keteranganNilai;

    public double getNilaiQuiz() {
        return nilaiQuiz;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiQuiz(double nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public double nilaiAkhir(double nilaiQuiz, double nilaiUTS, double nilaiUAS) {
        akhir = (0.2*nilaiQuiz)+(0.3*nilaiUTS)+(0.5*nilaiUAS);
        return akhir;
    }

    public String indexNilai(double akhir) {
        if (akhir>=80 && akhir<=100){
            index = "A";
        }
        else if (akhir>=68 && akhir<80){
            index = "B";
        }
        else if (akhir>=56 && akhir<68){
            index = "C";
        }
        else if (akhir>=45 && akhir<56){
            index = "D";
        }
        else if (akhir>=0 && akhir<45){
            index = "E";
        }
        return index;
    }

    public String keteraganNilai(String index) {
        switch (index){
            case "A":
                keteranganNilai = "Sangat Baik";
                break;
            case "B":
                keteranganNilai = "Baik";
                break;
            case "C":
                keteranganNilai = "Cukup";
                break;
            case "D":
                keteranganNilai = "Kurang";
                break;
            case "E":
                keteranganNilai = "Sangat Kurang";
                break;
        }
        return keteranganNilai;
    }
}
