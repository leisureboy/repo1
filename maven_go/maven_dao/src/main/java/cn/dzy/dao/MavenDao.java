package cn.dzy.dao;
//hehe
import cn.dzy.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//测试冲突
public interface MavenDao {
    @Select("select * from account where id = #{id}")
    Account findbyid(int id);
    //test
    List<Account> findAll();
    //ojbk？
    void update();

}
