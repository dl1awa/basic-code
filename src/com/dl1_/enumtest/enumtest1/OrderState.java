package com.dl1_.enumtest.enumtest1;

public enum OrderState {
    payment_pending,
    processing("处理中"),
    shipped("已发货"),
    out_for_delivery("已发货"),
    delivered("已送达"),
    cancelled("已取消");
    private String name;

    private OrderState(String aaa) {
        this.name = aaa;
    }
    private OrderState() {

    }
    public String getName() {
        return name;
    }
    public void setName(String aaa) {
        this.name = aaa;
    }
}
