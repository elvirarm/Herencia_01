//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val circulo1 = Circulo("rojo", 5.0)
    val circulo2 = Circulo("azul", 7.0)
    println(circulo1)
    println(circulo2)

    val rectangulo = Rectangulo("amarillo", 10.0, 20.0)
    val rectangulo2 = Rectangulo("azul", 15.0, 33.0)
    print(rectangulo)
    print(rectangulo2)

    val triangulo = Triangulo("morado", 15.0, 33.0, 3.0, 7.0, 10.0)
    val triangulo2 = Triangulo("rosa", 30.0, 30.0, 10.0, 20.0, 10.0)
    print(triangulo)
    print(triangulo2)


}