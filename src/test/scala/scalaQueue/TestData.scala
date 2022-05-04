object TestData {
    val emptyQueue = new Queue[Int](5)

    
    val fullQueue0 = new Queue[Int](5)

    val fullQueue01 = fullQueue0.enqueue(1)
    val fullQueue02 = fullQueue01.enqueue(2)
    val fullQueue03 = fullQueue02.enqueue(3)
    val fullQueue04 = fullQueue03.enqueue(4)
    val fullQueue = fullQueue04.enqueue(5)

    
    val q0 = new Queue[Int](3)

    
    val q1 = new Queue[String](10)

    val q11 = q1.enqueue("apples")
    val q12 = q11.enqueue("bananas")
    val q13 = q12.enqueue("strawberries")


    val q2 = new Queue[Double](14)

    val q21 = q2.enqueue(1.5)
    val q22 = q21.enqueue(2.2)
    val q23 = q22.enqueue(2.5)
    val q24 = q23.enqueue(0.45)
    val q25 = q24.enqueue(3.75)
    val q26 = q25.enqueue(10.0)


    val q3 = new Queue[Char](5)

    val q31 = q3.enqueue('Z')
    val q32 = q31.enqueue('Y')


    val q4 = new Queue[Int](1)

    val q41 = q4.enqueue(400)

}