/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import entiti.*;
import javax.ejb.EJB;
import modelo.AgenciasFacade;
/**
 *
 * @author V2014
 */
@Named (value = "AgenciaController")
@ManagedBean
@SessionScoped
public class AgenciaController implements Serializable {
    @EJB
    private AgenciasFacade agenciasFacade;
    private Agencias p=new Agencias();
    public AgenciaController() {
    }
    public List<Agencias> findAll(){
        return this.agenciasFacade.findAll();
    }
    
    
}
