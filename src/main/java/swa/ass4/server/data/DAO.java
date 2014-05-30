package swa.ass4.server.data;

import java.util.List;

import swa.ass4.domain.User;

public interface DAO {
	public List<User> getUsers();
	public User getUser(String userName);
	public void addUser(User user);
	public void updateUser(String userName, User user);
	public void deleteUser(String userName);
}
