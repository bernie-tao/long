package com.tao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tao.mapper.SybMapper;
import com.tao.pojo.Syb;
import com.tao.service.SybService;

@Service
public class SybServiceImpl implements SybService {
@Autowired
SybMapper sybMapper;

@Override
public Syb login(Syb syb) {
	// TODO Auto-generated method stub
	return sybMapper.selectone(syb);
}

@Override
public int updid(Syb syb) {
	// TODO Auto-generated method stub
	return sybMapper.upd(syb);
} 
	


}
