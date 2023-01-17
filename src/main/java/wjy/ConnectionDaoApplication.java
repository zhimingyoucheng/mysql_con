package wjy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author WangJingYu
 * @create 2019-12-27 09:58
 */
@MapperScan(basePackages = {"com.wjy.connection.dao"})
@SpringBootApplication
public class ConnectionDaoApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConnectionDaoApplication.class, args);
    }
}
