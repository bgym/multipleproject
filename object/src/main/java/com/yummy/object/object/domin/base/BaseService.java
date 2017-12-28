package com.yummy.object.object.domin.base;

import com.yummy.object.object.domin.Order;

import java.util.List;
import java.util.UUID;

public interface BaseService <T extends BaseModel>{

    void delete(String id);
    T queryById(String id);
    List<T> queryAll();
    T save(T t);

    default void idEnsure(T a) {
        if (a.getId() == null) {
            a.setId(UUID.randomUUID().toString().replace("-", ""));
        }

    }
}
