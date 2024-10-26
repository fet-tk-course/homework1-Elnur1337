package fet.rmas.contract

import fet.rmas.model.Pozicija;

interface Instrukcija {
    fun pomjeri(currentPosition: Pozicija) : Pozicija;
}