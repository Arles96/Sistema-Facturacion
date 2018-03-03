/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Arles Cerrato
 */
public abstract class  Model {
    
    public abstract void insert(Object [] array);
    
    public abstract void update(Object[] array);
    
    public abstract void delete(Object[] array);
    
    public void connection(){
        
    }
    
    public void desconnect (){
        
    }
    
}
