package sample.test.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@ConfigurationProperties
public class ServiceProperties {

    private String vehicleServiceRootUrl = "http://localhost:8080/vs";

    public String getVehicleServiceRootUrl() {
        return vehicleServiceRootUrl;
    }

    public void setVehicleServiceRootUrl(String vehicleServiceRootUrl) {
        this.vehicleServiceRootUrl = vehicleServiceRootUrl;
    }
}
