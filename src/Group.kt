class Group : Composable{
    private val figures = mutableListOf<Figure>()

    fun add(figure: Figure) {
        figures.add(figure)
    }
    fun remove(figure: Figure){
        figures.remove(figure)
    }
    override fun operationDraw() {
        figures.forEach { it.draw() }
    }

    override fun operationMove(x: Int, y: Int) {
        figures.forEach { it.move(x, y) }
    }

    override fun operationArea() {
        figures.forEach { it.area() }
    }
}