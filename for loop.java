package com.latihan;
class Main {
    public static void main(String[] args) { 
        //// Feldy Novanda Mulkan
        /// Universitas Mataram 2021
        /// Hacktoberfest 2021
        /// 
        // Membuat variabel untuk menyimpan nilai dalam bentuk array 
        // Matriks pertama
        int matriks1[][] = new int [2][2];   
        matriks1[0][0] = 7;
        matriks1[0][1] = 1;
        matriks1[1][0] = 4;
        matriks1[1][1] = 8;
        // Matriks kedua
        int matriks2[][] = new int [2][2];   
        matriks2[0][0] = 5;
        matriks2[0][1] = 2;
        matriks2[1][0] = 8;
        matriks2[1][1] = 3;
        // Membuat variabel untuk menyimpan hasil penjumlahan
        int hasil[][] = new int [2][2];
        // Start
        //Menampilkan Angka dari matriks1
        System.out.println("Matriks 1");
        for(int x = 0; x < matriks1.length; x++){
            for (int y = 0; y < matriks1.length; y++){
                System.out.print( " [" + matriks1[x][y]+"]");
            }
            System.out.println(" ");
        }
        // End

        // Start
        // Menampilkan Angka dari matriks2 
        System.out.println("Matriks 2");
        for(int x = 0; x < matriks2.length; x++){
            for (int y = 0; y < matriks2.length; y++){
                System.out.print(" [" + matriks2[x][y]+"]");
            }
            System.out.println(" ");
        }
        // End

        // Start
        // Menjumlahkan matriks1 dan matriks2 kemudian hasil penjumlahan di simpan pada variabel hasil[][]
        System.out.println("Menjumlahkan kedua matriks");
        for(int a = 0; a < 2; a++){
            for (int b = 0; b < 2; b++){
                System.out.print(" [" + matriks1[a][b] + "] + [" + matriks2[a][b]+"]\n");
                hasil [a][b]=matriks1[a][b] + matriks2 [a] [b];
            }
        }
        // End

        // Start
        // Menampilkan hasil penjumlahan (hasil[][]) 
        System.out.println(" Hasil Penjumlahan");
        for (int d = 0; d < 2; d++) {
            for(int e = 0; e < 2; e++ ){
                System.out.print(" [" + hasil[d][e]+"]");
            }
            System.out.println(" ");
        }
        // End
    }   
}
