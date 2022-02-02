package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    // 자바가 실행될 때 하나가 생성돼서 올라간다

    public static SingletonService getInstance() {
        // 외부에서 인스턴스를 호출하는 유일한 방법, 항상 같은 인스턴스를 반환함
        return instance;
    }

    private SingletonService() {
        // 외부에서 생성하는 것을 막는 목적
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출출");    }
}
