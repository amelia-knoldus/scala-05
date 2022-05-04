class Queue[A](val capacity: Int) {
    private var elements: List[A] = List()

    override def toString = s"$elements"

    def front = {

            size match {
                case s if s >= 2 => elements.drop(s - 1).head
                case 1 => elements.head
                case _ => None
            }

    }

    def rear = elements.headOption match {
        case Some(s) => s
        case None => None
    }
    
    def size: Int = elements.size

    def enqueue(element: A): Queue[A] = {
    
        require(size + 1 <= capacity, "Queue is full! Cannot enqueue.")

        val newQueue = new Queue[A](capacity)

        newQueue.elements = element +: elements

        newQueue
    
    }

    def dequeue: Queue[A] = {
    
        require(!isEmpty, "Queue is empty! Cannot dequeue.")

        val newQueue = new Queue[A](capacity)
    
        newQueue.elements = elements.take(size - 1)

        newQueue

    }

    def isFull: Boolean = elements.size == capacity

    def isEmpty: Boolean = elements.isEmpty
}