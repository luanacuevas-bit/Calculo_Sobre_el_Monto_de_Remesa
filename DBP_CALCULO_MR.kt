fun getITF(mr: Double): Double = mr * 0.00005

fun getComision(mr: Double): Double {
    if (mr <= 1000) {
        return 5.0
    } else if (mr <= 10001) {
        return mr * 0.005
    } else {
        return mr * 0.015
    }
}

fun getMontoRemesa(T: Double): Double {
    var mr = (T - 5) / (1 + 0.00005)
    if (mr <= 1000) return mr

    mr = T / (1 + 0.00005 + 0.005)
    if (mr <= 10001) return mr

    mr = T / (1 + 0.00005 + 0.015)
    return mr
}

fun main() {

    val T = 5000.00

    val mr = getMontoRemesa(T)
    val itf = getITF(mr)
    val comision = getComision(mr)

    println("Monto total T = $T")
    println("Monto de remesa mr = $mr")
    println("ITF = $itf")
    println("Comisión = $comision")
}
