package design.patterns.structural.adapter.demo;

import design.patterns.structural.adapter.demo.DC5;
import design.patterns.structural.adapter.demo.PowerAdapter;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();

    }
}
