package com.example.post.controller;

import com.example.post.controller.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // Map 형태로 받기
//    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData){
//
//        requestData.forEach((key, value) -> {
//            System.out.println("key : " + key);
//            System.out.println("value : " + value);
//        });
//    }


    // Dto 형태로 받기
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);

        // 특정 변수 데이터 가져올 때
//        requestData.getAccount();
    }
}
