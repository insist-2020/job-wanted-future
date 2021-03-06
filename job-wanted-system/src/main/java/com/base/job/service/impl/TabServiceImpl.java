package com.base.job.service.impl;

import com.base.job.dao.TabMapper;
import com.base.job.model.Tab;
import com.base.job.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabServiceImpl implements TabService {

    @Autowired
    TabMapper tabMapper;

    @Override
    public List<Tab> selectTabAll() {
        return tabMapper.selectTabAll();
    }
}
