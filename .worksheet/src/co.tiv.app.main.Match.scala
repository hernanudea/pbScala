package co.tiv.app.main

object Match {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(51); 
val mes = 9;System.out.println("""mes  : Int = """ + $show(mes ));$skip(317); val res$0 = 

	mes match {
		case 1 => "Enero"
		case 2 => "Febreo"
		case 3 => "Marzo"
		case 4 => "Abril"
		case 5 => "Mayo"
		case 6 => "Junio"
		case 7 => "Julio"
		case 8 => "Agosto"
		case 9 => "Setiembre"
		case 10 => "Octubre"
		case 11 => "Noviembre"
		case 12 => "Diciembre"
		case _ => "Ninguno" //valor por defecto
	};System.out.println("""res0: String = """ + $show(res$0))}
}


/* permite evaluar caracteres, booleanos, patters
*/
