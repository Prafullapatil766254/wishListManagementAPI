package com.example.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Pattern(regexp = "^\\w+@gmail\\.com$") // email must end with @gmail.com
    private String email;

    private String username;

    @NotBlank
    private String password;

    @Pattern(regexp = "^\\d{10}$") // mobile no must be 10 digits
    private String mobileNumber;

}
