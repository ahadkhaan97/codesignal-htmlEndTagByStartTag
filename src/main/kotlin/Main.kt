fun main() {
    print(solution("<button>"))
}


fun solution(startTag: String): String {
    val splitArray = startTag.split(" ")
    var endTag = splitArray[0][0] + "/" + splitArray[0].substring(1, splitArray[0].length)
    if (endTag[endTag.length - 1] != '>')
        endTag += ">"
    return endTag
}
