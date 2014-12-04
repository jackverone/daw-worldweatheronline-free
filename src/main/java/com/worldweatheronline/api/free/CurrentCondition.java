
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
    "cloudcover",
    "FeelsLikeC",
    "FeelsLikeF",
    "humidity",
    "lang_pl",
    "observation_time",
    "precipMM",
    "pressure",
    "temp_C",
    "temp_F",
    "visibility",
    "weatherCode",
    "weatherDesc",
    "weatherIconUrl",
    "winddir16Point",
    "winddirDegree",
    "windspeedKmph",
    "windspeedMiles"
})
public class CurrentCondition {

    @JsonProperty("cloudcover")
    private String cloudcover;
    @JsonProperty("FeelsLikeC")
    private String FeelsLikeC;
    @JsonProperty("FeelsLikeF")
    private String FeelsLikeF;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("lang_pl")
    private List<LangPl> langPl = new ArrayList<LangPl>();
    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("precipMM")
    private String precipMM;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("temp_C")
    private String tempC;
    @JsonProperty("temp_F")
    private String tempF;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("weatherCode")
    private String weatherCode;
    @JsonProperty("weatherDesc")
    private List<WeatherDesc> weatherDesc = new ArrayList<WeatherDesc>();
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> weatherIconUrl = new ArrayList<WeatherIconUrl>();
    @JsonProperty("winddir16Point")
    private String winddir16Point;
    @JsonProperty("winddirDegree")
    private String winddirDegree;
    @JsonProperty("windspeedKmph")
    private String windspeedKmph;
    @JsonProperty("windspeedMiles")
    private String windspeedMiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public List<LangPl> getLangPl() {
        return langPl;
    }

    /**
     * 
     * @param langPl
     *     The lang_pl
     */
    @JsonProperty("lang_pl")
    public void setLangPl(List<LangPl> langPl) {
        this.langPl = langPl;
    }

    /**
     * 
     * @return
     *     The observationTime
     */
    @JsonProperty("observation_time")
    public String getObservationTime() {
        return observationTime;
    }

    /**
     * 
     * @param observationTime
     *     The observation_time
     */
    @JsonProperty("observation_time")
    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
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
    @JsonProperty("temp_C")
    public String getTempC() {
        return tempC;
    }

    /**
     * 
     * @param tempC
     *     The temp_C
     */
    @JsonProperty("temp_C")
    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    /**
     * 
     * @return
     *     The tempF
     */
    @JsonProperty("temp_F")
    public String getTempF() {
        return tempF;
    }

    /**
     * 
     * @param tempF
     *     The temp_F
     */
    @JsonProperty("temp_F")
    public void setTempF(String tempF) {
        this.tempF = tempF;
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
    public List<WeatherDesc> getWeatherDesc() {
        return weatherDesc;
    }

    /**
     * 
     * @param weatherDesc
     *     The weatherDesc
     */
    @JsonProperty("weatherDesc")
    public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    /**
     * 
     * @return
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public List<WeatherIconUrl> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    /**
     * 
     * @param weatherIconUrl
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
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
