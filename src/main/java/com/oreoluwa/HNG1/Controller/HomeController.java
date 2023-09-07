package com.oreoluwa.HNG1.Controller;

import com.oreoluwa.HNG1.Entity.ResponseModel;
import com.oreoluwa.HNG1.Service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class HomeController {
    private final HomeService homeService;
    @GetMapping()
    public ResponseEntity get(@RequestParam String slack_name,
                              @RequestParam String track){
        ResponseModel responseModel = homeService.process(slack_name,track);
        return new ResponseEntity(responseModel,HttpStatus.OK);
    }
}
