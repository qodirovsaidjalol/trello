package uz.pdp.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.pdp.spring_boot.dto.auth.AuthUserCreateDto;
import uz.pdp.spring_boot.dto.auth.AuthUserDto;
import uz.pdp.spring_boot.dto.auth.AuthUserUpdateDto;
import uz.pdp.spring_boot.entity.user.AuthUser;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthUserMapper extends BaseMapper<AuthUser, AuthUserDto, AuthUserCreateDto, AuthUserUpdateDto> {

    @Override
    List<AuthUserDto> toDto(List<AuthUser> e);

    @Override
    AuthUserDto toDto(AuthUser authUser);

    @Override
    @Mapping(target = "image", ignore = true)
    AuthUser fromCreateDto(AuthUserCreateDto authUserCreateDto);

    @Override
    @Mapping(target = "image", ignore = true)
    AuthUser fromUpdateDto(AuthUserUpdateDto authUpdateDto);
}
