
package com.worldweatheronline.api.free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "chanceoffog",
    "chanceoffrost",
    "chanceofhightemp",
    "chanceofovercast",
    "chanceofrain",
    "chanceofremdry",
    "chanceofsnow",
    "chanceofsunshine",
    "chanceofthunder",
    "chanceofwindy",
    "cloudcover",
    "DewPointC",
    "DewPointF",
    "FeelsLikeC",
    "FeelsLikeF",
    "HeatIndexC",
    "HeatIndexF",
    "humidity",
    "lang_pl",
    "precipMM",
    "pressure",
    "tempC",
    "tempF",
    "time",
    "visibility",
    "weatherCode",
    "weatherDesc",
    "weatherIconUrl",
    "WindChillC",
    "WindChillF",
    "winddir16Point",
    "winddirDegree",
    "WindGustKmph",
    "WindGustMiles",
    "windspeedKmph",
    "windspeedMiles"
})
public class Hourly {

    @JsonProperty("chanceoffog")
    private String chanceoffog;
    @JsonProperty("chanceoffrost")
    private String chanceoffrost;
    @JsonProperty("chanceofhightemp")
    private String chanceofhightemp;
    @JsonProperty("chanceofovercast")
    private String chanceofovercast;
    @JsonProperty("chanceofrain")
    private String chanceofrain;
    @JsonProperty("chanceofremdry")
    private String chanceofremdry;
    @JsonProperty("chanceofsnow")
    private String chanceofsnow;
    @JsonProperty("chanceofsunshine")
    private String chanceofsunshine;
    @JsonProperty("chanceofthunder")
    private String chanceofthunder;
    @JsonProperty("chanceofwindy")
    private String chanceofwindy;
    @JsonProperty("cloudcover")
    private String cloudcover;
    @JsonProperty("DewPointC")
    private String DewPointC;
    @JsonProperty("DewPointF")
    private String DewPointF;
    @JsonProperty("FeelsLikeC")
    private String FeelsLikeC;
    @JsonProperty("FeelsLikeF")
    private String FeelsLikeF;
    @JsonProperty("HeatIndexC")
    private String HeatIndexC;
    @JsonProperty("HeatIndexF")
    private String HeatIndexF;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("lang_pl")
    private List<LangPl_> langPl = new ArrayList<LangPl_>();
    @JsonProperty("precipMM")
    private String precipMM;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("tempC")
    private String tempC;
    @JsonProperty("tempF")
    private String tempF;
    @JsonProperty("time")
    private String time;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("weatherCode")
    private String weatherCode;
    @JsonProperty("weatherDesc")
    private List<WeatherDesc_> weatherDesc = new ArrayList<WeatherDesc_>();
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl_> weatherIconUrl = new ArrayList<WeatherIconUrl_>();
    @JsonProperty("WindChillC")
    private String WindChillC;
    @JsonProperty("WindChillF")
    private String WindChillF;
    @JsonProperty("winddir16Point")
    private String winddir16Point;
    @JsonProperty("winddirDegree")
    private String winddirDegree;
    @JsonProperty("WindGustKmph")
    private String WindGustKmph;
    @JsonProperty("WindGustMiles")
    private String WindGustMiles;
    @JsonProperty("windspeedKmph")
    private String windspeedKmph;
    @JsonProperty("windspeedMiles")
    private String windspeedMiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The chanceoffog
     */
    @JsonProperty("chanceoffog")
    public String getChanceoffog() {
        return chanceoffog;
    }

    /**
     * 
     * @param chanceoffog
     *     The chanceoffog
     */
    @JsonProperty("chanceoffog")
    public void setChanceoffog(String chanceoffog) {
        this.chanceoffog = chanceoffog;
    }

    /**
     * 
     * @return
     *     The chanceoffrost
     */
    @JsonProperty("chanceoffrost")
    public String getChanceoffrost() {
        return chanceoffrost;
    }

    /**
     * 
     * @param chanceoffrost
     *     The chanceoffrost
     */
    @JsonProperty("chanceoffrost")
    public void setChanceoffrost(String chanceoffrost) {
        this.chanceoffrost = chanceoffrost;
    }

    /**
     * 
     * @return
     *     The chanceofhightemp
     */
    @JsonProperty("chanceofhightemp")
    public String getChanceofhightemp() {
        return chanceofhightemp;
    }

    /**
     * 
     * @param chanceofhightemp
     *     The chanceofhightemp
     */
    @JsonProperty("chanceofhightemp")
    public void setChanceofhightemp(String chanceofhightemp) {
        this.chanceofhightemp = chanceofhightemp;
    }

    /**
     * 
     * @return
     *     The chanceofovercast
     */
    @JsonProperty("chanceofovercast")
    public String getChanceofovercast() {
        return chanceofovercast;
    }

    /**
     * 
     * @param chanceofovercast
     *     The chanceofovercast
     */
    @JsonProperty("chanceofovercast")
    public void setChanceofovercast(String chanceofovercast) {
        this.chanceofovercast = chanceofovercast;
    }

    /**
     * 
     * @return
     *     The chanceofrain
     */
    @JsonProperty("chanceofrain")
    public String getChanceofrain() {
        return chanceofrain;
    }

    /**
     * 
     * @param chanceofrain
     *     The chanceofrain
     */
    @JsonProperty("chanceofrain")
    public void setChanceofrain(String chanceofrain) {
        this.chanceofrain = chanceofrain;
    }

    /**
     * 
     * @return
     *     The chanceofremdry
     */
    @JsonProperty("chanceofremdry")
    public String getChanceofremdry() {
        return chanceofremdry;
    }

    /**
     * 
     * @param chanceofremdry
     *     The chanceofremdry
     */
    @JsonProperty("chanceofremdry")
    public void setChanceofremdry(String chanceofremdry) {
        this.chanceofremdry = chanceofremdry;
    }

    /**
     * 
     * @return
     *     The chanceofsnow
     */
    @JsonProperty("chanceofsnow")
    public String getChanceofsnow() {
        return chanceofsnow;
    }

    /**
     * 
     * @param chanceofsnow
     *     The chanceofsnow
     */
    @JsonProperty("chanceofsnow")
    public void setChanceofsnow(String chanceofsnow) {
        this.chanceofsnow = chanceofsnow;
    }

    /**
     * 
     * @return
     *     The chanceofsunshine
     */
    @JsonProperty("chanceofsunshine")
    public String getChanceofsunshine() {
        return chanceofsunshine;
    }

    /**
     * 
     * @param chanceofsunshine
     *     The chanceofsunshine
     */
    @JsonProperty("chanceofsunshine")
    public void setChanceofsunshine(String chanceofsunshine) {
        this.chanceofsunshine = chanceofsunshine;
    }

    /**
     * 
     * @return
     *     The chanceofthunder
     */
    @JsonProperty("chanceofthunder")
    public String getChanceofthunder() {
        return chanceofthunder;
    }

    /**
     * 
     * @param chanceofthunder
     *     The chanceofthunder
     */
    @JsonProperty("chanceofthunder")
    public void setChanceofthunder(String chanceofthunder) {
        this.chanceofthunder = chanceofthunder;
    }

    /**
     * 
     * @return
     *     The chanceofwindy
     */
    @JsonProperty("chanceofwindy")
    public String getChanceofwindy() {
        return chanceofwindy;
    }

    /**
     * 
     * @param chanceofwindy
     *     The chanceofwindy
     */
    @JsonProperty("chanceofwindy")
    public void setChanceofwindy(String chanceofwindy) {
        this.chanceofwindy = chanceofwindy;
    }

    /**
     * 
     * @return
     *     The cloudcover
     */
    @JsonProperty("cloudcover")
    public String getCloudcover() {
        return cloudcover;
    }

    /**
     * 
     * @param cloudcover
     *     The cloudcover
     */
    @JsonProperty("cloudcover")
    public void setCloudcover(String cloudcover) {
        this.cloudcover = cloudcover;
    }

    /**
     * 
     * @return
     *     The DewPointC
     */
    @JsonProperty("DewPointC")
    public String getDewPointC() {
        return DewPointC;
    }

    /**
     * 
     * @param DewPointC
     *     The DewPointC
     */
    @JsonProperty("DewPointC")
    public void setDewPointC(String DewPointC) {
        this.DewPointC = DewPointC;
    }

    /**
     * 
     * @return
     *     The DewPointF
     */
    @JsonProperty("DewPointF")
    public String getDewPointF() {
        return DewPointF;
    }

    /**
     * 
     * @param DewPointF
     *     The DewPointF
     */
    @JsonProperty("DewPointF")
    public void setDewPointF(String DewPointF) {
        this.DewPointF = DewPointF;
    }

    /**
     * 
     * @return
     *     The FeelsLikeC
     */
    @JsonProperty("FeelsLikeC")
    public String getFeelsLikeC() {
        return FeelsLikeC;
    }

    /**
     * 
     * @param FeelsLikeC
     *     The FeelsLikeC
     */
    @JsonProperty("FeelsLikeC")
    public void setFeelsLikeC(String FeelsLikeC) {
        this.FeelsLikeC = FeelsLikeC;
    }

    /**
     * 
     * @return
     *     The FeelsLikeF
     */
    @JsonProperty("FeelsLikeF")
    public String getFeelsLikeF() {
        return FeelsLikeF;
    }

    /**
     * 
     * @param FeelsLikeF
     *     The FeelsLikeF
     */
    @JsonProperty("FeelsLikeF")
    public void setFeelsLikeF(String FeelsLikeF) {
        this.FeelsLikeF = FeelsLikeF;
    }

    /**
     * 
     * @return
     *     The HeatIndexC
     */
    @JsonProperty("HeatIndexC")
    public String getHeatIndexC() {
        return HeatIndexC;
    }

    /**
     * 
     * @param HeatIndexC
     *     The HeatIndexC
     */
    @JsonProperty("HeatIndexC")
    public void setHeatIndexC(String HeatIndexC) {
        this.HeatIndexC = HeatIndexC;
    }

    /**
     * 
     * @return
     *     The HeatIndexF
     */
    @JsonProperty("HeatIndexF")
    public String getHeatIndexF() {
        return HeatIndexF;
    }

    /**
     * 
     * @param HeatIndexF
     *     The HeatIndexF
     */
    @JsonProperty("HeatIndexF")
    public void setHeatIndexF(String HeatIndexF) {
        this.HeatIndexF = HeatIndexF;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The langPl
     */
    @JsonProperty("lang_pl")
    public List<LangPl_> getLangPl() {
        return langPl;
    }

    /**
     * 
     * @param langPl
     *     The lang_pl
     */
    @JsonProperty("lang_pl")
    public void setLangPl(List<LangPl_> langPl) {
        this.langPl = langPl;
    }

    /**
     * 
     * @return
     *     The precipMM
     */
    @JsonProperty("precipMM")
    public String getPrecipMM() {
        return precipMM;
    }

    /**
     * 
     * @param precipMM
     *     The precipMM
     */
    @JsonProperty("precipMM")
    public void setPrecipMM(String precipMM) {
        this.precipMM = precipMM;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The tempC
     */
    @JsonProperty("tempC")
    public String getTempC() {
        return tempC;
    }

    /**
     * 
     * @param tempC
     *     The tempC
     */
    @JsonProperty("tempC")
    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    /**
     * 
     * @return
     *     The tempF
     */
    @JsonProperty("tempF")
    public String getTempF() {
        return tempF;
    }

    /**
     * 
     * @param tempF
     *     The tempF
     */
    @JsonProperty("tempF")
    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The weatherCode
     */
    @JsonProperty("weatherCode")
    public String getWeatherCode() {
        return weatherCode;
    }

    /**
     * 
     * @param weatherCode
     *     The weatherCode
     */
    @JsonProperty("weatherCode")
    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    /**
     * 
     * @return
     *     The weatherDesc
     */
    @JsonProperty("weatherDesc")
    public List<WeatherDesc_> getWeatherDesc() {
        return weatherDesc;
    }

    /**
     * 
     * @param weatherDesc
     *     The weatherDesc
     */
    @JsonProperty("weatherDesc")
    public void setWeatherDesc(List<WeatherDesc_> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    /**
     * 
     * @return
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public List<WeatherIconUrl_> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    /**
     * 
     * @param weatherIconUrl
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public void setWeatherIconUrl(List<WeatherIconUrl_> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    /**
     * 
     * @return
     *     The WindChillC
     */
    @JsonProperty("WindChillC")
    public String getWindChillC() {
        return WindChillC;
    }

    /**
     * 
     * @param WindChillC
     *     The WindChillC
     */
    @JsonProperty("WindChillC")
    public void setWindChillC(String WindChillC) {
        this.WindChillC = WindChillC;
    }

    /**
     * 
     * @return
     *     The WindChillF
     */
    @JsonProperty("WindChillF")
    public String getWindChillF() {
        return WindChillF;
    }

    /**
     * 
     * @param WindChillF
     *     The WindChillF
     */
    @JsonProperty("WindChillF")
    public void setWindChillF(String WindChillF) {
        this.WindChillF = WindChillF;
    }

    /**
     * 
     * @return
     *     The winddir16Point
     */
    @JsonProperty("winddir16Point")
    public String getWinddir16Point() {
        return winddir16Point;
    }

    /**
     * 
     * @param winddir16Point
     *     The winddir16Point
     */
    @JsonProperty("winddir16Point")
    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    /**
     * 
     * @return
     *     The winddirDegree
     */
    @JsonProperty("winddirDegree")
    public String getWinddirDegree() {
        return winddirDegree;
    }

    /**
     * 
     * @param winddirDegree
     *     The winddirDegree
     */
    @JsonProperty("winddirDegree")
    public void setWinddirDegree(String winddirDegree) {
        this.winddirDegree = winddirDegree;
    }

    /**
     * 
     * @return
     *     The WindGustKmph
     */
    @JsonProperty("WindGustKmph")
    public String getWindGustKmph() {
        return WindGustKmph;
    }

    /**
     * 
     * @param WindGustKmph
     *     The WindGustKmph
     */
    @JsonProperty("WindGustKmph")
    public void setWindGustKmph(String WindGustKmph) {
        this.WindGustKmph = WindGustKmph;
    }

    /**
     * 
     * @return
     *     The WindGustMiles
     */
    @JsonProperty("WindGustMiles")
    public String getWindGustMiles() {
        return WindGustMiles;
    }

    /**
     * 
     * @param WindGustMiles
     *     The WindGustMiles
     */
    @JsonProperty("WindGustMiles")
    public void setWindGustMiles(String WindGustMiles) {
        this.WindGustMiles = WindGustMiles;
    }

    /**
     * 
     * @return
     *     The windspeedKmph
     */
    @JsonProperty("windspeedKmph")
    public String getWindspeedKmph() {
        return windspeedKmph;
    }

    /**
     * 
     * @param windspeedKmph
     *     The windspeedKmph
     */
    @JsonProperty("windspeedKmph")
    public void setWindspeedKmph(String windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    /**
     * 
     * @return
     *     The windspeedMiles
     */
    @JsonProperty("windspeedMiles")
    public String getWindspeedMiles() {
        return windspeedMiles;
    }

    /**
     * 
     * @param windspeedMiles
     *     The windspeedMiles
     */
    @JsonProperty("windspeedMiles")
    public void setWindspeedMiles(String windspeedMiles) {
        this.windspeedMiles = windspeedMiles;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
