package com.keiba.api.service;

import com.keiba.api.domain.RaceScheduleList;
import com.keiba.api.domain.RaceSelector;
import com.keiba.api.repository.RaceScheduleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RaceScheduleServiceImpl implements RaceScheduleService {

    private static final Logger logger = LoggerFactory.getLogger(RaceScheduleServiceImpl.class);

    private final RaceScheduleRepository raceScheduleRepository;

    public RaceScheduleServiceImpl(RaceScheduleRepository raceScheduleRepository) {
        this.raceScheduleRepository = raceScheduleRepository;
    }

    @Override
    public RaceScheduleList find(RaceSelector selector) {
        RaceScheduleList raceScheduleList = new RaceScheduleList();
        raceScheduleList.setRaceSchedules(raceScheduleRepository.find(selector));
        return raceScheduleList;
    }
}
