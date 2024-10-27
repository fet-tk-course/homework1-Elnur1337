package fet.rmas.model

import fet.rmas.contract.Instrukcija

class Desno : Instrukcija {
    override fun pomjeri(currentPosition: Pozicija): Pozicija {
        ++currentPosition.coordinateY
        return currentPosition
    }
}