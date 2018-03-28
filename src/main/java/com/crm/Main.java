package com.crm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = SecurityUtils.getSubject();
    }
}
