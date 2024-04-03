// Represent a unique figure
abstract class Figure {
    abstract fun draw()
    abstract fun move(x: Int, y: Int)
    abstract fun area() : Double
}