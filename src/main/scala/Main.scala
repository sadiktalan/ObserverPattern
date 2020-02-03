import Channels.{BBC, CNBC}
import Weather.{Weather, WeatherStation}

object main {
  def main(args: Array[String]): Unit = {
      val station: WeatherStation = new WeatherStation();
      station.addObserver(new BBC)
      station.addObserver(new CNBC)
      station.changeWeather(new Weather(humidity = "%25", temperature = 16, pressure = "12"));
  }
}