package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    // http://localhost:8080/api/delete/1004?account=user100
                        // PathVariable -> userId : 1004
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);

    // delete : 리소스 삭제 => 이미 리소스가 없는 상태여도 200 OK (멱등성)
    }
}
