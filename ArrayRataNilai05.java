import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int lulus = 0;
        int mhs;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        mhs = input05.nextInt();

        for (int i=0;i<mhs;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input05.nextInt();
        }
        for (int i=0;i<nilaiMhs.length;i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        rata2 = total/mhs;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Mahasiswa yang lulus ada "+lulus);

        input05.close();
    }
}
