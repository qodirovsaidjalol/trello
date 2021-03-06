package uz.pdp.spring_boot.entity.user;

import lombok.Getter;
import lombok.Setter;
import uz.pdp.spring_boot.entity.Auditable;
import uz.pdp.spring_boot.entity.organization.Organization;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class AuthUser extends Auditable {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String email;

    private String image;

    private boolean isSuperAdmin = false;

    private String lang;

    private boolean isActive = true;

    private boolean isBlocked = false;
    @ManyToOne
    private Organization organization;

    private Language language;

    private Role role;

}
