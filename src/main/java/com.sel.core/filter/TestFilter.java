package com.sel.core.filter;


import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Enumeration<String> names = filterConfig.getInitParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            System.out.println(name+"---------"+filterConfig.getInitParameter(name));
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }


}
