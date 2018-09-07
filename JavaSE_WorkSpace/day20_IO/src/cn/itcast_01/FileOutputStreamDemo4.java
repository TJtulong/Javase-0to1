package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 加入异常处理的字节输出流操作
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

		// 分开做异常处理
		/*
		 * try { FileOutputStream fos = new FileOutputStream("fos3.txt");
		 * fos.write("java".getBytes()); fos.close(); } catch (FileNotFoundException e)
		 * { e.printStackTrace(); }catch(IOException e) { e.printStackTrace(); }
		 */

		// 改进：为了保证close()一定执行，放入finally
		FileOutputStream fos = null; // 为了让finally中有fos
		try {
			fos = new FileOutputStream("fos3.txt");
			fos.write("java".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 如果fos不是null，才需要close()
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
