package fet.rmas.model

import fet.rmas.contract.Instrukcija;

class Desno : Instrukcija {
    override fun pomjeri(currentPosition: Pozicija): Pozicija {
        if (currentPosition.coordinateX == 2) {
            return currentPosition;
        }
        ++currentPosition.coordinateX;
        return currentPosition;
    }
}