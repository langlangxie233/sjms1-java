package com.test;

public class UserDAO {
    public static boolean findUser(String userName, String userPassword){
        if (DBUtil.getConnection())
        return true;
        else
        return false;
    }
}
