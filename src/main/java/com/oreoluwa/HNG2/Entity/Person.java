package com.oreoluwa.HNG2.Entity;

import com.oreoluwa.HNG2.CustomValidators.ValidEmail;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name should contain only letters")
    private String name;
    @Min(value = 0, message = "Age must be at least 0")
    @Max(value = 150, message = "Age must be less than or equal to 150")
    private Integer age;
    @ValidEmail(message = "Please enter a valid email, in the format (example@xyz.com)")
    @NotBlank(message = "Email is required")
    private String email;
}
