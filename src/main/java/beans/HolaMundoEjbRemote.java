package beans;

import javax.ejb.Remote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adseglocdom
 */
@Remote
public interface HolaMundoEjbRemote {
    
    public int sumar(int a, int b);
    
}
