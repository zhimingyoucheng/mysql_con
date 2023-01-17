package wjy.connection.dao;

import org.apache.ibatis.annotations.Mapper;
import wjy.connection.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author WangJingYu
 * @create 2019-12-27 10:17
 */
@Mapper
public interface UserMapper {

    void addAndGet(User user);

    List<Map<String, String>> getEmployee();

    Map selectWithResult(HashMap map);

    void deleteOldDate(String id);

    int updateData(HashMap<String, Integer> map);

    void alterRmg();
}
