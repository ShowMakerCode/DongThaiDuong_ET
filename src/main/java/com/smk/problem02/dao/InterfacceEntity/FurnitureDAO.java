package com.smk.problem02.dao.InterfacceEntity;

import com.smk.problem02.entity.Furniture;

import java.sql.ResultSet;

public interface FurnitureDAO {
    ResultSet findBySeri(Long seri);
}
