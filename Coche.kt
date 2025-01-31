class CocheException(message: String) : Exception(message)

class Coche(
    val marca: String,
    val modelo: String,
    val caballos: Int,
    val puertas: Int,
    val matricula: String
) {

    var color: String? = null
        set(value) {
            if (value.isNullOrEmpty()) {
                throw CocheException("El color no puede ser nulo o vacío.")
            }
            field = value
        }

    init {
        if (marca.isNullOrEmpty()) {
            throw CocheException("La marca no puede ser vacía o nula.")
        }
        if (modelo.isNullOrEmpty()) {
            throw CocheException("El modelo no puede ser vacío o nulo.")
        }
        if (caballos < 70 || caballos > 700) {
            throw CocheException("El número de caballos debe estar entre 70 y 700.")
        }
        if (puertas < 3 || puertas > 5) {
            throw CocheException("El número de puertas debe estar entre 3 y 5.")
        }
        if (matricula.length != 7) {
            throw CocheException("La matrícula debe tener 7 caracteres.")
        }
    }

    val marcaCapitalizada: String
        get() = marca.capitalize()

    val modeloCapitalizado: String
        get() = modelo.capitalize()

    override fun toString(): String {
        return "Coche(marca='$marcaCapitalizada', modelo='$modeloCapitalizado', caballos=$caballos, puertas=$puertas, matrícula='$matricula', color=$color)"
    }
}