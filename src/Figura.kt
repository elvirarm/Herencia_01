abstract class Figura(val color:String) {

    abstract fun area(): Double

    abstract fun perimetro(): Double

    fun mostrarResultado(){
        println("Área: ${area()} cm")
        println("Perimetro: ${perimetro()} cm")
    }

    override fun toString(): String {
        return "Figura de $color tiene ${mostrarResultado()}"
    }
}

    class Circulo(color: String, val radio: Double): Figura(color){

        override fun area(): Double = Math.PI * (radio * radio)

        override fun perimetro(): Double {
            return 2 * Math.PI * radio
        }

    }

    class Rectangulo(color: String, val base: Double, val altura: Double): Figura(color){

        override fun area(): Double {
            return base * altura
        }

        override fun perimetro(): Double {
            return 2 * (base + altura)
        }



    }

    class Triangulo(color: String, val base: Double, val altura: Double, val lado1: Double, val lado2: Double, val lado3: Double): Figura(color){


        override fun area(): Double {
            return (base * altura) / 2
        }

        override fun perimetro(): Double {
            return lado1 + lado2 + lado3
        }


    }