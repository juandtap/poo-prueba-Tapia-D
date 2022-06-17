/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ups.poo_prueba.Service;

import java.util.List;
import ups.poo_prueba.Model.Auto;

/**
 *
 * @author Diego
 */
public interface IAutoService {
    public Auto create(Auto auto);
    public List<Auto> list();
    
}
