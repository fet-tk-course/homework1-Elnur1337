package fet.rmas.model

import fet.rmas.contract.Instrukcija

class Tastatura(private var matrix : List<List<Int>>) {
    init {
        matrix = listOf(
            listOf(1, 2, 3),
            listOf(4, 5, 6),
            listOf(7, 8, 9)
        )
    }

    fun pomjeri(currentPosition : Pozicija, instruction : Instrukcija) : Pozicija {
        when (instruction) {
            is Gore -> {
                if (currentPosition.coordinateY == 0) {
                    return currentPosition
                }
                --currentPosition.coordinateY
                return currentPosition
            }
            is Dole -> {
                if (currentPosition.coordinateY == 2) {
                    return currentPosition
                }
                ++currentPosition.coordinateY
                return currentPosition
            }
            is Lijevo -> {
                if (currentPosition.coordinateX == 0) {
                    return currentPosition
                }
                --currentPosition.coordinateX
                return currentPosition
            }
            else -> {
                if (currentPosition.coordinateX == 2) {
                    return currentPosition
                }
                ++currentPosition.coordinateX
                return currentPosition
            }
        }
    }
}