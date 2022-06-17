/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.poo_prueba.Service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import ups.poo_prueba.Model.Auto;

/**
 *
 * @author Diego
 */
public class AutoService implements IAutoService{

    public static final List<Auto> autoList = new ArrayList<>();
    
    @Override
    public Auto create(Auto auto) {
        autoList.add(auto);
        return auto;
    }

    @Override
    public List<Auto> list() {
        return autoList;
    }
    
}
