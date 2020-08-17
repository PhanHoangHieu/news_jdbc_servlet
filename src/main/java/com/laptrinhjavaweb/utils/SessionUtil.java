package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {

    private static SessionUtil sessionUtil = null;

    public static SessionUtil getInstance() {
        if (sessionUtil == null) {
            sessionUtil = new SessionUtil();
        }
        return sessionUtil;
    }
    // duy trì thông tin nguời dùng ra khỏi hệ thống
    public void putValue(HttpServletRequest request, String key, Object value) {
        request.getSession().setAttribute(key, value);
    }
    // lấy thông tin session ra
    public Object getValue(HttpServletRequest request, String key) {
        return request.getSession().getAttribute(key);
    }
    // thoat khỏi hệ thống,remove session
    public void removeValue(HttpServletRequest request, String key) {
        request.getSession().removeAttribute(key);
    }
}