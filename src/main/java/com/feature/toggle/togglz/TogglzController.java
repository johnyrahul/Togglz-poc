package com.feature.toggle.togglz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@RestController
public class TogglzController {

    @Autowired
    private FeatureManager featureManager;

    public static final Feature HELLO_WORLD = new NamedFeature("HELLO_WORLD");

    @GetMapping("/")
    public String index() {
        if (featureManager.isActive(HELLO_WORLD)) {
             return "Feature enabled";
        }

        return "Feature not enabled";
    }

    
}
