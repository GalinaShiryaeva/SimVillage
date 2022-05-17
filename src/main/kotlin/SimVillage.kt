fun main() {
    /*runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2022
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }*/
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Johnny"))
    println(greetingFunction("Robert"))
}

// функция со стр. 116
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2022
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("Construction cost: ${cost * numBuildings}")
}


