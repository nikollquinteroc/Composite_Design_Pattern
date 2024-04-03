fun main() {
    //An instance created where all the figures are grouped
    //together, and I access the operations collectively
    val group = Group()
    val circle  = Circle(5.0)
    val rectangle = Rectangle(10.0, 5.0)
    val triangle = Triangle(10.0, 5.0)
    group.add(circle)
    group.add(rectangle)
    group.add(triangle)
    group.remove(circle)
    group.operationDraw()
    group.operationMove(20, 20)
    group.operationArea()
}