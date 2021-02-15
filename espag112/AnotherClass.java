/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espag112;

/**
 *
 * @author aless
 */
public class AnotherClass extends ThreadClass{

    public AnotherClass(String name) {
    super(name);
    }
    
@Override
public void run (){
for(int i = 0;i<7;i++){
 System.out.print ((i+1)+"il numero"+name);   
}
        
}    
}
