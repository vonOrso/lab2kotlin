package khai.lab2


class Implementor: ArrayRightMore,LogicBigSum,IterationDivK {

    override fun big_sum(a: Double, b: Double, c: Double): Double  {

        return when {
            a > b && c > b -> {
                a + c
            } b > a && c > a -> {
                b + c
            } else -> {
                a + b
            }
        }
    }

    override fun div_k(N: Double) {
        var s = 0.0
        var k = 0.0
        while (s < N) {
            k += 1.0
            s += 1.0 / k
        }
        s -= 1.0 / k
        k -= 1.0
        println("K $k")
        println("Сумма $s")
    }

    override fun right_more(R: Array<Double>) {
        var M = 0

        for (i in 0..8) if (R[i]>R[i+1]) {

            M += 1
            print(" ${R[i]}; ")
        }
println("Кол-во больших чем сосед = $M")

}
}

fun main(args: Array<String>) {
    println("Imperium Romanum")
    println("Часть 1 big_sum")
    val S: LogicBigSum = Implementor()
     println(S.big_sum(a = 7.0,b = 3.0,c = 2.0))
    println("Часть 2 div_k")
    val P:IterationDivK = Implementor()
    P.div_k(N=3.0)
    println("Часть 3 right_more")
    val Q:ArrayRightMore = Implementor()
    val R = arrayOf(21.0, 6.0, -7.0, 8.0, 23.0, 7.0, 12.0, 0.0, -5.0, 17.0)
    Q.right_more(R)
}
