package com.lxl.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 餐馆 聚合器
 * @author: lxl
 * @date: 2018/1/16 22:16
 * @version: V 1.0
 */
public class Restaurant extends BasicEntity<String> {
    private List<Table> tables = new ArrayList();

    public Restaurant(String name, String id, List<Table> tables) {
        super(id, name);
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }


}
