package fet.rmas.model

import fet.rmas.contract.Instrukcija;

class Gore : Instrukcija {
    override fun pomjeri(currentPosition : Pozicija): Pozicija {
        if (currentPosition.coordinateY == 0) {
            return currentPosition;
        }
        --currentPosition.coordinateY;
        return currentPosition;
    }

}