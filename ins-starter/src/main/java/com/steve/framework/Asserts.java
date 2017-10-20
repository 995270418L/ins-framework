package com.steve.framework;

import com.steve.framework.exception.InsBuineseException;
import org.springframework.util.ObjectUtils;
import java.util.regex.Pattern;

/**
 * Created by ZHANGWEI5095@QQ.COM on 4:37 2017/7/30.
 */
public final class Asserts {

    private static final String STREN = "string not be null";
    private static final String URLREGEXEN = "url format error";
    private static final String STRREGEXEN = "string format error";

    public static void notnull(Object obj){
        if(ObjectUtils.isEmpty(obj)){
            throw new InsBuineseException(STREN);
        }
    }

    public static void notnull(Object str, String message){
        if(ObjectUtils.isEmpty(str)){
            throw new InsBuineseException(STREN, message);
        }
    }

    public static void matcher(String input, String regex, String message){
        if(!matcher(input, regex)){
            throw new InsBuineseException(URLREGEXEN, message);
        }
    }

    public static boolean matcher(String input, String regex){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }

}
