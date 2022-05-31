package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity

    // PageController 에서 ResponseBody 를 통해 내려주면,
    // html 리소스로 찾는게 아니라 ResponseBody 어노테이션을 통해 json 객체로 내려줄 수 있다.
    // 보통은 페이지 컨트롤러에서는 따로 ResponseBody 를 안내리고,
    // Api 는 ApiController 를 만들어 RestController 를 붙이고 정의 후 서비스.
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        // User user = new User();
        var user = new User(); // Java 11 ver.
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
