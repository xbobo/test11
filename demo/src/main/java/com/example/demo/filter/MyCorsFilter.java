package com.example.demo.filter;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.annotation.WebFilter;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class MyCorsFilter extends CorsFilter {

    public MyCorsFilter(CorsConfigurationSource configSource) {
        super(configSource);
    }
}