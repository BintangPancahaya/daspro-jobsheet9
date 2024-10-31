import java.util.Scanner;
public class Tugas105 {
 public static void main(String[] args) {
    Scanner input05 = new Scanner(System.in);

    System.out.print("Masukkan banyaknya mahasiswa yang diinput: ");
    int mhs = input05.nextInt();

    double total = 0, tertinggi = 0, terendah = 100;
    double nilaiMhs[] = new double[mhs];

    for (int i=0;i<mhs;i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = input05.nextDouble();
    }
    for (int i=0;i<mhs;i++) {
        total += nilaiMhs[i];
    }
    double rata2 = total/mhs;
    System.out.println("Rata-rata nilai mahasiswa adalah "+rata2);
    for (int i=0;i<mhs;i++) {
        if (nilaiMhs[i] > tertinggi) {
            tertinggi = nilaiMhs[i];
        } else if (nilaiMhs[i] < terendah) {
            terendah = nilaiMhs[i];
        }
    }
    System.out.println("Nilai mahasiswa yang tertinggi "+tertinggi);
    System.out.println("Nilai mahasiswa yang terendah "+terendah);
    for (int i=0;i<mhs;i++) {
    System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah "+nilaiMhs[i]);
    }
    input05.close();
 }   
}
