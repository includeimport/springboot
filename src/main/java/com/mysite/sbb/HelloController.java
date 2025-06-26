package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * Controller -> 서버에 전달된 클라이언트의 요청을 처리하는 자바 클래스.
 */

// @Controller 애너테이션은 클래스가 컨트롤러의 기능을 수행하겠다는 의미.
// 해당 애너테이션이 있어야 스프링부트가 컨트롤러로 인식.
@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}