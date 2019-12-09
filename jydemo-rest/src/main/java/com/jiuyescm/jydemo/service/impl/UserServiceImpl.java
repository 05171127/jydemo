package com.jiuyescm.jydemo.service.impl;

import com.jiuyescm.jydemo.entity.UserAddressEntity;
import com.jiuyescm.jydemo.entity.UserEntity;
import com.jiuyescm.jydemo.mapper.UserAddressMapper;
import com.jiuyescm.jydemo.mapper.UserMapper;
import com.jiuyescm.jydemo.service.UserService;
import com.jiuyescm.jydemo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    /**
     * @Author Ryan shipeipei
     * @Description 添加用户
     * @Date 17:02 2019/12/9
     * @Param [userVo]
     * @return com.jiuyescm.jydemo.vo.UserVo
     **/
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public UserVo addUser(UserVo userVo) throws Exception{
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userVo.getUsername());
        userMapper.addUser(userEntity);
        int i = 3/0; //运行时异常 默认回滚
        UserAddressEntity userAddressEntity = new  UserAddressEntity();
        userAddressEntity.setUserId(userEntity.getId());
        userAddressEntity.setAddress(userVo.getAddress());
        userAddressMapper.addUserAddress(userAddressEntity);
        userVo.setId(userEntity.getId());
        return userVo;
    }
}
