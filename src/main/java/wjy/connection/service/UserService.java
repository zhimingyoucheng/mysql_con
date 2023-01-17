package wjy.connection.service;


import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import wjy.connection.dao.JobFlow;
import wjy.connection.dao.UserMapper;
import wjy.connection.model.Awake;
import wjy.connection.model.Rmg;
import wjy.connection.model.User;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author WangJingYu
 * @create 2019-12-27 13:25
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private JobFlow jobFlowMapper;

    //@Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED)
    public void addAndGet() {
        int i = 0;
        User user = new User();
        while (true) {
            //useServerPrepStmts=true&cachePrepStmts=true&
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                user.setAge(i++);
                user.setName("wjy" + i);
                userMapper.addAndGet(user);
                System.out.println(sdf.format(new Date()) + " : " + user.toString());
                user.setAge(i++);
                user.setName("zy" + i);
                userMapper.addAndGet(user);
                System.out.println(sdf.format(new Date()) + " : " + user.toString());

            } catch (Exception e) {
                System.out.printf("ss", e.getMessage());
            }

        }
    }

    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED)
    public void addRmg() {
        Rmg rmg = new Rmg();
        while (true) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String s = UUID.randomUUID().toString().replace("-", "");
                //rmg.setCert_no();
                userMapper.alterRmg();

            } catch (Exception e) {

            }

        }
    }


    @Transactional(rollbackFor = RuntimeException.class, isolation = Isolation.READ_COMMITTED)
    public void control() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("key", 1500);
        map.put("value", 1500);
        int value = userMapper.updateData(map);

        System.out.println(value);
    }


    public void addAwake(Awake awake) {
        if (StringUtils.isNotBlank(awake.getId()) && "1".equals(awake.getId())) {
            userMapper.deleteOldDate(awake.getId());
        }
        List<Awake> awakeList = jobFlowMapper.getListByAwakeId(awake.getId());
        List<Object> parameter = new ArrayList<Object>();
        for (Awake a : awakeList) {
            /*组装数据 , 伪代码*/
            parameter.add(new Object());
        }
        jobFlowMapper.addList(parameter);
    }
}
