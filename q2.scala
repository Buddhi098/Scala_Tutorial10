object q2{
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(_.length)
    val totalLetterCount = letterCounts.reduce(_ + _)
    totalLetterCount
  }
  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalCount")
  }
}
