package fet.rmas.model

import fet.rmas.contract.Instrukcija

class Gore : Instrukcija {
    override fun pomjeri(currentPosition : Pozicija): Pozicija {
        --currentPosition.coordinateY
        return currentPosition
    }

}