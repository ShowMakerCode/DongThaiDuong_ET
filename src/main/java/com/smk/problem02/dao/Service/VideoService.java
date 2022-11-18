package com.smk.problem02.dao.Service;

import com.smk.problem02.dao.ImpEntity.VideoIplm;
import com.smk.problem02.dao.InterfacceEntity.VideoDAO;
import com.smk.problem02.entity.Video;

import java.sql.ResultSet;

public class VideoService {
    VideoDAO videoService = new VideoIplm();

    public Video FindBySeri(Long seri) {
        try {
            ResultSet resultSet = videoService.findBySeri(seri);
            if (resultSet.next()) {
                Video video = new Video(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(3), resultSet.getInt(4), resultSet.getLong(5));
                return video;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
