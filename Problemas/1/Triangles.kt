import java.util.Scanner

/*
    Entrada: +
        1) altura  = numero (Int)
        2) base = numero (Int)
    Sortida: area triangle.
    Fórmula: (base  * altura)/2
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valors escanejats en variables y els converteix a doubles.
    var altura : Double = scan.nextInt().toDouble()
    var base : Double = scan.nextInt().toDouble()

    // Crea una variable per a l'àrea.
    val area : Double = (base * altura)/2

    // Imprimeix l'àrea a la consola.
    println(area)

    // Tanca l'escàner.
    scan.close()
}