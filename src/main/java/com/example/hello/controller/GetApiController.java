package com.example.hello.controller;
import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")    // http://localhost:9090/api/get/hello
    public String hello(){
        return "get Hello";
    }

    // 예전 방식. method 방식을 설정해주지 않으면 get, post, put, delete 모두 받음
    @RequestMapping(path = "/hi", method = RequestMethod.GET)  // get http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : "+name); // 인텔리제이 콘솔 창 출력
        return name;
    }


    // ****************************
    // Query Parameter 를 받는 3가지 방법
    // http://localhost:9090/api/get/query-param?user=yerim&email=yerimi11@gmail.com&age=20
    // 1) Mapping                              // ?부터가 query-param
    @GetMapping(path = "query-param")        // key=value 의 형태를 가지고 있고, key=value 는 &로 이어붙임
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder(); // Map 자체를 return 하면 값이 없기 때문에 버퍼에 담아준다.

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });

        return sb.toString();
    }


    // 2) 변수로 받기
    // Map으로 받을 땐 어떤 값이 들어올지 모르지만, 변수로 받으면 명시적
    @GetMapping("query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name+", "+email+", "+age);
        return name+", "+email+", "+age;
    }


    // 3) DTO 형태로 매핑 (현업 많이 사용)
        // 객체를 만들어서 Query Parameter 가 바로 매핑되도록 함
    // -> DTO 패키지에 getter setter 생성함!
    @GetMapping("query-param3")
    public String queryParam3(UserRequest userRequest){ // 객체로 만듦->스프링부트에서 경로로 가서 변수와 이름매칭
                            // 여기선 @RequestParam 어노테이션 붙이지 않음

        System.out.println(userRequest.getName()+", "+userRequest.getEmail()+", "+userRequest.getAge());

        return userRequest.toString(); // UserRequest.java 에 toString override 함
    }
}
