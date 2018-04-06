/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Models.ClientModel;
import Models.UserModel;

/**
 *
 * @author Dario
 */
public class test {
    public static void main(String[] args){
        UserModel c = new UserModel();
        c.insert(new User("2","7","6","4","5"));
        System.out.println((c.getView()).size());
        for (Object object : c.getView()) {
            System.out.println((User)object);
        }
    }
}
