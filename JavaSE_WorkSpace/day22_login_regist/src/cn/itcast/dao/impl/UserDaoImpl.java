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
 * �����û������ľ���ʵ���ࣨIO�棩
 * 
 * @author TJtulong
 * @version V1.1
 */
public class UserDaoImpl implements UserDao {
	private static File file = new File("user.txt");

	// ��̬�����(�������м������ļ�)
	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");
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
			System.out.println("�Ҳ�����Ϣ�����ļ�");
		} catch (IOException e) {
			System.out.println("�û���½ʧ��");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("�û���¼�ͷ���Դʧ��");
				}
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		/*
		 * �Զ�������û���=����
		 */
		BufferedWriter bw = null;
		try {
			// Ϊ�˱�֤������׷��д�룬�����true
			bw = new BufferedWriter(new FileWriter(file, true));
			String s = user.getName() + "=" + user.getPassword();
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			System.out.println("�û�ע��ʧ��");
			// e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("�û�ע���ͷ���Դʧ��");
				}
			}
		}

	}

}
