package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity(name = "Permission")
@Table(name = "permission")
public record Permission(
        @ManyToOne(
                fetch = FetchType.LAZY
        )
        @Id
        @JoinColumn(name = "user_id")
        UserLab owner,

        @ManyToOne(
                fetch = FetchType.LAZY
        )
        @Id
        Note note,

        @Column(nullable = false)
        boolean canRead,

        @Column(nullable = false)
        boolean canEdit
) {}
