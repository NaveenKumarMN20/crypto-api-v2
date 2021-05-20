
package dev.mnnk.botv2.response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_unit",
    "quote_unit",
    "low",
    "high",
    "last",
    "type",
    "open",
    "volume",
    "sell",
    "buy",
    "at",
    "name"
})
@Generated("jsonschema2pojo")
public class Kavausdt {

    @JsonProperty("base_unit")
    private String baseUnit;
    @JsonProperty("quote_unit")
    private String quoteUnit;
    @JsonProperty("low")
    private String low;
    @JsonProperty("high")
    private String high;
    @JsonProperty("last")
    private String last;
    @JsonProperty("type")
    private String type;
    @JsonProperty("open")
    private Double open;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("sell")
    private String sell;
    @JsonProperty("buy")
    private String buy;
    @JsonProperty("at")
    private Integer at;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("base_unit")
    public String getBaseUnit() {
        return baseUnit;
    }

    @JsonProperty("base_unit")
    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public Kavausdt withBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
        return this;
    }

    @JsonProperty("quote_unit")
    public String getQuoteUnit() {
        return quoteUnit;
    }

    @JsonProperty("quote_unit")
    public void setQuoteUnit(String quoteUnit) {
        this.quoteUnit = quoteUnit;
    }

    public Kavausdt withQuoteUnit(String quoteUnit) {
        this.quoteUnit = quoteUnit;
        return this;
    }

    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(String low) {
        this.low = low;
    }

    public Kavausdt withLow(String low) {
        this.low = low;
        return this;
    }

    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(String high) {
        this.high = high;
    }

    public Kavausdt withHigh(String high) {
        this.high = high;
        return this;
    }

    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }

    public Kavausdt withLast(String last) {
        this.last = last;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Kavausdt withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("open")
    public Double getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(Double open) {
        this.open = open;
    }

    public Kavausdt withOpen(Double open) {
        this.open = open;
        return this;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Kavausdt withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    @JsonProperty("sell")
    public String getSell() {
        return sell;
    }

    @JsonProperty("sell")
    public void setSell(String sell) {
        this.sell = sell;
    }

    public Kavausdt withSell(String sell) {
        this.sell = sell;
        return this;
    }

    @JsonProperty("buy")
    public String getBuy() {
        return buy;
    }

    @JsonProperty("buy")
    public void setBuy(String buy) {
        this.buy = buy;
    }

    public Kavausdt withBuy(String buy) {
        this.buy = buy;
        return this;
    }

    @JsonProperty("at")
    public Integer getAt() {
        return at;
    }

    @JsonProperty("at")
    public void setAt(Integer at) {
        this.at = at;
    }

    public Kavausdt withAt(Integer at) {
        this.at = at;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Kavausdt withName(String name) {
        this.name = name;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Kavausdt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Kavausdt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("baseUnit");
        sb.append('=');
        sb.append(((this.baseUnit == null)?"<null>":this.baseUnit));
        sb.append(',');
        sb.append("quoteUnit");
        sb.append('=');
        sb.append(((this.quoteUnit == null)?"<null>":this.quoteUnit));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null)?"<null>":this.low));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("last");
        sb.append('=');
        sb.append(((this.last == null)?"<null>":this.last));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("sell");
        sb.append('=');
        sb.append(((this.sell == null)?"<null>":this.sell));
        sb.append(',');
        sb.append("buy");
        sb.append('=');
        sb.append(((this.buy == null)?"<null>":this.buy));
        sb.append(',');
        sb.append("at");
        sb.append('=');
        sb.append(((this.at == null)?"<null>":this.at));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.last == null)? 0 :this.last.hashCode()));
        result = ((result* 31)+((this.sell == null)? 0 :this.sell.hashCode()));
        result = ((result* 31)+((this.buy == null)? 0 :this.buy.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.baseUnit == null)? 0 :this.baseUnit.hashCode()));
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.at == null)? 0 :this.at.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.quoteUnit == null)? 0 :this.quoteUnit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kavausdt) == false) {
            return false;
        }
        Kavausdt rhs = ((Kavausdt) other);
        return ((((((((((((((this.last == rhs.last)||((this.last!= null)&&this.last.equals(rhs.last)))&&((this.sell == rhs.sell)||((this.sell!= null)&&this.sell.equals(rhs.sell))))&&((this.buy == rhs.buy)||((this.buy!= null)&&this.buy.equals(rhs.buy))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.baseUnit == rhs.baseUnit)||((this.baseUnit!= null)&&this.baseUnit.equals(rhs.baseUnit))))&&((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high))))&&((this.at == rhs.at)||((this.at!= null)&&this.at.equals(rhs.at))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.quoteUnit == rhs.quoteUnit)||((this.quoteUnit!= null)&&this.quoteUnit.equals(rhs.quoteUnit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))));
    }

}
