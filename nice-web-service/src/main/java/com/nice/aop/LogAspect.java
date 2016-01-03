package com.nice.aop;



import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nice.service.request.CommonRequest;

/**
 * 打印日志
 * Author: liliangxing
 * Time: 2015-11-24.
 */
@Component
@Aspect
@Slf4j
public class LogAspect {

	private static Logger log = (Logger) LoggerFactory.getLogger(LogAspect.class);
	
    /**
     * 调用启动服务
     * @param joinPoint
     */
    @Before("execution(* com.nice.service..*.*Impl.*(..))")
    public void logBefore(JoinPoint joinPoint){
        String clazzName = joinPoint.getTarget().getClass().getSimpleName();   //获得类名
        String methodName = joinPoint.getSignature().getName();   //获得方法名
        Object[] args = joinPoint.getArgs();  //获得参数列表
        String requestSeq = ""; //请求流水
        Object argObject = null; //参数
        if (args!= null && args.length > 0) {
            argObject = args[0];
            requestSeq = getRequestSeq(argObject);
        }
        log.info("[{}][{}.{}]Start to handle request \n [{}].", requestSeq,clazzName, methodName , argObject);
    }

    /**
     * 服务结束时调用
     * @param joinPoint
     * @param reponse
     */
    @AfterReturning(value ="execution(* com.nice.service..*.*Impl.*(..))",returning = "reponse")
    public void logAfterRunning(JoinPoint joinPoint, Object reponse){
        String clazzName = joinPoint.getTarget().getClass().getSimpleName();   //获得类名
        String methodName = joinPoint.getSignature().getName();   //获得方法名
        Object[] args = joinPoint.getArgs();  //获得参数列表
        String requestSeq = ""; //请求流水
        if (args!= null && args.length > 0) {
            requestSeq = getRequestSeq( args[0]);
        }
        log.info("[{}][{}.{}]Finish handling reponse \n [{}].", requestSeq,clazzName, methodName, reponse);
    }

    //从参数中获取请求流水
    public String getRequestSeq(Object argObject){
        String requestSeq = ""; //请求流水号
        if (argObject instanceof CommonRequest) {
            requestSeq = ((CommonRequest)argObject).getInitiationID();
        }
        return requestSeq;
    }
}
