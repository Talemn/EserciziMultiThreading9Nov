/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziomlutithreadingmocanu1;

/**
 *
 * @author mocanu.ronald
 */
public class Hello extends Thread {

    String parola;

    Hello() {
        parola = "Hello";
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(parola);
        }
    }
}
