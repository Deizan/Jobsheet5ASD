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