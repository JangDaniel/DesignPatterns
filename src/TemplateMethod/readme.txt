구현하려는 알고리즘이 일정한 프로세스가 있다.
구현하려는 알고리즘이 변경 가능성 있다.

==========

1. 알고리즘을 여러 단계로 나눈다.
    => 보안과정 -> 인증과정 -> 권한과정 -> 접속과정
2. 나눠진 알고리즘의 단계를 메서드로 선언한다.
    => 보안과정 : doSecurity(String str): String
    => 인증과정 : authentication(String id, String password) : boolean
    => 권한과정 : authorization(String userName): int
    => 접속과정 : connection(String info) : String
3. 알고리즘을 수행 할 템플릿 메소드로 만든다.
    => requestConnection(String str): String
4. 하위 클래스에서 나눠진 메소드를 구현한다.
