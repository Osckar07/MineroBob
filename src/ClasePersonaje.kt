import java.util.*
var random = Random()


open class ClasePersonaje(val nombre: String= "Bob", var fatiga : Int =(random.nextInt(5)+1), var sed : Int =0, var oro:Int=(random.nextInt(3)+1)) {

    override fun toString(): String {

        return "El minero $nombre se siente con FATIGA: $fatiga, con SED: $sed  y con $oro de ORO en los bolsillos "
    }

}