package com.xyz.team;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({ @JsonSubTypes.Type(value = TeamProperties.class, name = "team"),
                @JsonSubTypes.Type(value = HRResource.class, name = "hr"),
                @JsonSubTypes.Type(value = CapitalResource.class, name = "capital")})
public abstract class AbsResource {

    protected String type;      //通过type表示区分子类

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
