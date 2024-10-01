package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Tag")
@Table(name = "tag")
public record Tag(
        @Id
        String name
) {}
