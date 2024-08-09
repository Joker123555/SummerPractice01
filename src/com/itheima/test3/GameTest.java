package com.itheima.test3;

public class GameTest {
    public static void main(String[] args) {
        Role role1=new Role("李锦",100,'女');
        Role role0 =new Role("韩珂欣",100,'女');

        //显示角色信息
        role0.showRoleInfo(role0.getGender());
        role1.showRoleInfo(role1.getGender());

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
