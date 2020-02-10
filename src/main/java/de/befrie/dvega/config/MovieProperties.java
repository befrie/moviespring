package de.befrie.dvega.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("movies")
public class MovieProperties {
    private String welcomeMessage = "Hallo Keule!";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
