import java.util.Scanner;
public class Tugas105 {
 public static void main(String[] args) {
    Scanner input05 = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa: ");
    int mhs = input05.nextInt();

    double total = 0;

    for (int i=1;i<=mhs;i++) {
        double nilaiMhs[] = new double[i];
        System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
        nilaiMhs[i] = input05.nextDouble();
    
    for (int j=0;i<nilaiMhs.length;j++) {
        total += nilaiMhs[j];
     }
     double rata2 = total/nilaiMhs.length;
    }
 }   
}
