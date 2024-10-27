package fet.rmas.model

class Dekoder(var keyboard : Tastatura, var instructions : List<String>) {
    private var currentPosition = Pozicija(1, 1)
    fun dekodiraj() {
        for (instruction in instructions) {
            for (char in instruction) {
                when (char) {
                    '^' -> keyboard.pomjeri(currentPosition, Gore())
                    '˘' -> keyboard.pomjeri(currentPosition, Dole())
                    '>' -> keyboard.pomjeri(currentPosition, Desno())
                    '<' -> keyboard.pomjeri(currentPosition, Lijevo())
                }
            }
            println(keyboard.getInputNumber(currentPosition))
        }
    }
}