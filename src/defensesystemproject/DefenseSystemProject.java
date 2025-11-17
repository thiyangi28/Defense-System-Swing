/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystemproject;

import java.util.ArrayList;

interface DefenceUnitInterface{
    
    public void updateButtons();
    public void getMsgMain(String msg);
    public void areaClear(boolean clear);
    public void setPosition(int position);
    
}

class DefenceUnitSystem implements DefenceUnitInterface{
        int position;
        
 private final ArrayList<DefenseUnit>observerList=new ArrayList<>();
    public void addDefenseUnit(DefenseUnit ob){
        observerList.add(ob);
    }
    
 @Override
    public void updateButtons() {
        //TODO
    }

    @Override
    public void getMsgMain(String msg) {
        for (DefenseUnit ob : observerList){
            ob.getMsgMain(msg);
        }
    }

    @Override
    public void areaClear(boolean clear) {
        for (DefenseUnit ob : observerList){
            ob.areaClearlabel(clear);
        }
    }

    @Override
    public void setPosition(int position) {
        if (this.position!=position){
            this.position = position;
            notifyDefence();     
    }
  }
    public void notifyDefence(){
        for (DefenseUnit ob : observerList){
            ob.update(position);
            updateButtons();
        }
    }
}
 
   
public class DefenseSystemProject {

    public static void main(String[] args) {
        
    
        DefenceUnitSystem defenceUnitSystem=new DefenceUnitSystem();
        
        defenceUnitSystem.addDefenseUnit(new Helicopter());
        defenceUnitSystem.addDefenseUnit(new Tank());
        defenceUnitSystem.addDefenseUnit(new Submarine());

        
        new MainController(defenceUnitSystem).setVisible(true); // TODO code application logic here
    }
    
}
