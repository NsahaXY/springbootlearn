package com.telusko.demo.dao;
/*
 * @Author Arsene
 */

import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
