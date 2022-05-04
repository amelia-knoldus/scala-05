import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QueueSpec extends AnyFlatSpec with Matchers {
    "new Queue[Int](5)" should "initialize empty integer Queue with capacity of 5" in {
        
        emptyQueue.capacity shouldEqual 5
        emptyQueue.size shouldEqual 0
        emptyQueue.front shouldEqual None
        emptyQueue.rear shouldEqual None
        emptyQueue.isEmpty shouldEqual true
        emptyQueue.isFull shouldEqual false

    }

    "Calling enqueue on an empty queue" should "add to the front and rear of the queue and increase size by 1" in {

        val q01 = q0.enqueue(1)

        q01.size shouldEqual 1
        q01.front shouldEqual 1
        q01.rear shouldEqual 1
        q01.isEmpty shouldEqual false
        q01.isFull shouldEqual false
    }


    "Calling enqueue on a non-empty queue" should "add to the rear of the queue and increase size by 1" in {

        val q14 = q13.enqueue("pears")

        q14.size shouldEqual 4
        q14.front shouldEqual "apples"
        q14.rear shouldEqual "pears"

    }

    "Calling enqueue on a full queue" should "throw an IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            fullQueue.enqueue(6)
        }
    }

    "Calling dequeue on an empty queue" should "throw IllegalArgumentException" in {
        intercept[IllegalArgumentException] {
            emptyQueue.dequeue
        }
    }

    "Calling dequeue on a non-empty queue" should "change front of queue and decrease size by 1" in {
        
        val q27 = q26.dequeue

        q27.size shouldEqual 5
        q27.front shouldEqual 2.2
        q27.rear shouldEqual 10.0

    }

    "Calling dequeue on a queue with size 2" should "change front and rear of queue and decrease size by 1" in {
        
        val q33 = q32.dequeue

        q33.size shouldEqual 1
        q33.front shouldEqual 'Y'
        q33.rear shouldEqual 'Y'
        
    }

    "Calling dequeue on a queue with size 1" should "return empty queue" in {
        
        val q42 = q41.dequeue

        q42.size shouldEqual 0
        q42.front shouldEqual None
        q42.rear shouldEqual None
        
    }
}