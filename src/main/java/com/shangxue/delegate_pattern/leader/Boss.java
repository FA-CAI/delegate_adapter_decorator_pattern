package com.shangxue.delegate_pattern.leader;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:24
 **/
public class Boss {
  //sb瞎写代码，完全没领会到委派模式的核心意思
   /* public static void command(String command,Leader leader){
        leader.doing(command);
    }*/

    public static void main(String[] args) {
       new Leader().doing("加密");
    }



}
