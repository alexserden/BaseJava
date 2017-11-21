package com.basejava.filestuty;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("new HelloFile.txt");
		
		//判断文件是否存在
				if (file.exists()) {
					
					
					//判断是否是文件并输出
					System.out.println(file.isFile());
					//判断是否是路径并输出
					System.out.println(file.isDirectory());
					
					//文件存在，则删除文件
					file.delete();
					System.out.println("文件已删除！");
					
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
