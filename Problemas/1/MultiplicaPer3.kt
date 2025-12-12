import java.util.Scanner

/*
    Entrada: numero (Int)
    Sortida: numero x 3.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema el valor escanejat en una variable.
    val numero : Int = scan.nextInt()

    // Crea una varuiable per al número multiplicat per 3.
    val numeroPer3 = numero * 3

    // Imprimeix el numero multiplicat a la consola.
    println(numeroPer3)

    // Tanca l'escàner.
    scan.close()
}