fun main()
{
    println ("Student Enrollment Number : ")
    var enro:String = readLine()!!.toString()

    println ("Student Name : ")
    var nm:String = readLine()!!.toString()

    println ("Student Branch : ")
    var branch:String = readLine()!!.toString()

    println ("Student Batch : ")
    var bat:String = readLine()!!.toString()

    println ("Student College Name : ")
    var clgnm:String = readLine()!!.toString()

    println ("Student University Name : ")

    var uninm:String = readLine()!!.toString()

    println ("Student Age : ")
    var age = readLine()!!.toInt()


    println("********************")
    println ("ENROLLMENT NO. = $enro")
    println ("NAME = $nm")
    println ("BRANCH = $branch")
    println ("BATCH = $bat")
    println ("COLLEGE NAME = $clgnm")
    println ("UNIVERSITY NAME = $uninm")
    println ("AGE = $age")
}