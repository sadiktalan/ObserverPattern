package Weather

import Channels.TChannel

trait TWeatherStation {
  def notifyChannels(weatherStats: Weather) : Unit
  def addObserver(channel: TChannel) : Unit

}
