package com.nice.validate;


import com.nice.enums.ErrorCodeEnum;
import com.nice.exception.NiceServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * 统一入参校验
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Component
public class NiceValidator {

    @Autowired
    private LocalValidatorFactoryBean localValidatorFactoryBean;


    /**
     * 统一入参校验
     *
     * @param object
     * @param groups
     * @throws
     */
    public <T> void validate(T object, Class<?>... groups) throws NiceServiceException {
        Set<ConstraintViolation<T>> constraintViolations = localValidatorFactoryBean.validate(object, groups);
        if (constraintViolations != null && constraintViolations.size() > 0) {
            throw new NiceServiceException(ErrorCodeEnum.ERROR_PARAM.getErrorcode(),
                    constraintViolations.iterator().next().getMessage());
        }
    }

}