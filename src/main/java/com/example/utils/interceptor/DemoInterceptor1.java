package com.example.utils.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * interceptor demo
 *
 * Created by hb on 2018/8/20.
 */
public class DemoInterceptor1 implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(DemoInterceptor1.class);
    //Controller处理之前被调用
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        log.info("DemoInterceptor1.preHandle被调用");
        return true;
    }

    //Controller处理完，渲染视图前被调用
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        log.info("DemoInterceptor1.postHandle被调用");
    }

    //渲染视图后被调用
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        log.info("DemoInterceptor1.afterCompletion被调用");
    }
}
