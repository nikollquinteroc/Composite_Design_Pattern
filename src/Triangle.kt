//Implement specific operations of triangle
class Triangle(
    private val base: Double,
    private val height: Double
) : Figure() {
    override fun draw() {
        println("Drawing triangle base $base and height $height")
    }

    override fun move(x: Int, y: Int) {
        println("Moving triangle to: ($x, $y)")
    }

    override fun area(): Double {
        println("The area of rectangle is: ${base * height / 2}")
        return base * height / 2
    }
}