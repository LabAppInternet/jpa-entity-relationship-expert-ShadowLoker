package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity(name = "UserLab")
@Table(name = "user_lab")
public record UserLab(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id,

        @Column(
                nullable = false,
                unique = true
        )
        String username,

        @Email
        @Column(
                nullable = false,
                unique = true
        )
        String email
) {}
