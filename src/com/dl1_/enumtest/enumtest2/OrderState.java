package com.dl1_.enumtest.enumtest2;

public enum OrderState {
    payment_pending("待支付",1),
    processing("处理中",2),
    shipped("已发货",3),
    out_for_delivery("已发货",4),
    delivered("已送达",5),
    cancelled("已取消",6);
    String name;
    int id;

    private OrderState(String aaa, int bbb) {
        System.out.println("111111111111111" + aaa+bbb);
        this.name = aaa;
        this.id = bbb;
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
