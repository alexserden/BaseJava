package com.basejava.filestuty;

import java.io.File;
import java.io.IOException;

public class ReNameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("HelloFile.txt");
		
		//判断文件是否存在
				if (file.exists()) {
					
					
					//判断是否是文件并输出
					System.out.println(file.isFile());
					//判断是否是路径并输出
					System.out.println(file.isDirectory());
					
					//文件结构必须处于同一分区当中
					//文件处于不同分区，需要使用文件的拷贝，而不是 重命名
					File newfile = new File("new HelloFile.txt");
					
					//文件重命名
					file.renameTo(newfile);
					System.out.println("文件重命名或者移动成功！");
					
					
				} else {
					System.out.println("文件不存在！");
					//文件不存在则创建文件
					try {
						file.createNewFile();
						System.out.println("文件已被创建！");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("文件创建失败！");
					}
					
				}
		
	}

}
