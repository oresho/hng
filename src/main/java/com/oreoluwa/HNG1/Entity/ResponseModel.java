package com.oreoluwa.HNG1.Entity;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class ResponseModel {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private Integer status_code;
}
