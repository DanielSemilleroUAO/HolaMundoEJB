/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

/**
 *
 * @author adseglocdom
 */
public class TestHolaMundoEJB {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEjb = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjb.sumar(1, 3);
            System.out.println(resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
