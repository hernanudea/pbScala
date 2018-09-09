package co.tiv.app.main

object Saludo {

  def main(arg: Array[String]): Unit = {
    printf("Hola mundo desde Scala\n")
    printf("Hola mundo Con Scala IDE\n")
    saludar("Samuel")
    p("Samuel")
    p("Samuel", "Matias")
    p("Samuel", "Matias", "Eliana")
  }

  def saludar(nombre: String): Unit = {
    printf("\nSaludos, %s!!!\n\n", nombre)
  }

  def p(a: String): Unit = {
    printf("[Valor1: %s]\n", a)
  }
  
  def p(a: String, b: String): Unit = {
    printf("[Valor1: %s, Valor2: %s]\n", a, b)
  }
  
  def p(a: String, b: String, c: String): Unit = {
    printf("[Valor1: %s, Valor2: %s, Valor3: %s]\n", a, b, c)
  }

}