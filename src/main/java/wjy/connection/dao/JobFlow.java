package wjy.connection.dao;

import org.apache.ibatis.annotations.Mapper;
import wjy.connection.model.Awake;

import java.util.List;

/**
 * @Author: blue.wjy@gmail.com
 * @Date: 2022/7/25 10:14 AM
 */
@Mapper
public interface JobFlow {
    List<Awake> getListByAwakeId(String id);

    void addList(List<Object> parameter);
}
