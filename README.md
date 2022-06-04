# Spring_yerim
[SpringBoot] REST API(CRUD), Naver api연동 맛집list 프로젝트 저장소입니다.

## 네이버 지역검색 API를 활용한 맛집 List 만들기

---

### 실행 방법
1. RestaurantApplication.java -> main run ▶️
2. http://localhost:8080/pages/main 접속

---

### 구현내용
- 네이버 검색 api(지역, 이미지)와 연동해 지역의 식당 정보를 불러온 후, 그 식당의 이미지 정보를 받아옴
<img width="880" alt="image" src="https://user-images.githubusercontent.com/93559998/172011445-14cc65a3-b331-47c5-9a9b-428c36d3133b.png">

- 검색한 맛집을 나의 맛집 리스트에 추가, 삭제하여 관리할 수 있음
- 방문 추가를 통해 방문 횟수를 체크할 수 있음
<img width="1004" alt="image" src="https://user-images.githubusercontent.com/93559998/172011164-b8bc8413-8d38-4402-8bc0-43394dfd8907.png">

---

### Memory CRUD DB 개발
- REST API로 구현
- http://localhost:8080/swagger-ui/ 에 접속하여 확인 가능

---

### 기술스택
**JAVA Springboot, Vue.js**
- 프론트는 간단한 부트스트랩을 사용하여 모바일 화면에서도 사용 가능

---

**보완 아이디어**
- 나의 맛집 리스트 추가/삭제 시 새로고침 되면 좋을 듯
- DB를 JPA 사용하는 방식으로 재구현해봐도 좋을 듯
