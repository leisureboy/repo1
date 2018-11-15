package cn.dzy.service.impl;

import cn.dzy.dao.MavenDao;
import cn.dzy.domain.Account;
import cn.dzy.service.MavenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MavenServiceImpl implements MavenService {
    @Autowired
    MavenDao mavenDao;
    public Account findbyid(int id) {
		//ojbk?????
        return mavenDao.findbyid(id);
    }



}
