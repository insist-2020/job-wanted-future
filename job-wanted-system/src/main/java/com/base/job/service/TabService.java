package com.base.job.service;

import com.base.job.model.Tab;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TabService {

    List<Tab> selectTabAll();


}
