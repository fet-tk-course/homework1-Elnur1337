package fet.rmas.model

class Dekoder(private val keyboard : Tastatura, private val instructions : List<String>) {
    private var currentPosition = Pozicija(1, 1)
    fun dekodiraj() : String {
        var password = ""
        for (instruction in instructions) {
            for (char in instruction) {
                when (char) {
                    '^' -> keyboard.pomjeri(currentPosition, Gore())
                    'ˇ' -> keyboard.pomjeri(currentPosition, Dole())
                    '>' -> keyboard.pomjeri(currentPosition, Desno())
                    '<' -> keyboard.pomjeri(currentPosition, Lijevo())
                    else -> throw IllegalArgumentException("Karakter ${char} nije podrzan!")
                }
            }
            password += keyboard.getInputNumber(currentPosition)
        }
        return password
    }
}