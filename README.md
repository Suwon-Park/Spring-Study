# Spring-Study

##Basic
## ⛳ 스텝 1

1. 개발환경 구축
- [x]  Spring Boot 프로젝트를 생성해주세요 (Spring Boot 버전, Java 버전, 빌드툴은 자유롭게 선택해주세요) - 3.1.1/17/Gradle - Groovy
- [x]  다음의 Dependency를 추가해주세요
    - [x]  Spring Boot Starter Web
    - [x]  H2 database
    - [x]  Spring Data JPA
- [x]  Spring Boot 어플리케이션의 포트번호를 8090으로 변경해주세요
1. `src/main/resources/static` 경로에 hello.html을 생성하고, 웹브라우저에서 `http://localhost:8090/hello` 경로로 접근했을때 hello.html을 보여주게하는 Controller 클래스 및 메소드를 작성하세요 -
2. 웹브라우저에서 `http://localhost:8090/hi?name=suwon` 경로로 접근했을때 화면에 `hi suwon` 문자열(response body)을 보여주게 하는 컨트롤러 메소드를 작성하세요 - API 방식
3. `name`과 `age` 를 필드로 가지는 `Person` 클래스를 정의하고 웹 브라우저에서 `http://localhost:8090/person?name=suwon&age=25` 경로로 접근했을때 아래와 같은 json 문자열을 리턴하도록 하는 컨트롤러 메소드를 작성하세요 - API 방식
