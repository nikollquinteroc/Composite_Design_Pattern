//Implement specific operations of circle
class Circle(private val radius: Double) : Figure() {
    override fun draw() {
        println("Drawing circle of radius: $radius")
    }

    override fun move(x: Int, y: Int) {
        println("Moving circle to ($x, $y)")
    }

    override fun area() : Double {
        println("The area of rectangle is: ${kotlin.math.PI * radius * radius}")
        return kotlin.math.PI * radius * radius
    }
}