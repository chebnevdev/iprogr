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
        "id",
        "width",
        "height",
        "url",
        "photographer",
        "photographer_url",
        "photographer_id",
        "avg_color",
        "src",
        "liked"
})
public class PexelsPhoto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("url")
    private String url;
    @JsonProperty("photographer")
    private String photographer;
    @JsonProperty("photographer_url")
    private String photographerUrl;
    @JsonProperty("photographer_id")
    private Integer photographerId;
    @JsonProperty("avg_color")
    private String avgColor;
    @JsonProperty("src")
    private PexelsPhotoSrc src;
    @JsonProperty("liked")
    private Boolean liked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("photographer")
    public String getPhotographer() {
        return photographer;
    }

    @JsonProperty("photographer")
    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    @JsonProperty("photographer_url")
    public String getPhotographerUrl() {
        return photographerUrl;
    }

    @JsonProperty("photographer_url")
    public void setPhotographerUrl(String photographerUrl) {
        this.photographerUrl = photographerUrl;
    }

    @JsonProperty("photographer_id")
    public Integer getPhotographerId() {
        return photographerId;
    }

    @JsonProperty("photographer_id")
    public void setPhotographerId(Integer photographerId) {
        this.photographerId = photographerId;
    }

    @JsonProperty("avg_color")
    public String getAvgColor() {
        return avgColor;
    }

    @JsonProperty("avg_color")
    public void setAvgColor(String avgColor) {
        this.avgColor = avgColor;
    }

    @JsonProperty("src")
    public PexelsPhotoSrc getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(PexelsPhotoSrc src) {
        this.src = src;
    }

    @JsonProperty("liked")
    public Boolean getLiked() {
        return liked;
    }

    @JsonProperty("liked")
    public void setLiked(Boolean liked) {
        this.liked = liked;
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
