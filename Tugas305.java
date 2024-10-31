import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String nama;
        
        
            System.out.print("Masukkan nama makanan/minuman: ");
            nama = input05.nextLine();
            

        for (int i=0; i<menu.length; i++) {
            if (nama.equalsIgnoreCase(menu[i])) {
                System.out.print("Makanan/minuman ditemukan");
                break;
            } else if (nama != menu[i] && i==6) {
                System.out.print("Makanan/minuman tidak ditemukan");
                break;
            }
        }
            
    }
    
}
