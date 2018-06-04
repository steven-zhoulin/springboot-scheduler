package com.springboot.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName EveryMinutesTask
 * @Description TODO
 * @auther steven.zhou
 * @date 2018/06/04 16:31
 */
@Component
public class EveryMinutesTask {

    private static final Logger LOG = LoggerFactory.getLogger(EveryMinutesTask.class);

    @Scheduled(cron = "0 * * * * *")
    public void cron() {
        LOG.info("EveryMinutesTask...");
    }

}
