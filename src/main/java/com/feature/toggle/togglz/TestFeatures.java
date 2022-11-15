package com.feature.toggle.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;




public enum TestFeatures implements Feature {

    @Label("Test Label 1")
    TEST_LABEL1,


    @Label("Test Label 2")
    TEST_LABEL2,

    @FeatureGroup("Performance Improvements")
    PERFORMANCE_IMPROVEMENTS,
    @FeatureGroup("Performance Improvements")
    PERFORMANCE_IMPROVEMENTS2,

    
}



