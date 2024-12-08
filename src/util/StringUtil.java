package util;

import java.util.List;

public class StringUtil {
    public static String printString(List<?> ListPrint){
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object: ListPrint)
        {
            stringBuilder
                    .append(object.toString())
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
