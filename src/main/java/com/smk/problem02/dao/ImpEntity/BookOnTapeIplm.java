package com.smk.problem02.dao.ImpEntity;

import com.smk.problem02.dao.DAO;
import com.smk.problem02.dao.InterfacceEntity.BookOnTapeDAO;
import com.smk.problem02.entity.BookOnTape;

import java.sql.ResultSet;

public class BookOnTapeIplm extends DAO<BookOnTape> implements BookOnTapeDAO {

    @Override
    public ResultSet findBySeri(Long seri) {
        return super.findBySeri(BookOnTape.class, seri);
    }
}
