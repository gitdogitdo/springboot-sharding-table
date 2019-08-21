package com.xd.shardingtable.validator;

import com.xd.shardingtable.annotation.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @Author: Dokit
 * @Date: 2019/8/21 17:47
 */
public class PhoneValidator implements ConstraintValidator<Phone, Object> {
    private static final String PHONE_REGEX = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        //值不为空或者满足正则表达式时返回true
        return Objects.isNull(value) || Pattern.compile(PHONE_REGEX).matcher(value.toString()).find();
    }
}
