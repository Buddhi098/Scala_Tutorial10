object q1 {
  def calculateAverage(temperatures: List[Double]): Double = {
    if(temperatures.length>0){
        val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
        val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
        val averageFahrenheit = totalFahrenheit / fahrenheitTemperatures.length
        averageFahrenheit
    }else{
        println("Temperature List is empty!")
        return 0
    }
  }
  def main(args: Array[String]): Unit = {
    val inputTemperatures: List[Double] = List(0,10,20,30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
