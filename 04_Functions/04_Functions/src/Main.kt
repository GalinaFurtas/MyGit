fun main() {
    val textCode = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = textCode.substring(0, textCode.length / 2)
    val secondHalf = textCode.substring(textCode.length / 2)

    //   println("first half is: $firstHalf")
    //   println("second half is : $secondHalf")

    val decodedFirstHalf = decodeFirstHalf(firstHalf)
    val decodedSecondHalf = decodeSecondHalf(secondHalf)
    val result = "$decodedFirstHalf$decodedSecondHalf"
    //   println("""
//   decoded firstHalf: $decodedFirstHalf
//   decoded secondHalf: $decodedSecondHalf
//   result: $result
//""".trimIndent())
    println("encoded text is: $textCode")
    println("decoded text is : $result")
}
fun decodeFirstHalf(text: String): String {
    var result: String = text
    result = shift(result, 1)
    result = result.replace('5', 's')
    result = result.replace('4', 'u')
    result = shift(result, -3)
    result = result.replace('0', 'o')
    return result
}
fun decodeSecondHalf(text: String): String {
    var result: String = text
    result = result.reversed()
    result = shift(result, -4)
    result = result.replace('_', ' ')
    return result
}
fun shift(text: String, amount: Int): String {
    return text.map { c -> c + amount }.joinToString("")
}
