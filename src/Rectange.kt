//Implement specific operations of rectangle
class Rectangle(
    private val width: Double,
    private val height: Double
) : Figure() {
    override fun draw() {
        println("Drawing rectangle width $width and height $height")
    }

    override fun move(x: Int, y: Int) {
        println("Moving rectangle to: ($x, $y)")
    }

    override fun area(): Double {
        println("The area of rectangle is: ${width*height}")
        return width * height
    }
}