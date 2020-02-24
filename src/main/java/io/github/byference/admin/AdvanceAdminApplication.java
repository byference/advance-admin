package io.github.byference.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author byference
 * @since 2019-11-01
 */
@MapperScan("io.github.byference.admin.modules.*.mapper")
@SpringBootApplication
public class AdvanceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvanceAdminApplication.class, args);
    }

}
