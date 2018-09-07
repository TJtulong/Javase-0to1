package cn.itcast.pojo;

/**
 * 这是用户基本描述类
 * 
 * @author TJtulong
 * @version V1.1
 */
public class User {
	// 用户名
	private String Name;
	// 密码
	private String Password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
