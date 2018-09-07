package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����쳣������ֽ����������
 */
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
		/*
		 * FileOutputStream fos=null; try { fos = new FileOutputStream("fos3.txt"); }
		 * catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * try { fos.write("java".getBytes()); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { fos.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		// �ֿ����쳣����
		/*
		 * try { FileOutputStream fos = new FileOutputStream("fos3.txt");
		 * fos.write("java".getBytes()); fos.close(); } catch (FileNotFoundException e)
		 * { e.printStackTrace(); }catch(IOException e) { e.printStackTrace(); }
		 */

		// �Ľ���Ϊ�˱�֤close()һ��ִ�У�����finally
		FileOutputStream fos = null; // Ϊ����finally����fos
		try {
			fos = new FileOutputStream("fos3.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ���fos����null������Ҫclose()
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
