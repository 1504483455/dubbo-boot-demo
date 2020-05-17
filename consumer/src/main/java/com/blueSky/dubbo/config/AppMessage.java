package com.blueSky.dubbo.config;

import org.springframework.context.annotation.Bean;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/16
 */

public class AppMessage {

    private String version;

    private Boolean testApp;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getTestApp() {
        return testApp;
    }

    public void setTestApp(Boolean testApp) {
        this.testApp = testApp;
    }

    @Override
    public String toString() {
        return "AppMessage{" +
                "version='" + version + '\'' +
                ", testApp=" + testApp +
                '}';
    }
}
