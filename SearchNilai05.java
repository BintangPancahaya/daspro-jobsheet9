import java.util.Scanner;
public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int key = 90;
        
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int mhs = input05.nextInt();
        int nilai[] = new int[mhs];

        for (int i=0;i<mhs;i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai[i] = input05.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin di cari: ");
        key = input05.nextInt();

        for (int i=0;i<mhs;i++) {
            if (key == nilai[i]) {
                System.out.print("Nilai "+nilai[i]+" ketemu, merupakan nilai mahasiswa ke-"+(i+1));
                break;
            } else if (key != nilai[i] && i==(mhs-1)) {
                System.out.print("Nilai tidak ketemu! coba lagi");
                break;
            }
        }
    }   
}