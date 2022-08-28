/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Prova {

    private static void swap(char a[], int l, int r) {
        char temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    private static void permute(char a[], int l, int r) {

        int copyA = 0;
        int resto = 0;
        int count = 0;
        int valueAsNumber = Integer.parseInt(String.valueOf(a)); 


        if (l == r) {

            while (valueAsNumber >= copyA) {
                ++copyA;
                resto = valueAsNumber % copyA;
                if (resto == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("O Número " + valueAsNumber + " É Primo");
            }else{
             System.out.println("O Número " + valueAsNumber + " não é primo");   
            }

        } else {
            for (int i = l; i <= r; i++) {
                swap(a, l, i);
                permute(a, l + 1, r);
                swap(a, l, i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        char[] value = scan.next().toCharArray(); 
        permute(value, 0, value.length - 1);
        scan.close();

    }

}
