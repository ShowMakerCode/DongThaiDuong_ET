package com.smk.problem02.dao.Service;

import com.smk.problem02.dao.ImpEntity.FurnitureIplm;
import com.smk.problem02.dao.InterfacceEntity.FurnitureDAO;
import com.smk.problem02.entity.Furniture;

import java.sql.ResultSet;

public class FurnitureService {
    FurnitureDAO furnitureService = new FurnitureIplm();

    public Furniture findBySeri(Long seri) {
        try {
            ResultSet resultSet = furnitureService.findBySeri(seri);
            if (resultSet.next()){
                Furniture furniture = new Furniture(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3),resultSet.getInt(4),resultSet.getLong(5));
                return furniture;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
