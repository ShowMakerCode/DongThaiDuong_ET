package com.smk.problem02.dao.ImpEntity;

import com.smk.problem02.dao.DAO;
import com.smk.problem02.dao.InterfacceEntity.VideoDAO;
import com.smk.problem02.entity.Video;

import java.sql.ResultSet;

public class VideoIplm extends DAO<Video> implements VideoDAO {

    @Override
    public ResultSet findBySeri(Long seri) {
        return super.findBySeri(Video.class, seri);
    }
}
