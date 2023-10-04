package BTJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonName {
    public static void main(String[] args) {
        // Tạo danh sách các đối tượng Person
        List<Person> people = Arrays.asList(
                new Person("John"),
                new Person("Alice"),
                new Person("Bob"),
                new Person("Eve")
        );

        // Sử dụng Stream API để chuyển đổi danh sách Person thành danh sách tên
        List<String> names = people.stream()
                .map(Person::getName) // Sử dụng method reference để lấy tên từ mỗi đối tượng Person
                .collect(Collectors.toList()); // Thu thập kết quả vào danh sách

        // In danh sách tên
        names.forEach(System.out::println);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}





