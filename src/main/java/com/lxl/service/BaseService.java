package com.lxl.service;

import com.lxl.dao.ReadOnlyRepository;
import com.lxl.dao.Repository;

import java.util.Collection;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 22:38
 * @version: V 1.0
 */
public abstract class BaseService<TE,T> extends ReadOnlyBaseService<TE,T>{
    private Repository<TE,T> repository;

    BaseService(Repository<TE, T> repository) {
        super(repository);
        this.repository = repository;
    }

    public void add(TE entity) throws Exception{
        this.repository.add(entity);
    }

    public Collection<TE> getAll(){
        return this.repository.getAll();
    }
}
