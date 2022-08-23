fun main()
{
    println("20012021066_SMIT THAKKAR\n")

    println ("Student Enrollment Number : ")
    val enro:String = readLine()!!.toString()

    println ("Student Name : ")
    val nm:String = readLine()!!.toString()

    println ("Student Branch : ")
    val branch:String = readLine()!!.toString()

    println ("Student Batch : ")
    val bat:String = readLine()!!.toString()

    println ("Student College Name : ")
    val clgnm:String = readLine()!!.toString()

    println ("Student University Name : ")

    val uninm:String = readLine()!!.toString()

    println ("Student Age : ")
    val age = readLine()!!.toInt()


    println("********************")
    println ("ENROLLMENT NO. = $enro")
    println ("NAME = $nm")
    println ("BRANCH = $branch")
    println ("BATCH = $bat")
    println ("COLLEGE NAME = $clgnm")
    println ("UNIVERSITY NAME = $uninm")
    println ("AGE = $age")
}