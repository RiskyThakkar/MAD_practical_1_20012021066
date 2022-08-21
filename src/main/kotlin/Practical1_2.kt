//Question : 2
/*Type conversion:
Integer to Double, String to Integer, String to Double.*/

fun main()
{
    val a1 : Int = 25
    val a2=a1.toDouble()
    println("Double value(from integer) = $a2")


    val b1 : String = "45568"
    val b2=b1.toInt()
    println("Integer value(from String) = $b2")

    val c1 : String = "4568"
    val c2 = c1.toDouble()
    println("Double value(from String) = $c2")
}