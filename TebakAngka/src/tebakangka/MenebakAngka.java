/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

/**
 *
 * @author Alvi
 */
import java.util.Scanner;

public class MenebakAngka {
    int tebak;
    int random;
    
    void menebak(){
        random = (int)(Math.random()*100);
        System.out.println("Hai.. nama saya Mr. Number, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya :)");
        Scanner tebakan = new Scanner(System.in);
        
        do{
            System.out.println("Masukkan bilangan tebakan Anda:");
            tebak = tebakan.nextInt();
            if (tebak > random){
                System.out.println("Hehehe, bilangan tebakan anda terlalu besar");
            } 
            else if (tebak < random){
                System.out.println("Hehehe, bilangan tebakan anda terlalu kecil");    
            }
            else {
                 System.out.println("Yay… Bilangan tebakan anda BENAR :)");
            }
        }while (tebak != random);
    }
}
