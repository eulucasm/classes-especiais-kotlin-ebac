package br.com.lucao.ebac.classesespeciais.aula

class CompanionObject {}

fun main() {
    val person = Persons.Manager.createPerson()
    person.name = "Lucas"

    println(Persons.counter)
    println(Persons.counter)
    println(Persons.counter)
    println(person.getTotalPerson())
    person.helloPerson()
    println(Persons.decrementCounter())


}

fun Persons.helloPerson(){
    println("Olá ${this.name}")
}

fun Persons.Manager.decrementCounter(){
    counter--
    println(counter)
}

class Persons private constructor() {
    var name = ""
    var email = ""

    fun getTotalPerson(): Int = counter

    companion object Manager {
        var counter = 0

        fun createPerson(): Persons {
            var persons = Persons()
            counter++

            return Persons()
        }
    }
}