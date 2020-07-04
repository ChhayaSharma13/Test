package com.urlshortner.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "Request object for POST method")
public class OriginalURLRequest {

    @ApiModelProperty(required = true, notes = "Original URL")
    private String originalURL;

    @ApiModelProperty(notes = "D")
    private Date expireDate;

    public String getLongUrl() {
        return originalURL;
    }
    public void setLongUrl(String longUrl) {
        this.originalURL = originalURL;
    }
    public Date getExpiresDate() {
        return expireDate;
    }
    public void setExpiresDate(Date expiresDate) {
        this.expireDate = expireDate;
    }
}