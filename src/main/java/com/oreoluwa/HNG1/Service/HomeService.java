package com.oreoluwa.HNG1.Service;

import com.oreoluwa.HNG1.Entity.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class HomeService {
    private final String file_url = "https://github.com/oresho/hng/blob/stage1/src/main/java/com/oreoluwa/HNG1/Controller/HomeController.java";
    private final String repo_url = "https://github.com/oresho/hng";
    public ResponseModel process(String slack_name, String track){
        ResponseModel responseModel = ResponseModel.builder()
                .slack_name(slack_name)
                .current_day(getDay())
                .utc_time(getTimeUTC())
                .track(track)
                .github_file_url(file_url)
                .github_repo_url(repo_url)
                .status_code(HttpStatus.OK.value())
                .build();
        return responseModel;
    }

    public String getDay(){
        LocalDate date = LocalDate.now();
        DayOfWeek today = date.getDayOfWeek();
        return today.toString();
    }

    public String getTimeUTC(){
        Instant now = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);
        return formatter.format(now);
    }
}
