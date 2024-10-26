package fet.rmas.model

import fet.rmas.contract.Instrukcija;

class Dole : Instrukcija {
    override fun pomjeri(currentPosition: Pozicija): Pozicija {
        if (currentPosition.coordinateY == 2) {
            return currentPosition;
        }
        ++currentPosition.coordinateY;
        return currentPosition;
    }
}