package app;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FindBugs {
    public void ternary(){
        Random random = new Random();
        boolean flag = random.nextBoolean();
        Number n = flag ? Integer.valueOf(1):Double.valueOf(2.0);

        boolean flag1 = random.nextBoolean();
        boolean flag2 = random.nextBoolean();
        Integer n1 = flag1 ? 1: flag2 ? 2 : null;
        }

        double[] vals = new double[]{1.0,2.0,3.0};
        double ternary2(int idx){return (idx <0 || idx >= vals.length) ? null : vals[idx];}

        private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        public String dateFormat(){return format.format(new Date());}

    public void bigDecimal() {
            System.out.println(new BigDecimal(1.1));
            BigDecimal d1 = new BigDecimal("1.1");
            BigDecimal d2 = new BigDecimal("1.10");
            System.out.println(d1.equals(d2));
    }
    public void printf(){
        System.out.printf("%s\n", "str#1");
        System.out.println("str#2");
    }
}
