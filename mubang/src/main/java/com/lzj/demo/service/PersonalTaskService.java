package com.lzj.demo.service;

import com.lzj.demo.entity.PersonalTask;
import com.lzj.demo.entity.User;

import java.util.List;


public interface PersonalTaskService {
    List<PersonalTask> queryPersonalTask();
    List<PersonalTask> queryPersonalTaskByUID(String UID);
    void rollroutinePersonalTask();
    void rollweekPersonalTask();
    boolean insertPersonalTask(PersonalTask personalTask);
    boolean updatePersonalTask(PersonalTask personalTask);
    boolean deletePersonalTask(String UID,String taskName);
    void insertweekPersonalTask(User user);
    void insertroutinePersonalTask(User user);
}
