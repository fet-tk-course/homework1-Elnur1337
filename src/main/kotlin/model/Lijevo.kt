package fet.rmas.model

import fet.rmas.contract.Instrukcija;

class Lijevo : Instrukcija {
    override fun pomjeri(currentPosition: Pozicija): Pozicija {
        if (currentPosition.coordinateX == 0) {
            return currentPosition;
        }
        --currentPosition.coordinateX;
        return currentPosition;
    }
}