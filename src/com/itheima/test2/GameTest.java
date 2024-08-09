package com.itheima.test2;

public class GameTest {
    public static void main(String[] args) {
        Role role1=new Role("李锦",100);
        Role role0 =new Role("韩珂欣",100);

        //进行回合制攻击
        while (true){
            role1.attack(role0);
            //如果1把0 打死了
            if (role0.getBlood() == 0) {
                System.out.println(role1.getName()+"K.O了"+role0.getName());
                break;
            }

            role0.attack(role1);
            //如果0把1打死了
            if (role1.getBlood() == 0) {
                System.out.println(role0.getName()+"K.O了"+role1.getName());
                break;
            }

        }

    }
}
