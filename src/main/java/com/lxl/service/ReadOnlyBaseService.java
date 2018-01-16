package com.lxl.service;

import com.lxl.dao.Repository;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/16 22:37
 * @version: V 1.0
 */
public abstract class ReadOnlyBaseService<TE,T> {
    private Repository<TE,T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
