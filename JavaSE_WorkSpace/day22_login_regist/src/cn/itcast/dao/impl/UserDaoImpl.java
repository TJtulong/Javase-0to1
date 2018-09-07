package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * 这是用户操作的具体实现类（IO版）
 * 
 * @author TJtulong
 * @version V1.1
 */
public class UserDaoImpl implements UserDao {
	private static File file = new File("user.txt");

	// 静态代码块(代码运行即生成文件)
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("创建文件失败");
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		BufferedReader br = null;
		boolean flag = false;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] datas = line.split("=");
				if (datas[0].equals(username) && datas[1].equals(password)) {
					flag = true;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("找不到信息所在文件");
		} catch (IOException e) {
			System.out.println("用户登陆失败");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("用户登录释放资源失败");
				}
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		/*
		 * 自定义规则：用户名=密码
		 */
		BufferedWriter bw = null;
		try {
			// 为了保证数据是追加写入，必须加true
			bw = new BufferedWriter(new FileWriter(file, true));
			String s = user.getName() + "=" + user.getPassword();
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			System.out.println("用户注册失败");
			// e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("用户注册释放资源失败");
				}
			}
		}

	}

}
