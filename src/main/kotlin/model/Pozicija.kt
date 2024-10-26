package fet.rmas.model

class Pozicija(coordinateX : Int, coordinateY : Int) {
    var coordinateX : Int = coordinateX
        set(value) {
            if (value < 0 || value > 2) {
                throw IllegalArgumentException();
            }
            field = value;
        }

    var coordinateY : Int = coordinateY
        set(value) {
            if (value < 0 || value > 2) {
                throw IllegalArgumentException();
            }
            field = value;
        }

    init {
        if (coordinateX < 0 || coordinateX > 2 || coordinateY < 0 || coordinateY > 2) {
            throw IllegalArgumentException();
        }
    }

    constructor() : this(0, 0);
}