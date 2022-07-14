package br.com.lucao.ebac.classesespeciais.aula

data class Person(
    var name: String,
    val cpf: String,
    var email: String
){}

fun main() {
    val person = Person("lucas","123456789","lucas@gmail.com")
    val person2 = Person("novo nome","1231312", "email@email")

    val (name, cpf, email) = person

    println(person.equals(person2)) //println(person == person2)
    println(person)
    println(name)
    println(cpf)
    println(email)
}