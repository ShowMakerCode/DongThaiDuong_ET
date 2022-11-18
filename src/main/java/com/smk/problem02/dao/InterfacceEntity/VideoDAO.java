package com.smk.problem02.dao.InterfacceEntity;

import com.smk.problem02.entity.Video;

import java.sql.ResultSet;

public interface VideoDAO {
    ResultSet findBySeri(Long seri);
}
