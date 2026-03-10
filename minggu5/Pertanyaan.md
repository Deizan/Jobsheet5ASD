5.2.3
1. if (Base Case):
   Kondisi penghenti rekursi (base case)
   Mencegah infinite recursion
   Mengembalikan nilai paling dasar tanpa pemanggilan rekursif

   else (Recursive Case):
   Melakukan pemecahan masalah (divide)
   Method memanggil dirinya sendiri dengan parameter lebih kecil
   Terus berjalan hingga mencapai base case
2. Ya, memungkinkan! Berikut bukti dengan while loop:
   public static int faktorialBF_While(int n) {
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto *= i;
        i++;
    }
    return fakto;
}
3. fakto *= i; (Brute Force - Iterative):
   fakto *= i adalah shorthand dari fakto = fakto * i
   Mengalikan hasil sebelumnya dengan nilai i yang baru
   Variabel fakto terus diperbarui di dalam loop
   Operasi dilakukan berulang kali dalam 1 method
   Hasilnya disimpan dan diakumulasi dalam satu tempat

   return n * faktorialDC(n-1); (Divide Conquer - Recursive):
   Memanggil diri sendiri dengan parameter n-1
   Menunggu hasil dari faktorialDC(n-1) sebelum mengalikan
   Operasi tidak langsung selesai, tapi ditunda hingga rekursi selesai
   Setiap pemanggilan membuat call stack baru

4.  Keduanya efektif untuk factorial, tetapi BF lebih praktis untuk kasus ini karena lebih   efisien memory. DC lebih berguna untuk masalah kompleks seperti merge sort atau quick sort.

5.3.3
1. pangkatBF()
   Perulangan iteratif, Loop berulang kali.

   pangkatDC()
   Rekursi pembagian masalah, implementasinya Panggil diri sendiri.

2. YA, sudah termasuk! Tahap combine adalah perkalian pada rekursi.
   Tahap Divide Conquer:

   DIVIDE → pangkatDC(nilai, pangkat - 1) (pecah masalah lebih kecil)
   CONQUER → Recursive call menyelesaikan sub-masalah
   COMBINE → nilai * pangkatDC(nilai, pangkat - 1) ✓ (gabungkan hasil)

3. RELEVAN, karena:
   Membuat method lebih fleksibel & reusable
   Bisa memanggil: pangkatBF(5, 3), pangkatBF(2, 8) dengan nilai berbeda
   YA, bisa tanpa parameter! Menggunakan atribut class. Berikut implementasinya:
   public class Pangkat {
    private int nilai;
    private int pangkat;
    
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
    
    // Method tanpa parameter - Brute Force
    public int pangkatBF() {
        int hasil = 1;
        for (int i = 1; i <= this.pangkat; i++) {
            hasil *= this.nilai;
        }
        return hasil;
    }
    
    // Method tanpa parameter - Divide Conquer
    public int pangkatDC() {
        return pangkatDC_Helper(this.nilai, this.pangkat);
    }
    
    private int pangkatDC_Helper(int nilai, int pangkat) {
        if (pangkat == 0) {
            return 1;
        }
        else {
            return nilai * pangkatDC_Helper(nilai, pangkat - 1);
        }
    }
}
4. Cara Kerja pangkatBF() dan pangkatDC()
Kesimpulan:
pangkatBF() (Brute Force):

✓ Iterasi langsung mengalikan nilai berkali-kali dalam loop
✓ Cepat & efisien karena memory minimal
✓ Mudah dipahami - langsung dari bawah ke atas
✗ Tidak menunjukkan prinsip Divide & Conquer
pangkatDC() (Divide Conquer):

✓ Membagi masalah menjadi sub-masalah lebih kecil
✓ Elegan & recursive - pendekatan "berpikir rekursif"
✓ Mendemonstrasikan paradigma Divide & Conquer
✗ Lebih lambat & memory lebih banyak (call stack)
Persamaan:

Keduanya hasil akhirnya sama
Jumlah operasi perkalian sama (p kali)
Keduanya menggunakan parameter yang sama

5.4.3
1. Mencari titik tengah array.
   Untuk membagi masalah menjadi 2 sub-masalah:
   Bagian kiri: [awal ... mid]
   Bagian kanan: [mid+1 ... akhir].
2. DIVIDE: Membagi array menjadi 2 bagian
   CONQUER: Panggil diri sendiri untuk kedua bagian hingga base case
3. COMBINE: Menggabungkan hasil dari kedua sub-masalah.
   Total keseluruhan = total kiri + total kanan
4. Kondisi berhenti rekursi
   Ketika array sudah tidak bisa dibagi lagi
5. totalDC() adalah implementasi Divide & Conquer yang menunjukkan bagaimana masalah besar dapat dipecah menjadi sub-masalah lebih kecil, diselesaikan secara independen, dan hasilnya digabungkan untuk mendapatkan solusi akhir. Meskipun untuk total array iterasi lebih praktis, totalDC() sangat berharga untuk mempelajari paradigma Divide & Conquer yang berlaku pada masalah lebih kompleks seperti merge sort, quick sort, dan binary search.