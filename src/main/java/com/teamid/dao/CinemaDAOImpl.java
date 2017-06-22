package com.teamid.dao;

import com.teamid.entity.Cinema;
import com.teamid.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Skye on 2017/6/3.
 */

@Repository
public class CinemaDAOImpl implements CinemaDAO {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<Cinema> findAllCinemas() {
        return cinemaRepository.findAll(new Sort(new Sort.Order(Sort.Direction.DESC, "rank")));
    }

    @Override
    public Cinema findCinemaById(long cinemaId) {
        return cinemaRepository.findOne(cinemaId);
    }
}
