package Channels

import Weather.Weather

class CNBC extends TChannel {
  override def updateWeather(weatherStats: Weather): Unit = {
    println("CNBC Weather.Weather is : ")
    println("Today's humidity : "+ weatherStats.humidity)
    println("Today's temperature : "+ weatherStats.temperature)
    println("Today's pressure : "+ weatherStats.pressure)
  }
}
