package com.ideal.arrangement.design.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建者     ideal
 * 创建时间   2019/1/9 17:07
 * 描述	     公司类
 * 更新描述   $$$$
 */
public class Company {
    private List<Staff> allStaffs=new ArrayList<>();
    public void addStaff(Staff per){
        allStaffs.add(per);
    }
    public void ShowAllStaqffs(){
        for (Staff per:allStaffs){
            System.out.println("Obj:"+per.toString());
        }
    }
}
