
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
    "astronomy",
    "date",
    "hourly",
    "maxtempC",
    "maxtempF",
    "mintempC",
    "mintempF",
    "uvIndex"
})
public class Weather {

    @JsonProperty("astronomy")
    private List<Astronomy> astronomy = new ArrayList<Astronomy>();
    @JsonProperty("date")
    private String date;
    @JsonProperty("hourly")
    private List<Hourly> hourly = new ArrayList<Hourly>();
    @JsonProperty("maxtempC")
    private String maxtempC;
    @JsonProperty("maxtempF")
    private String maxtempF;
    @JsonProperty("mintempC")
    private String mintempC;
    @JsonProperty("mintempF")
    private String mintempF;
    @JsonProperty("uvIndex")
    private String uvIndex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public List<Astronomy> getAstronomy() {
        return astronomy;
    }

    /**
     * 
     * @param astronomy
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public void setAstronomy(List<Astronomy> astronomy) {
        this.astronomy = astronomy;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The hourly
     */
    @JsonProperty("hourly")
    public List<Hourly> getHourly() {
        return hourly;
    }

    /**
     * 
     * @param hourly
     *     The hourly
     */
    @JsonProperty("hourly")
    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }

    /**
     * 
     * @return
     *     The maxtempC
     */
    @JsonProperty("maxtempC")
    public String getMaxtempC() {
        return maxtempC;
    }

    /**
     * 
     * @param maxtempC
     *     The maxtempC
     */
    @JsonProperty("maxtempC")
    public void setMaxtempC(String maxtempC) {
        this.maxtempC = maxtempC;
    }

    /**
     * 
     * @return
     *     The maxtempF
     */
    @JsonProperty("maxtempF")
    public String getMaxtempF() {
        return maxtempF;
    }

    /**
     * 
     * @param maxtempF
     *     The maxtempF
     */
    @JsonProperty("maxtempF")
    public void setMaxtempF(String maxtempF) {
        this.maxtempF = maxtempF;
    }

    /**
     * 
     * @return
     *     The mintempC
     */
    @JsonProperty("mintempC")
    public String getMintempC() {
        return mintempC;
    }

    /**
     * 
     * @param mintempC
     *     The mintempC
     */
    @JsonProperty("mintempC")
    public void setMintempC(String mintempC) {
        this.mintempC = mintempC;
    }

    /**
     * 
     * @return
     *     The mintempF
     */
    @JsonProperty("mintempF")
    public String getMintempF() {
        return mintempF;
    }

    /**
     * 
     * @param mintempF
     *     The mintempF
     */
    @JsonProperty("mintempF")
    public void setMintempF(String mintempF) {
        this.mintempF = mintempF;
    }

    /**
     * 
     * @return
     *     The uvIndex
     */
    @JsonProperty("uvIndex")
    public String getUvIndex() {
        return uvIndex;
    }

    /**
     * 
     * @param uvIndex
     *     The uvIndex
     */
    @JsonProperty("uvIndex")
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
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
