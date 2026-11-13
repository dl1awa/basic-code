package com.dl1_.ooppolymorphic.test2;

public class Test {
    public static void main(String[] args) {
        Fu f = new Zi();
        f.show();
        f.fushow();
        System.out.println(f.name);
        ((Zi)f).zishow();
        Zi z = ( Zi )f;
        z.zishow();
    }
}
