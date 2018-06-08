package com.xyz.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.util.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class VehicleDetails {

    private String make;
    private String model;

    @JsonCreator
    public VehicleDetails(@JsonProperty("make")String make,
                          @JsonProperty("model")String model) {
        Assert.notNull(make, "Make must not be not");
        Assert.notNull(model, "Model must not be not");
        this.make = make;
        this.model = model;
    }

    public VehicleDetails() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        return this.make.hashCode() * 31 + this.model.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        VehicleDetails other = (VehicleDetails)obj;
        return this.make.equals(other.make) && (this.model.equals(other.model));
    }
}
