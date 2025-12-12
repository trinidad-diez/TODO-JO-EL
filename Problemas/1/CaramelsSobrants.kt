import java.util.Scanner

/*
    Entrada: +
        1) Caramels = numero (Int)
        2) Nens = numero (Int)
    Sortida: resta 1) y 2)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valors escanejats en variables.
    var caramels : Int = scan.nextInt()
    var nens : Int = scan.nextInt()

    // Crea una variable per a la suma dels dos nombres.
    val caramelsSobrants = caramels % nens

    // Imprimeix la suma dels dos números a la consola.
    println(caramelsSobrants)

    // Tanca l'escàner.
    scan.close()
}