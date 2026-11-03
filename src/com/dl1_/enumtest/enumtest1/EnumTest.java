package com.dl1_.enumtest.enumtest1;

public class EnumTest {
    public static void main(String[] args) {
        OrderState o1 = OrderState.payment_pending;
        OrderState o2 = OrderState.processing;
        System.out.println(OrderState.payment_pending.getName());
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.getName());
        System.out.println(o2.getName());

        OrderState.payment_pending.setName("待支付");
        System.out.println(OrderState.payment_pending.getName());
        OrderState.payment_pending.setName("111");
        System.out.println(OrderState.payment_pending.getName());
//匹配
        switch (o2) {
            case payment_pending:
                System.out.println(o2.getName());
                break;
            case processing:
                System.out.println(o2.getName());
                break;
            case shipped:
                System.out.println(o2.getName());
                break;
            case out_for_delivery:
                System.out.println(o2.getName());
                break;
            case delivered:
                System.out.println(o2.getName());
                break;
            case cancelled:
                System.out.println(o2.getName());
                break;
        }
    }
}
