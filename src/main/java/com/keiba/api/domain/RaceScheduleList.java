package com.keiba.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * RaceScheduleのリストを表すドメインオブジェクト。
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RaceScheduleList {
    private List<RaceSchedule> raceSchedules;

    public List<RaceSchedule> getRaceSchedules() {
        return raceSchedules;
    }

    public void setRaceSchedules(List<RaceSchedule> raceSchedules) {
        this.raceSchedules = raceSchedules;
    }
}
