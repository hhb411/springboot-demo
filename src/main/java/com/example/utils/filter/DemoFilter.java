package com.example.utils.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * filter demo
 *
 * Created by hb on 2018/8/20.
 */
@Component
@WebFilter(urlPatterns = "/demo/jspDemo", filterName = "demoFilter")
public class DemoFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(DemoFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器 DemoFilter.init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        log.info("过滤器 DemoFilter.doFilter");
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器 DemoFilter.destroy");
    }
}
