object Prueba {
  //Funcion que calcula y retorna el resultado obtenido al dividir el
  //primer numero recibido como parametro entre el segundo numero.
  def calcularCociente( numR:Double, numE:Double ) : Double = {
    numR / numE
  }

  //Funcion que calcula y retorna el promedio (y nueva estimacion)
  //de los dos numeros recibidos como parametros.
  def calculaPromedio( cociente:Double, numE:Double ) : Double = {
    ( cociente + numE ) / 2
  }

  //Funcion con llamada recursiva que implementa las dos funciones
  //anteriores y que se encarga de inicializar el proceso de calculo
  //de la raiz cuadrada; recibe como parametros el numero al cual se
  //le calculara la raiz cuadrada y la primera estimacion.
  def calcularRaiz( numR:Double, numE:Double ) : Double = {

    //Formato de impresion que imprime como fue avanzando el proceso de calculo.
    println( "                   " + numE + "                   |                   "+ calcularCociente( numR, numE ) + "                   |                   " + calculaPromedio( calcularCociente( numR, numE ), numE ) )
    println( "-------------------------------------------------------------------------------------------------------------------------------------------------------------" )

    //Condicion para la llamada recursiva que se ejecuta mientras que el
    //margen de error sea mayor a 0.000001
    var margendeError = 0.000001
    if ( numR - math.pow( numE, 2 ) > margendeError || numR - math.pow( numE, 2 ) < ( -1 * margendeError ) ) {
      //Nueva llamada a la funcion con los nuevos datos.
      calcularRaiz( numR, calculaPromedio( calcularCociente( numR, numE ), numE ) )
    } else {
      //Retorna la ultima estimacion calculada.
      numE
    }
  }

  def main(args: Array[String]): Unit = {
    //Formato de impresion.
    println("_____________________________________________________________________________________________________________________________________________________________")
    println("                   ESTIMACION (y)                   |                   CUOCIENTE (x/y)                   |                   PROMEDIO (y)                   ")
    println("-------------------------------------------------------------------------------------------------------------------------------------------------------------")


    //Numero al cual se calculara la raiz.
    var numeroACalcularRaiz = 2
    //Llamada a la funcion e impresion del resultado final.
    println("\n\n\n-->  La raiz aproximada de \"" + numeroACalcularRaiz + "\" es: " + calcularRaiz(numeroACalcularRaiz, 1))
  }
}
