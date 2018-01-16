package com.lxl.dao;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;

/**
 * @Description: 提供只读操作的抽象
 * @author: lxl
 * @date: 2018/1/16 22:19
 * @version: V 1.0
 */
public interface ReadOnlyRepository<TE,T> {
    boolean contains(T id);
    Entity get(T id);
    Collection<TE> getAll();

}
