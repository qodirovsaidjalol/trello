package uz.pdp.spring_boot.dto.auth;

import lombok.*;
import uz.pdp.spring_boot.dto.GenericDto;
import uz.pdp.spring_boot.entity.rele.Role;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserDto extends GenericDto {
    private String username;
    private String password;
    private String email;
    private String image;
    private boolean isBlocked;
    private Role role;
    private Long organizationId;

    @Builder(builderMethodName = "childBuilder")
    public AuthUserDto(Long id, String username, String password, String email, Role role, Long organizationId) {
        super(id);
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.organizationId = organizationId;
    }
}
