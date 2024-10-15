package com.celyn.reactive.student;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name= "student")
public class Student {

    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;

}

