package cn.vertxup;

import java.io.IOException;

public class ZoDebugger {

    public static void main(final String[] args) throws IOException {
        for (int i = 1; i < 101; i++) {
            if (i < 10) {
                System.out.println("00" + i);
            } else if (i < 100) {
                System.out.println("0" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}