import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//.......................deklarasi..........................//

        int baris=0, kolom=0, menu;
        String nama, next, kursi;
        String[][] penonton = new String[4][2];

//.....................perulangan..........................//

        while (true) {
            System.out.println("========== MENU BIOSKOP ==========");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih salah satu: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

//....................menu-1...............................//
            
            while (menu==1) {
                System.out.println("=== Input data penonton ===");
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data berhasil disimpan");

                        }else{
                        System.out.println("Kursi sudah terisi\n");
                        continue;
                        }
                } else {
                    System.out.println("Baris dan Kolom tidak valid\n");
                    continue;
                }
        
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                System.out.println();

                if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                    System.out.println();
            }

//..................menu-2.................................//

            while (menu==2) {
                for(int i = 0; i < penonton.length; i++){
                    for(int j = 0; j < penonton[i].length; j++){
                        kursi = penonton[i][j] == null ? "**" : penonton[i][j];
                        System.out.println(String.join(" || ", penonton[i]));
                        break;
                    }
                }
                System.out.println();
                break;
            }

//................menu-3...................................//

            while (menu==3) {
                System.out.println("========== Terima Kasih ==========");
                return;
            }
        }
    }
}
