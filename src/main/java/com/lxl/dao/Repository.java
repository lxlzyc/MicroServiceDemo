package com.lxl.dao;

/**
 * @Description: 提供额外操作的抽象
 * @author: lxl
 * @date: 2018/1/16 22:24
 * @version: V 1.0
 */
public interface Repository<TE,T> extends ReadOnlyRepository<TE,T> {
    void add(TE entity);
    void remove(T id);
    void update(TE entity);

}
