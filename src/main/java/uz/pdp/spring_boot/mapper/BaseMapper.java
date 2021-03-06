package uz.pdp.spring_boot.mapper;

import java.util.List;

/**
 * @param <E>  -> Entity
 * @param <D>  -> Dto
 * @param <CD> -> Create Dto
 * @param <UD> -> Update Dto
 */

public interface BaseMapper<E, D, CD, UD> extends Mapper {

    List<D> toDto(List<E> e);

    D toDto(E e);

    List<E> fromDto(List<D> e);

    E fromCreateDto(CD cd);

    E fromUpdateDto(UD ud);

}
