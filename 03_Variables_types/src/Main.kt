fun main() {
    val firstName = "Галина"
    val lastName = "Фуртас"
    var height = 1.52
    val weight = 53F
    var isChild = (height < 1.50) || (weight < 40)

    var info = """
    Вчера меня зовали $firstName $lastName. 
    Мой рост был ${height.toInt()}м ${(height*100-height.toInt()*100).toInt()}см, а вес ${weight}кг. 
    И я ${if (isChild) "ребенок" else "взрослый человек"}     
    """.trimIndent()
    println(info)

    height = 1.40
    isChild = (height < 1.50) || (weight < 40)

    info = """
    Сегодня меня зовут $firstName $lastName. 
    Мой рост стал ${height.toInt()}м ${(height*100-height.toInt()*100).toInt()}см, а вес ${weight}кг. 
    И я теперь ${if (isChild) "ребенок" else "взрослый человек"}
    """.trimIndent()
    println(info)
}