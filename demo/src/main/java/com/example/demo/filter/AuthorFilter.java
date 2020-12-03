//package com.example.demo.filter;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//import com.alibaba.fastjson.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Claims;
//
//import static java.lang.Long.parseLong;
//
///**
// * 功能描述
// *
// * @author chenjian@pxjy.com
// * @date 2019/1/10 15:56
// */
//@Component
//@WebFilter(urlPatterns = "/", filterName = "authorFilter")
//@Order(Integer.MAX_VALUE - 1)
//public class AuthorFilter implements Filter {
//    private static final Logger logger = LoggerFactory.getLogger(AuthorFilter.class);
////    @Autowired
////    private AudienceConfig audience;
//
////    @Autowired
////    private StudentService userService;
//    private static final String[] URL_FILTER_LIST = {
//            "/actuator", "/instances", "/error", "/user/", "swagger", "/druid/", "/v2/api-docs",
//            "/download_file", "/check_user"
//    };
//
//    private static final String OPTIONS = "OPTIONS";
//
//    private static final String AUTH_HEADER_START = "bearer;";
//
//    private static final String TOKEN_USER_KEY = "userid";
//
//    @Value("${author.checkToken}")
//    private boolean checkToken;
//
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        String url = request.getRequestURI();
//        String method = request.getMethod();
//
//        logger.debug("url = {},method = {}", url, method);
//        try {
//            checkToken(request, response);
//            filterChain.doFilter(servletRequest, servletResponse);
//            logger.debug("url = {} Over", url);
////        } catch (UserException e) {
////            logger.error("", e);
////            dueException(response, e.getMessage(), Result.NOAUTH);
////        } catch (TokenException e) {
////            logger.error("", e);
////            dueException(response, e.getMessage(), Result.NOAUTH);
//        } catch (Exception e) {
//            logger.error("", e);
//            dueException(response, e.getMessage(), -1);
//        }
//    }
//
//
//    private void checkToken(HttpServletRequest req, HttpServletResponse response) {
//        String url = req.getRequestURI();
//        String method = req.getMethod();
//
//        //通过配置,跳过检测token
//        if (!checkToken) {
//            return;
//        }
//
//        //跳过OPTIONS
//        if (OPTIONS.equals(method)) {
//            return;
//        }
//
//        //跳过不需要检测的API
//        for (String s : URL_FILTER_LIST) {
//            if (url.contains(s)) {
//                return;
//            }
//        }
//        return ;
//
//    }
//
//
//    private void dueException(HttpServletResponse response, String error, int status) {
//        response.setStatus(200);
//        response.setHeader("Content-type", "application/json;charset=UTF-8");
//        try {
//            response.getWriter().write(JSONObject.toJSONString("error"+error+";status"+status));
//        } catch (Exception e) {
//            logger.error("", e);
//        }
//    }
//
//}
