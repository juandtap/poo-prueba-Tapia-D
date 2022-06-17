/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Controller;

import java.util.List;
import ups.poo_prueba.Model.Auto;
import ups.poo_prueba.Service.AutoService;

/**
 *
 * @author Diego
 */
public class AutoController {
    
    private final AutoService autoService = new AutoService();
    
    public Auto create(String[] args){
        
        var auto = new Auto(args[0],args[1],args[2], args[3], args[4]);
        return autoService.create(auto);
    }
    
    public List<Auto> list(){
        return autoService.list();
    }
}
