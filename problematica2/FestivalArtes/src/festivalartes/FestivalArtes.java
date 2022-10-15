/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package festivalartes;

import festivalartes.domain.Acto;
import festivalartes.domain.Empresa;
import festivalartes.domain.Supervisor;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author dmunoz
 */
public class FestivalArtes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=============Grupo Danny Muñoz - Galo=========");
        
        // TODO code application logic here
        Empresa empresa1 = new Empresa("1104285604001", "EMPRESA 1", "EMPRESA 1");
        Empresa empresa2 = new Empresa("1104285555001", "EMPRESA 2", "EMPRESA 2");
        
        Acto acto1 = new Acto("Danza", "San Sebastian", new Date(), 25.00, empresa1);
        Acto acto2 = new Acto("Grupo artístico", "San Sebastian", new Date(), 100.00, empresa2);
        
        Supervisor superevisor = new Supervisor("1104285604", "Danny", "Muñoz");
        superevisor.getActos().add(acto1);
        superevisor.getActos().add(acto2);
        
        
        System.out.println(superevisor);
        System.out.println("Número de actos: " + superevisor.getActos().size());
        System.out.println("-----Actos----");
        int i = 1;
        for (Iterator iterator = superevisor.getActos().iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(i + ". " + next);
            i++;
        }
        
        
        
        
    }
    
}
