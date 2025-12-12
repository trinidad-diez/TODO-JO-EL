import java.util.Scanner

/*
    Entrada: Edat = numero (Int)
    Sortida:
        edat < 32 -> SI
        else -> NO
 */

fun main(){
    // Crea un escàner per llegir l'entrada de l'usuari.
    val scan : Scanner = Scanner (System.`in`)

    // Emmagatzema els valor escanejat en variable.
    var edat : Int = scan.nextInt()

    // Imprimeix "SI" si l'edat es menys de 32 i "NO" en cas contrari
    if (edat < 32){
        println("SI")
    } else {
        println("NO")
    }

    // Tanca l'escàner.
    scan.close()
}
