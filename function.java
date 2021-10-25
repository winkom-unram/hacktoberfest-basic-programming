import java.util.Arrays; //Pendeklarasian library

public class function {
    public static int[] pengurutan(int[] angka){  //Pendeklarasian fungsi/method
        int panjang = angka.length; //Untuk mencari panjang array
        for(int i = 0; i < panjang - 1; i++){   //Proses pengurutan angka
            if(angka[i] > angka[i + 1]){
                int temp = angka[i];
                angka[i] = angka[i + 1];
                angka[i + 1] = temp;
                i = -1;
            }
        }
        return angka;
    }
    public static void main(String[] args) {
        int angka[] = {4, 6, 8, 10, 11, 16, 40, 5}; //Pendeklarasian dan inisialisasi array

        pengurutan(angka);  //Pemanggilan fungsi/method

        System.out.println("Pengurutan angka");
        System.out.print(Arrays.toString(angka));

    } 
}
