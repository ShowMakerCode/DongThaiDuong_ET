package com.smk.problem02.dao.ImpEntity;

import com.smk.problem02.dao.DAO;
import com.smk.problem02.dao.InterfacceEntity.FurnitureDAO;
import com.smk.problem02.entity.Furniture;

import java.sql.ResultSet;

public class FurnitureIplm extends DAO<Furniture> implements FurnitureDAO {

    @Override
    public ResultSet findBySeri(Long seri) {
        return super.findBySeri(Furniture.class, seri);
    }
}
