
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
    "current_condition",
    "request",
    "weather"
})
public class Data {

    @JsonProperty("current_condition")
    private List<CurrentCondition> currentCondition = new ArrayList<CurrentCondition>();
    @JsonProperty("request")
    private List<Request> request = new ArrayList<Request>();
    @JsonProperty("weather")
    private List<Weather> weather = new ArrayList<Weather>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The currentCondition
     */
    @JsonProperty("current_condition")
    public List<CurrentCondition> getCurrentCondition() {
        return currentCondition;
    }

    /**
     * 
     * @param currentCondition
     *     The current_condition
     */
    @JsonProperty("current_condition")
    public void setCurrentCondition(List<CurrentCondition> currentCondition) {
        this.currentCondition = currentCondition;
    }

    /**
     * 
     * @return
     *     The request
     */
    @JsonProperty("request")
    public List<Request> getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    @JsonProperty("request")
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The weather
     */
    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
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
