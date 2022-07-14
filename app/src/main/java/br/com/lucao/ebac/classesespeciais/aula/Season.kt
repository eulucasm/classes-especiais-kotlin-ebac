package br.com.lucao.ebac.classesespeciais.aula

fun main() {
    var fall: Season = Season.FALL
    val winter: Season = Season.WINTER
    var sprint: Season = Season.SPRING
    var summer: Season = Season.SUMMER

    println(fall)
    fall = Season.SPRING
    println(fall)
    println(winter.translate)

    fall.hello()

}

enum class Season(val translate: String) {
    WINTER("inverno") {
        override fun hello() = println("Olá inverno")
    },
    SPRING("primavera") {
        override fun hello() = println("Olá primavera")
    },
    SUMMER("verão") {
        override fun hello() = println("Olá verão")
    },
    FALL("outono") {
        override fun hello() = println("Olá outono")
    };

    abstract fun hello()
}

/* EXEMPLO 1
fun main() {
    var fall: Season = Season.FALL
    var winter: Season = Season.WINTER
    var sprint: Season = Season.SPRING
    var summer: Season = Season.SUMMER

    println(fall)
    fall = Season.SPRING
    println(fall)

}

enum class Season {
    WINTER,SPRING,SUMMER,FALL
}
*/
/*exemplo 2
fun main() {
    var fall: Season = Season.FALL
    val winter: Season = Season.WINTER
    var sprint: Season = Season.SPRING
    var summer: Season = Season.SUMMER

    println(fall)
    fall = Season.SPRING
    println(fall)

    println(winter.translate)

}

enum class Season(val translate: String) {
    WINTER("inverno"),
    SPRING("primavera"),
    SUMMER("verão"),
    FALL("outono")
}
 */