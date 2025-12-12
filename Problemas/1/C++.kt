import java.util.Scanner

/*
    Entrada: numero (Int)
    Sortida: numero + 1
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema el valor escanejat en una variable.
    var numero : Int = scan.nextInt()

    // Incrementa el número.
    numero ++

    // Imprimeix el numero incrementat a la consola.
    println(numero)

    // Tanca l'escàner.
    scan.close()
}