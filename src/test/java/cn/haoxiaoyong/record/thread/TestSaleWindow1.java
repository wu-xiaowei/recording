package cn.haoxiaoyong.record.thread;

import cn.haoxiaoyong.record.thread.SaleWindow;
import cn.haoxiaoyong.record.thread.SaleWindow1;
import org.junit.Test;

/**
 * Created by haoxy on 2019/1/16.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
public class TestSaleWindow1 {

    @Test
    public void testSaleWindow() {
        SaleWindow1 saleWindow = new SaleWindow1();
        Thread t1 = new Thread(saleWindow);
        Thread t2 = new Thread(saleWindow);
        t1.setName("窗口 A");
        t2.setName("窗口 B");
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        SaleWindow1 saleWindow = new SaleWindow1();
        Thread t1 = new Thread(saleWindow);
        Thread t2 = new Thread(saleWindow);
        t1.setName("窗口 A");
        t2.setName("窗口 B");
        t1.start();
        t2.start();
    }
}
