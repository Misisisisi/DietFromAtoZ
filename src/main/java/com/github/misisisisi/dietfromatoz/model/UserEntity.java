package com.github.misisisisi.dietfromatoz.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Set;

@Entity
@Table(name="users")
@Getter @Setter @ToString (exclude = "password") @EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor @Builder
public class UserEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 20)
    private String username;
    @Column(nullable = false)
    private String password;
    @Email
    @Column(nullable = false, unique = true, length = 30)
    private String email;

    private String firstName;

    private String lastName;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;

    @OneToOne (mappedBy = "user")
    private PersonDataEntity person;

    public UserEntity(String username, String password, Set<GrantedAuthority> grantedAuthoritySet) {
    }
}
