import java.util.Scanner

/*
    Entrada: +
        1) Vots Jiden = numero (Int)
        2) Vots Drump = numero (Int)
    Sortida: 1) + 2)
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valors escanejats en variables.
    var votsJiden : Int = scan.nextInt()
    var votsDrump : Int = scan.nextInt()


    // Imprimeix el guanyador a la consola.
    if(votsDrump > votsJiden){
        println("Drump")
    } else {
        println("Jiden")
    }

    // Tanca l'escàner.
    scan.close()
}