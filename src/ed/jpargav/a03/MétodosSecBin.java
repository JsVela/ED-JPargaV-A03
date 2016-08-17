/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a03;

/**
 *
 * @author JESUS PARGA VELA
 */
public class MétodosSecBin {

    public static int busquedaSec(int arr[], int num) {
        boolean ban = false;
        int i;
        for (i = 0; i < arr.length && !ban; i++) {
            if (arr[i] == num) {
                System.out.println("Lo encontraste");
                ban = true;
            }
        }
        if (!ban) {
            System.out.println("No existe el elemento en búqueda secuencial");
            i = -1;
        }
        return i;
    }

    public static int busquedaBin(int arr[], int num) {
        int inicio = 0, fin = arr.length - 1, centro, cont = 0;
        while (inicio <= fin ) {
            centro = (inicio + fin) / 2;
            ++cont;
            System.out.println("inicio " + inicio + " final " + fin + " centro " + centro);
            if (num == arr[centro]) {
                return cont;
            } else if (num < arr[centro]) {
                fin = centro - 1;
            } else {
                inicio = centro + 1;
            }
        }
        if (inicio > fin) {
            System.out.println("No existe el elemento en búsqueda binaria");
            return -1;
        }
        return cont;
    }
}
