package uz.pdp.spring_boot.services;

import uz.pdp.spring_boot.mapper.Mapper;
import uz.pdp.spring_boot.reposiroty.AbstractRepository;
import uz.pdp.spring_boot.utils.BaseUtils;

/**
 * @param <R> repository
 * @param <M>
 */
public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper> {
    protected final R repository;
    protected final M mapper;

    protected AbstractService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
}
