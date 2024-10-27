package fet.rmas

import fet.rmas.model.Dekoder
import fet.rmas.model.Tastatura
import java.io.File
import java.io.FileNotFoundException

fun main() {
    val dekoder = Dekoder(Tastatura(), listOf("^<<", ">>ˇˇˇ", "<^>ˇ<", "^^^^ˇ"))
    try {
        println(dekoder.dekodiraj())
    } catch (ex : IllegalArgumentException) {
        println("Unesene instrukcije nisu ispravne!")
        println(ex.message)
    }
    println(loadCodeFromFile())
}

fun loadCodeFromFile() : String {
    print("Unesite putanju do fajla: ")
    val filePath = readln()
    val instructions = mutableListOf<String>()
    try {
        File(filePath).forEachLine { line ->  instructions.add(line)}
    } catch (ex : FileNotFoundException) {
        println("File not found!")
        return ""
    }
    val dekoder = Dekoder(Tastatura(), instructions)
    try {
        return dekoder.dekodiraj()
    } catch (ex : IllegalArgumentException) {
        println("Unesene instrukcije nisu ispravne!")
        println(ex.message)
    }
    return ""
}