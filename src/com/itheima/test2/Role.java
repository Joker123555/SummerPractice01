package com.itheima.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //定义攻击方法
    public void attack(Role role) {
        //伤害值1-20随机值
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //定义剩余血量
        int remainBlood = role.getBlood()-hurt;
        //对血量进行判断
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName() + "举起拳头打了" + role.getName()
                + "一下，造成了" + hurt + "点伤害，" + role.getName() + "还剩下"+remainBlood+"点血。");
    }
}
