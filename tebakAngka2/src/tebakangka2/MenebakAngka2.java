/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

import java.util.Scanner;

/**
 *
 * @author Alvi
 */
public class MenebakAngka2 {
    int tebak;
    int random;
    int jumlah;
    int score;
    int bonus;
    int totalScore;
    void menebak(){
        random = (int)(Math.random()*100);
        System.out.println("Hai.. nama saya Mr. Number, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya :)");
        Scanner tebakan = new Scanner(System.in);
        jumlah = 0;
        score = 100;
        do{
            jumlah ++;
            System.out.println("Masukkan bilangan tebakan Anda:");
            tebak = tebakan.nextInt();
            score = 100 - jumlah*2;
            bonus = 0;
            if (jumlah <= 5){
                bonus = bonus + 50;
            }
            if (score == 0){
                System.out.println("Sory, Skor anda 0, Permainan telah berakhir :)");
            }
            totalScore = bonus + score;
            // Membandingkan inputan user dengan yang dirandom komputer
            if (tebak > random){
                System.out.println("Hehehe, bilangan tebakan anda terlalu besar");
            } 
            else if (tebak < random){
                System.out.println("Hehehe, bilangan tebakan anda terlalu kecil");    
            }
            else {
                 System.out.println("Yay… Bilangan tebakan anda BENAR :)");
                 System.out.println("Score = " + score);
                 System.out.println("Bonus = " + bonus);
                 System.out.println("Total Score = " + totalScore);
            }
        }while (tebak != random);
    }
}
