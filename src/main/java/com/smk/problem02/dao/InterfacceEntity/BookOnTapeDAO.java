package com.smk.problem02.dao.InterfacceEntity;

import com.smk.problem02.entity.BookOnTape;

import java.sql.ResultSet;

public interface BookOnTapeDAO {
    ResultSet findBySeri(Long seri);
}
