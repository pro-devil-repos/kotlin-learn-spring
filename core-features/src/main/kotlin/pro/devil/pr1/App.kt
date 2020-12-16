package pro.devil.pr1

fun main() {
    println("Hi! There!");

    var x = 1;

    println("Before the loop: x = $x")

    while (x < 4) {
        println("In the loop: x = $x")
        ++x
    }

    println("After the loop: x = $x")

    println(if (x < 3) "x less than 3" else "x equal or greater than 3")

    var myArray1 = arrayOf(1, 2, 3)
    val myArray2: Array<Byte> = arrayOf(3, 4)
}