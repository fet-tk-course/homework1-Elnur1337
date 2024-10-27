package fet.rmas.model

import fet.rmas.contract.Instrukcija

class Tastatura {
    private val matrix : List<List<Int>> = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    fun pomjeri(currentPosition : Pozicija, instruction : Instrukcija) : Pozicija {
        when (instruction) {
            is Gore -> {
                if (currentPosition.coordinateX == 0) {
                    return currentPosition
                }
                return instruction.pomjeri(currentPosition)
            }
            is Dole -> {
                if (currentPosition.coordinateX == 2) {
                    return currentPosition
                }
                return instruction.pomjeri(currentPosition)
            }
            is Lijevo -> {
                if (currentPosition.coordinateY == 0) {
                    return currentPosition
                }
                return instruction.pomjeri(currentPosition)
            }
            else -> {
                if (currentPosition.coordinateY == 2) {
                    return currentPosition
                }
                return instruction.pomjeri(currentPosition)
            }
        }
    }

    fun getInputNumber(currentPosition: Pozicija) : Int {
        return matrix[currentPosition.coordinateX][currentPosition.coordinateY]
    }
}