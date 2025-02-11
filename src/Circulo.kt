class Circulo(color: String, private val radio: Double): Figura(color){

    override fun area(): Double = Math.PI * (radio * radio)

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }

}