import java.util.Scanner;

public class TugasJS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//...................deklarasi.......................//

        int question[][] = new int[10][6];
        double rataRespon = 0;
        double rataTotal = 0;
        double[] rataPertanyaan = new double[question[0].length];

//................perulangan..........................//

        for(int i = 0; i < question.length; i++){
            System.out.printf("responden ke-%s\n", i+1);
            int j = 0;

            while(j < question[0].length){
                System.out.printf("pertanyaan %s [1-5]: ", j+1);
                question[i][j] = sc.nextInt();

                if(question[i][j] < 1 || question[i][j] > 5){
                    System.out.print("Masukkan jawaban yang benar [1-5]\n");
                    continue;
                }
                j++;
            }

        }

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("-------------Rata Rata-------------------");
        System.out.println("-----------------------------------------");


        for (int i = 0; i < question.length; i++) {
            System.out.printf("Responden %s: ", i + 1);
            rataRespon = 0;

            for (int j = 0; j < question[i].length; j++) {
               rataRespon += question[i][j];
               rataPertanyaan[j] += question[i][j];
            }

            rataRespon /= question[0].length;
            System.out.println(rataRespon);
            rataTotal += rataRespon;
        }
        
        System.out.println("Rata-rata Keseluruhann: " + rataTotal/question.length);

        for(int j = 0; j < rataPertanyaan.length; j++){
            rataPertanyaan[j] /= question.length;
            System.out.printf("\nRata-rata Soal ke-%s: %s", j+1, rataPertanyaan[j]);
        }


    }
}
