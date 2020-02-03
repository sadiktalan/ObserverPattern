package Weather

import Channels.TChannel
class WeatherStation extends TWeatherStation {
  private var channels: List[TChannel] = Nil
  override def notifyChannels(weatherStats: Weather): Unit = {
    channels.foreach(f => f.updateWeather(weatherStats : Weather))
  }

  override def addObserver(channel: TChannel): Unit = {
    val tempList : List[TChannel] = channels.::(channel)
    channels = tempList
  }

  def changeWeather(stats : Weather) : Unit = {
    notifyChannels(stats)
  }
}