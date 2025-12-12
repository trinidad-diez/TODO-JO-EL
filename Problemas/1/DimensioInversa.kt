import java.util.Scanner

/*
    Entrada: numero (Int)
    Sortida: 1/numero
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema el valor escanejat en variable.
    var numero : Double = scan.nextDouble()

    // Crea una variable per a la suma dels dos nombres.
    var formaFraccionaria : Double = 0.0
    if (numero != 0.0){
        formaFraccionaria = 1/numero
    }


    // Imprimeix la suma dels dos números a la consola.
    println(formaFraccionaria)

    // Tanca l'escàner.
    scan.close()
}
