package com.chebnevdev.iprogr.data;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "original",
        "large2x",
        "large",
        "medium",
        "small",
        "portrait",
        "landscape",
        "tiny"
})
public class PexelsPhotoSrc {

    @JsonProperty("original")
    private String original;
    @JsonProperty("large2x")
    private String large2x;
    @JsonProperty("large")
    private String large;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("small")
    private String small;
    @JsonProperty("portrait")
    private String portrait;
    @JsonProperty("landscape")
    private String landscape;
    @JsonProperty("tiny")
    private String tiny;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    @JsonProperty("large2x")
    public String getLarge2x() {
        return large2x;
    }

    @JsonProperty("large2x")
    public void setLarge2x(String large2x) {
        this.large2x = large2x;
    }

    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    @JsonProperty("portrait")
    public String getPortrait() {
        return portrait;
    }

    @JsonProperty("portrait")
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @JsonProperty("landscape")
    public String getLandscape() {
        return landscape;
    }

    @JsonProperty("landscape")
    public void setLandscape(String landscape) {
        this.landscape = landscape;
    }

    @JsonProperty("tiny")
    public String getTiny() {
        return tiny;
    }

    @JsonProperty("tiny")
    public void setTiny(String tiny) {
        this.tiny = tiny;
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
