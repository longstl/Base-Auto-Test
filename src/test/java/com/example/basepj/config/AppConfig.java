package com.example.basepj.config;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppConfig {
    private String environment;
    private UrlConfig url;

    public boolean isDevEnvironment() {
        return "dev".equalsIgnoreCase(environment);
    }

    public boolean isStagingEnvironment() {
        return "staging".equalsIgnoreCase(environment);
    }

    public boolean isProductionEnvironment() {
        return "prod".equalsIgnoreCase(environment) || "production".equalsIgnoreCase(environment);
    }

    public boolean isTestEnvironment() {
        return "test".equalsIgnoreCase(environment);
    }
}
