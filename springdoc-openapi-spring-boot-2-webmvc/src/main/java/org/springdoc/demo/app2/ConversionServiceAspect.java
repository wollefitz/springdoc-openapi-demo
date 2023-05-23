package org.springdoc.demo.app2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Aspect
public class ConversionServiceAspect {

    @Pointcut("execution(* org.springframework.core.convert.ConversionService.convert(Object, Class))")
    private void simpleConversionOperation() {}

    @Around("simpleConversionOperation()")
    private Object simpleConversionAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return Optional.ofNullable(proceedingJoinPoint.proceed()).orElseThrow(RuntimeException::new);
    }
}
