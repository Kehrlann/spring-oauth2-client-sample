package com.example.demo;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController {

    @GetMapping("/")
    public String getToken(@RegisteredOAuth2AuthorizedClient("dex") OAuth2AuthorizedClient client) {
        // Log in with admin@example.com / password
        return "Here's the token: " + client.getAccessToken().getTokenValue();
    }
}
