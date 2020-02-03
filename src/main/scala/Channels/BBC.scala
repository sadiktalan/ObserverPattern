package Channels

import Weather.Weather

class BBC extends TChannel {
  override def updateWeather(weatherStats: Weather): Unit = {
    println("BBC Weather.Weather is : ")
    print("Today's humidity : " + weatherStats.humidity)
    print(" ,temperature : "+ weatherStats.temperature)
    print(" ,pressure : "+ weatherStats.pressure)
  }
}
