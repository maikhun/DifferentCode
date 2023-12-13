package mb.java.testingapachekafka.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Инфо о человеке
 */
@Data
@Table(name = "person")
public class Person {

    /**
     * Имя
     */
    @Column(name = "name")
    private String name;

    /**
     * Адрес
     */
    @Column(name = "address")
    private String address;

    /**
     * Возраст
     */
    @Column(name = "age")
    private Short age;
}
