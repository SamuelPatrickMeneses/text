/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosdomoodle.PCFP.listra1;

import java.util.Scanner;


public class Exercicio10 {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int vi = in.nextInt();
        int vf = vi *(int) Math.pow(r, 9);
        System.out.println(vf);
    }
}
