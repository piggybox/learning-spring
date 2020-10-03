package feelingspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Ingredient {

    @Id
    @GeneratedValue()
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;
}