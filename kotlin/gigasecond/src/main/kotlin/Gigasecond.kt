import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow
import kotlin.math.roundToLong

class Gigasecond(startlocalDateTime: LocalDateTime) {

    val date: LocalDateTime = startlocalDateTime.plusSeconds(10.0.pow(9).roundToLong())

    constructor (startlocalDate: LocalDate) : this(startlocalDate.atStartOfDay())
}
