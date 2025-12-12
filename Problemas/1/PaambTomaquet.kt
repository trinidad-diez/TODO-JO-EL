import java.util.Scanner
/*
    Entrada:
     1) nom (String).
     2) nom (String).
    Sortida: 1) amb 2)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els noms escanejats en variables.
    val nom1 = scan.next()
    val nom2 = scan.next()

    // Imprimeix el missatge a la consola.
    println("$nom1 amb $nom2")

    // Tanca l'escàner.
    scan.close()
}