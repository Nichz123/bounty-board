const val HERO_NAME = "\u001B[1mMadrigal\u001B[0m"

fun printStats(level: Int, steed: String) {
    println()
    println("Name: $HERO_NAME")
    println("Level: $level")
    println("Steed: $steed")
    println()
}

class Pub(
    val pubName: String,
    val publicanName: String,
    val pubMenu: List<String>
) {
    fun printMenu() {
        for (i in 0..pubMenu.size - 1) {
            println("\t($i): ${pubMenu[i]}")
        }
    }
}

fun main() {
    //World Building
    var playerLevel = 4
    var playerSteed = "---"
    printStats(playerLevel, playerSteed)

    //Pub 1- Unicorn's Horn
    val pub1 = Pub(
        pubName = "\u001B[1mUnicorn's Horn\u001B[0m",
        publicanName = "\u001B[1mJohn\u001B[0m",
        pubMenu = listOf("Meed", "Wine", "LaCroix")
    )

    //Journey Start
    println("\u001B[3mThe player embarks on her journey to locate the enchanted sword!\u001B[0m")
    playerLevel++
    printStats(playerLevel, playerSteed)

    //Hero enters Unicorn's Horn
    println("\u001B[3mAt the edge of the forest lies a lively pub. $HERO_NAME enters...\u001B[0m")
    println("${pub1.publicanName}: Welcome to ${pub1.pubName}!" +
            " Do you need to stable a steed?")
    println("$HERO_NAME I have no steed. Rather, tell me about your drink selection.")
    println("${pub1.publicanName}: We serve the following: ")
    pub1.printMenu()
    println("\u001B[3m${pub1.publicanName} points to the items items listed spread across the table behind him\u001B[0m")
    println("\u001B[3mRefreshed, $HERO_NAME returns to her journey ahead\u001B[0m...")
    println()

    //Hero finds magic mirror
    println("\u001B[3mLater, while traversing the forest, $HERO_NAME stumbles upon a magic mirror hidden in the dry leaves and dirt.\u001B[0m")
    println("\u001B[3mUpon further inspection her name, warped in the screen appears and shifts until it reads ${HERO_NAME.reversed()}.")
    println("\u001B[3mBest to leave it alone. $HERO_NAME continues onward...\u001B[0m")
}