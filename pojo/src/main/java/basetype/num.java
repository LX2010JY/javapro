package basetype;

import java.math.BigDecimal;

public class num {
    public static void bigdecimal(String strNum) {
        if(strNum == null || strNum == "") {
            strNum = "0000.00";
        }
        BigDecimal num = new BigDecimal(strNum);
        System.out.println(num);
    }
}
