package com.bemaurya.urlShortening.Service;

import org.springframework.stereotype.Service;

import com.bemaurya.urlShortening.Model.Url;
import com.bemaurya.urlShortening.Model.UrlDto;

@Service
public interface UrlService {
	//To generate the short link
    public Url generateShortLink(UrlDto urlDto);

    //To persist the short link
    public Url persistShortLink(Url url);

    //To get the encoded url
    public Url getEncodedUrl(String url);

    //To delete short link
    public void deleteShortLink(Url url);

}
