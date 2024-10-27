package fet.rmas.model

import fet.rmas.contract.Instrukcija

class Lijevo : Instrukcija {
    override fun pomjeri(currentPosition: Pozicija): Pozicija {
        --currentPosition.coordinateX
        return currentPosition
    }
}