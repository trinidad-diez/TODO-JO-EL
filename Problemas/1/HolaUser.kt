import java.util.Scanner
/*
    Entrada: nom (Line).
    Sortida: Hola + nom (String)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema el valor escanejat en una variable.
    val nom = scan.nextLine()

    // Crea una varuiable per al missatge.
    val missatge = "Hola,"

    // Imprimeix el missatge i el nom a la consola.
    println("$missatge $nom")

    // Tanca l'escàner.
    scan.close()
}