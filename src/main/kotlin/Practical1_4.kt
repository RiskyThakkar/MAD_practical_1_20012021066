import javax.print.attribute.IntegerSyntax

//Question : 4
/*Find the number is odd or even by using Control Flow inside println() method.*/

fun main()
{
    println("20012021066_SMIT THAKKAR\n")

    println("Enter any value: ")
    val s1:Int = readLine()!!.toInt()

    if(s1%2==0)
    {
        print("The number is Even....")
    }
    else
    {
        print("The number is Odd....")
    }
}