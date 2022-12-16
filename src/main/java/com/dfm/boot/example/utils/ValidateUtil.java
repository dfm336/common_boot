package com.dfm.boot.example.utils;

import org.hibernate.validator.HibernateValidator;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidateUtil {

    private static final Validator validatorFast = Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();
    private static final Validator validatorAll = Validation.byProvider(HibernateValidator.class).configure().failFast(false).buildValidatorFactory().getValidator();

    /**
     * 校验遇到第一个不合法的字段直接返回不合法字段，后续字段不再校验
     *
     * @param <T>
     * @param domain
     * @return
     * @throws Exception
     * @Time 2020年6月22日 上午11:36:13
     */
    public static <T> Set<ConstraintViolation<T>> validateFast(T domain) {
        return validatorFast.validate(domain);
    }

    /**
     * 校验所有字段并返回不合法字段
     *
     * @param <T>
     * @param domain
     * @return
     * @Time 2020年6月22日 上午11:36:55
     */
    public static <T> Set<ConstraintViolation<T>> validateAll(T domain) {
        return validatorAll.validate(domain);
    }

    @Deprecated
    public static <T> void validateAllAndThrow(T domain) {
        if (domain == null) {
            throw new RuntimeException("参数缺失");
        }
        Set<ConstraintViolation<T>> errors = validateAll(domain);
        if (!CollectionUtils.isEmpty(errors)) {
            Set<String> collect = errors.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
            throw new RuntimeException(String.join(";", collect));
        }
    }

//    public static <T> Response<Void> validateAllAndReturn(T domain) {
//        if (domain == null) {
//            return Response.error(CommonStatusCode.PARAM_ERROR, "参数缺失");
//        }
//        Set<ConstraintViolation<T>> errors = validateAll(domain);
//        if (!CollectionUtils.isEmpty(errors)) {
//            Set<String> collect = errors.stream().map(ConstraintViolation::getMessage).collect(Collectors.toSet());
//            return Response.error(String.join("!", collect));
//        }
//        return Response.success();
//    }
}
