package com.smk.problem02.dao.Service;

import com.smk.problem02.dao.ImpEntity.BookOnTapeIplm;
import com.smk.problem02.dao.InterfacceEntity.BookOnTapeDAO;
import com.smk.problem02.entity.BookOnTape;

import java.sql.ResultSet;

public class BookOnTapeService {
    BookOnTapeDAO bookOnTapeService = new BookOnTapeIplm();

    public BookOnTape findBySeri(Long seri) {
        try {
            ResultSet resultSet = bookOnTapeService.findBySeri(seri);
            if (resultSet.next()){
                BookOnTape bookOnTape = new BookOnTape(resultSet.getInt(1),resultSet.getString(2),resultSet.getFloat(3),resultSet.getInt(4),resultSet.getLong(5));
                return bookOnTape;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
