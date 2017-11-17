package com.basejava.stuty;

import java.io.File;
import java.io.IOException;

public class GetProjectDir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//利用system类获取项目路径
        System.out.println(System.getProperty("user.dir"));

        System.out.println("-------------------------------------");

        //利用file类获取项目路径
        File file = new File(".");
        System.out.println(file.getAbsolutePath()+"\n"+file.getCanonicalPath()+"\n"+file.getPath());
		
	}

}
