package com.yummy.object.object.domin.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;
import java.util.stream.Collectors;

public class ModelValidator {
    private static final Logger logger = LoggerFactory.getLogger(ModelValidator.class);
    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static <T>  Map<String, Object> validate(T t) {
        Validator validator=factory.getValidator();
        //List constraintViolations  = (List)validator.validate(t).stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        HashMap<String ,Object> stringObjectHashMap=new HashMap<>();
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            stringObjectHashMap.put(constraintViolation.getPropertyPath().toString(),constraintViolation.getMessage()) ;
                   }
        return stringObjectHashMap;
    }

    public ModelValidator() {
    }
}
