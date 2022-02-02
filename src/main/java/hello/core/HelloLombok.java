package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok h = new HelloLombok();
        h.setName("asdasd");

        String name = h.getName();
        System.out.println("name = " + name);
        System.out.println("h = " + h);
    }
}
