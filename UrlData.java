package com.rockeseat.RedirectUrlShortener;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UrlData {

    private String originalUrl;
    private long expirationTime;

    public UrlData(String originalUrl, long expirationTime) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

}