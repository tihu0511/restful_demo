package org.jigang.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by wujigang on 16/7/4.
 */
@Component
public class TestInitialRun implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n\n======I'm strong.=======\n\n");
    }
}
