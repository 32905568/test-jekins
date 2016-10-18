package demo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import mybatis.pagination.Pagination;

import org.springframework.stereotype.Service;

import demo.entity.User;
import demo.mapper.UserMapper;
import demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource(name = "userMapper")
	UserMapper userMapper;

	@Override
	public List<User> getUserList(Pagination pagination,
			Map<String, Object> conditions) {
		// TODO conditions 演示就不处理了
		return userMapper.selectListByPagination(pagination, conditions);
	}

	@Override
	public User getUserById( Long id ) {
		return userMapper.selectById(id);
	}

}
