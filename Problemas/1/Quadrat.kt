import java.util.Scanner

/*
    Entrada: numero (Int)
    Sortida: numero * numero.
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valor escanejat en variable.
    var numero : Int = scan.nextInt()

    // Crea una variable per a la suma dels dos nombres.
    val area = numero * numero

    // Imprimeix la suma dels dos números a la consola.
    println(area)

    // Tanca l'escàner.
    scan.close()
}
