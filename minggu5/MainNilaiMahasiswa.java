package minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {

        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = NilaiMahasiswa.maxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        int minUTS = NilaiMahasiswa.minUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = NilaiMahasiswa.rataUAS(nilaiUAS);

        System.out.println("Nilai UTS Tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS Terendah (Divide and Conquer): " + minUTS);
        System.out.println("Rata-rata Nilai UAS (Brute Force): " + rataUAS);
    }
}