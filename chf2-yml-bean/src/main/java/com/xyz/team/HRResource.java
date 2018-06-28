package com.xyz.team;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 6/28/18
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class HRResource extends AbsResource {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "HRResource{" +
                "amount=" + amount +
                "} " + super.toString();
    }
}
