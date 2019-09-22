package ruslan.zhezlo.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private Double volume;
    private boolean abs;

    @OneToOne
    private Engine engine;

    @ManyToOne
    private Country country;

    @ManyToMany (mappedBy = "cars")
    private List<User> users;



    public Car(Long id, String name, Long price, Double volume, boolean abs) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", abs=" + abs +
                '}';
    }
}
