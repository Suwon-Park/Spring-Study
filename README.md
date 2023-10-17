# Spring-Study

## Basic
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

## ⛳ 스텝 2

1. 첨부된 자료를 참고하여 POST - [`http://localhost:8090/people`](http://localhost:8090/people) 요청시 다음과 같은 json 문자열을 리턴하도록 하는 컨트롤러 메소드를 작성하세요

```jsx
{
    "job": "developer",
    "age": 26,
    "name": "minHyeok"
}
```

1. `age` , `name` , `id` 를 필드로 가지는 `Member` Entity를 만드세요 (id는 자동으로 증가하는 숫자값),

자료의 POST - [`http://localhost:8090/](http://localhost:8090/)member` 요청을 실행하면 해당 요청을 기반으로 Member를 H2 database에 insert 하는 컨트롤러 메소드를 작성하세요 반환값은 void입니다.

1. 자료의 GET - [`http://localhost:8090/member/1`](http://localhost:8090/member/1) 요청을 실행하면  id값이 1인 Member객체를 json 문자열로 리턴하도록 하는 컨트롤러 메소드를 작성하세요 (id 변경가능)
2. 자료의 PATCH - [`http://localhost:8090/member/1`](http://localhost:8090/member) 요청을 실행하면 id값이 1인 Member 객체의 name을 주어진 name으로 변경하는 컨트롤러 메소드를 작성하세요 (id 변경가능)
3. 자료의 DELETE - `http://localhost:8090/member/1` 요청을 실행하면 id 값이 1인 Member 객체를 데이터베이스에서 삭제하는 컨트롤러 메소드를 작성하세요 (id 변경가능)
4. 자료의 GET - [`http://localhost:8090/member/1`](http://localhost:8090/member/1) 요청시 데이터베이스에 id값이 1인 객체가 없을경우 404에러를 발생시키세요
