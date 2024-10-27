package fet.rmas

import fet.rmas.model.Dekoder
import fet.rmas.model.Tastatura

fun main() {
    val dekoder = Dekoder(Tastatura(), listOf("^<<", ">>ˇˇˇ", "<^>ˇ<", "^^^^ˇ"))
    print(dekoder.dekodiraj())
}