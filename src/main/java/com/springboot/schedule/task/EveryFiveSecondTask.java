package com.springboot.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName EveryFiveSecondTask
 * @Description TODO
 * @auther steven.zhou
 * @date 2018/06/04 16:32
 */
@Component
public class EveryFiveSecondTask {

    private static final Logger LOG = LoggerFactory.getLogger(EveryFiveSecondTask.class);

    @Scheduled(cron = "*/5 * * * * *")
    public void cron() {
        LOG.warn("EveryFiveSecondTask...");

    }

}
