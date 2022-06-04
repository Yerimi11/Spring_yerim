# Spring_yerim
[SpringBoot] REST API(CRUD), Naver api연동 맛집list 프로젝트 저장소입니다.

## 네이버 지역검색 API를 활용한 맛집 List 만들기

### 실행 방법
1. RestaurantApplication.java -> main run ▶️
2. http://localhost:8080/pages/main 접속

### 구현내용
- 네이버 검색 api(지역, 이미지)와 연동해 지역의 식당 정보를 불러온 후, 그 식당의 이미지 정보를 받아옴
- 검색한 맛집을 나의 맛집 리스트에 추가, 삭제하여 관리할 수 있음
- 방문 추가를 통해 방문 횟수를 체크할 수 있음
<img width="736" alt="image" src="https://user-images.githubusercontent.com/93559998/172011100-9d2c5082-9655-4732-ae9c-fbe182b64c7b.png">
<img width="1004" alt="image" src="https://user-images.githubusercontent.com/93559998/172011164-b8bc8413-8d38-4402-8bc0-43394dfd8907.png">


### Memory CRUD DB 개발
- REST API로 구현
- http://localhost:8080/swagger-ui/ 에 접속하여 확인 가능


### 기술스택
**JAVA Springboot, Vue.js**

### 보완 아이디어
- 나의 맛집 리스트 추가/삭제 시 새로고침 되면 좋을 듯
- DB를 JPA 사용하는 방식으로 재구현해봐도 좋을 듯
