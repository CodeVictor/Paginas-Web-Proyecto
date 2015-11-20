/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import entiti.Agencias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author V2014
 */
@Stateless
public class AgenciasFacade extends AbstractFacade<Agencias> {
    @PersistenceContext(unitName = "ProyectoPaginasWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgenciasFacade() {
        super(Agencias.class);
    }
    
}
