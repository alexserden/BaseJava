package com.basejava.stuty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 有100个瓶子，瓶子里面乘着水，其中有一个瓶子里面的水是有毒的。还有七只老鼠，老鼠喝了有毒的水，七天会死掉。
 * 现在给你七天的时间，然后让你用这七只老鼠将这些瓶子里面有毒的那个瓶子测试出来，怎么做？
 * */


/*
 老鼠有两种状态：1.喝了溶液。2.没有溶液。
那么一个老鼠可以测试一个瓶子的状态：喝完了死了表示有毒，没死表示没毒。那么两个老鼠呢？可以测试3个瓶子：
1号老鼠喝一个，2号老鼠喝一个，俩老鼠一起喝一个。1号自己死了，表示第一个瓶子有毒；2号老鼠自己死了，表示2号
瓶子有毒，哥俩一起死了表示3号瓶子有毒。以此类推，最后得出一个结论：七只老鼠总共可以测试2的7次方减1个瓶子，
也就是说127个瓶子。如果确定肯定有一个瓶子是有毒的，那么可以检测128个瓶子，因为可以留一个瓶子不给老鼠喝，
没有老鼠死就表示最后一个是有毒的。
*/

public class CalculatePoisonBottleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 七只老鼠 0代表活，1代表死
		   Integer y = 0;
		   Integer e = 0;
		   Integer s = 0;
		   Integer si = 0;
		   Integer w = 0;
		   Integer l = 0;
		   Integer q = 0;
		   // 随机出来一个有毒的瓶子
		   Random random = new Random();

		   Integer youdupingzi = random.nextInt(100) % 100;
		   // 100个瓶子
		   List<Pingzi> listpingziList = new ArrayList<Pingzi>();
		   for (int i = 0; i < 100; i++) {
		   Pingzi pingzi = new Pingzi(); // 生成瓶子
		   if (i == youdupingzi) { // 产生有毒的瓶子
		   pingzi.isYoudu = true;
		   System.out.println("向第" + youdupingzi + "号瓶子里面投毒");
		   }
		   listpingziList.add(pingzi);
		   }
		   // =========================得出有毒的瓶子
		  String silaoshuString = "";
		  int i = 1;
		  while (true) {
		  y++;
		  String chiyaolaoshu = "";
		  // 模拟给老鼠喂药
		  if (y == 2) {
		  e++;
		  y = 0;
		  if (e == 2) {
		  s++;
		  e = 0;
		  if (s == 2) {
		  si++;
		  s = 0;
		  if (si == 2) {
		  w++;
		  si = 0;
		  if (w == 2) {
		  l++;
		  w = 0;
		  if (l == 2) {
		  q++;
		  l = 0;
		  if (q == 2) {
		  getDuyaoping(silaoshuString); // 全部遍历完成以后，得出死老鼠都有哪些
		   return;
		       }
		      }
		     }
		    }
		   }
		  }
		 }
		 if (y == 1) {
		   if (chiyaolaoshu.length() < 1) {
		   chiyaolaoshu = "1号老鼠";
		    } else {
		     chiyaolaoshu += "  和1号老鼠";
		      }
		     }
		    if (e == 1) {
		    if (chiyaolaoshu.length() < 1) {
		    chiyaolaoshu += "2号老鼠";
		     } else {
		     chiyaolaoshu += "  和2号老鼠";
		      }
		     }
		     if (s == 1) {
		    if (chiyaolaoshu.length() < 1) {
		    chiyaolaoshu = "3号老鼠";
		      } else {
		     chiyaolaoshu += "  和3号老鼠";
		      }
		     }
		    if (si == 1) {
		    if (chiyaolaoshu.length() < 1) {
		     chiyaolaoshu = "4号老鼠";
		     } else {
		     chiyaolaoshu += "  和4号老鼠";
		      }
		    }
		    if (w == 1) {
		    if (chiyaolaoshu.length() < 1) {
		    chiyaolaoshu = "5号老鼠";
		     } else {
		     chiyaolaoshu += "  和5号老鼠";
		         }
		     }
		     if (l == 1) {
		     if (chiyaolaoshu.length() < 1) {
		     chiyaolaoshu = "6号老鼠";
		      } else {
		     chiyaolaoshu += "  和6号老鼠";
		        }
		       }
		     if (q == 1) {
		       if (chiyaolaoshu.length() < 1) {
		        chiyaolaoshu = "7号老鼠";
		          } else {
		            chiyaolaoshu += "  和7号老鼠";
		            }
		       }
		      if(i > 99){ // 7个老鼠测试100个瓶子有富余
		         System.out.println("所有瓶子都测试过了");
		       }else{
		     System.out.println("第" + i + "瓶子药喂给了第" + chiyaolaoshu);
		      if (listpingziList.get(i).isYoudu) { // 如果这瓶药有毒
		     System.out.println("============= 这瓶药有毒第" + chiyaolaoshu + "老鼠一星期后死亡！");
		    silaoshuString = q.toString() + l.toString() + w.toString() + si.toString() + s.toString()
		    + e.toString() + y.toString(); // 得到一星期后的死亡老鼠编号
		           }
		          }
		             i++; // 下一瓶药测试
		         }
		     }

		     private static void getDuyaoping(String silaoshuString) {

		         String duyao = Integer.valueOf(silaoshuString, 2).toString();
		         System.out.println("经老鼠检测，有毒的瓶子为：" + duyao);
		     }

		     public static class Pingzi {
		         public boolean isYoudu = false;
		     }
}
