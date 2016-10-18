package demo.service;

import java.util.List;
import java.util.Map;

import mybatis.pagination.Pagination;
import demo.entity.User;

public interface UserService {
	
	List<User> getUserList(Pagination pagination, Map<String, Object> conditions);

	User getUserById( Long id );
}
