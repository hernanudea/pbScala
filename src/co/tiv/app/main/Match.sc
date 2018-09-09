package co.tiv.app.main

object Match {
val mes = 9                                       //> mes  : Int = 9

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
	}                                         //> res0: String = Setiembre
}


/* permite evaluar caracteres, booleanos, patters
*/