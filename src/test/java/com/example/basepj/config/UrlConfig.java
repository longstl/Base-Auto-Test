package com.example.basepj.config;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UrlConfig {
    private String url;
    private String protocol;
    private String cloak;
}
