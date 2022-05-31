package com.grp4.houseship.house.controller;

import com.grp4.houseship.house.model.AdvancedSearchModel;
import com.grp4.houseship.house.model.HouseInfo;
import com.grp4.houseship.house.model.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RoomSearchController {

    @Autowired
    private HouseService houseService;

    @GetMapping(path = "/checkAvailable/{date1}/{date2}/{houseNo}")
    @ResponseBody
    public HouseInfo searchByDate(@PathVariable("date1") String date1, @PathVariable("date2") String date2, @PathVariable("houseNo") int houseNo) {

        HouseInfo houseInfo = houseService.findByDateAndHouseNo(date1, date2, houseNo);
        return houseInfo;
    }

}
