package com.feature.toggle.togglz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@Configuration
public class MyTogglzConfig {

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(TestFeatures.class);
    }

}
