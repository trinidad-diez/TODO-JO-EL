import java.util.Scanner

/*
    Entrada: +
    1) numero (Int)
    2) numero (Int)
    Sortida: 1) + 2)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valors escanejats en variables.
    var numero1 : Int = scan.nextInt()
    var numero2 : Int = scan.nextInt()

    // Crea una variable per a la suma dels dos nombres.
    val suma = numero1 + numero2

    // Imprimeix la suma dels dos números a la consola.
    println(suma)

    // Tanca l'escàner.
    scan.close()
}