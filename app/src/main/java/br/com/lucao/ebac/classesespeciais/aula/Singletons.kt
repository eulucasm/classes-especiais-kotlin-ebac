package br.com.lucao.ebac.classesespeciais.aula

fun main() {

    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season2.SPRING )
    SchedulerHandler.currentSeason()

    val otherClass = OtherClass()
    SchedulerHandler.currentSeason()
}

class OtherClass(){
    init {
        SchedulerHandler.setSeason(Season2.FALL)
    }
    fun printCurrentSeason() = SchedulerHandler.currentSeason()
}

object SchedulerHandler {
    private var season2: Season2 = Season2.WINTER

    fun setSeason(newSeason: Season2) {
        this.season2 = newSeason
    }

    fun currentSeason() = println(season2)
}

enum class Season2(val translate: String) {
    WINTER("inverno"),
    SPRING("primavera"),
    SUMMER("verão"),
    FALL("outono")
}