package com.xyz.team;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class CapitalResource extends AbsResource {

    private double fund;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "CapitalResource{" +
                "fund=" + fund +
                "} " + super.toString();
    }
}
