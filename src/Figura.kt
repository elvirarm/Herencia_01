abstract class Figura(val color: String) {

    abstract fun area(): Double

    abstract fun perimetro(): Double


    override fun toString(): String {
        return "Figura de color $color tiene ${area()} cm y tiene perímetro ${perimetro()} cm"
    }
}





