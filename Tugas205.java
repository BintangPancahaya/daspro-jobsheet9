import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int total = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        int pesan = input05.nextInt();
        input05.nextLine();

        String nama[] = new String[pesan];
        int harga[] = new int[pesan];

        for (int i=0;i<pesan;i++) {
        System.out.print("Masukkan nama makanan/minuman: ");
        nama[i] = input05.nextLine();
        System.out.print("Masukkan harga: ");
        harga[i] = input05.nextInt();
        input05.nextLine();
        total += harga[i];
        }
        for (int i=0;i<pesan;i++) {
        System.out.println("Pesanan: "+nama[i]);
        System.out.println("Harga: "+harga[i]);
        }
        for (int i=0;i<pesan;i++) {
            if (i==0) {
        System.out.println("Pesanan yang dipesan:");
            }
        System.out.println(nama[i]);
    }
    System.out.println("Total biaya: "+total);

    input05.close();
    }
}
