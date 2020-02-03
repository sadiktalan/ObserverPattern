package Channels

import Weather.Weather

trait TChannel {
  def updateWeather(weatherStats: Weather): Unit
}
