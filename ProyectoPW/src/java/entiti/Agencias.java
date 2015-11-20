/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entiti;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author V2014
 */
@Entity
@Table(name = "AGENCIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agencias.findAll", query = "SELECT a FROM Agencias a"),
    @NamedQuery(name = "Agencias.findByCodigo", query = "SELECT a FROM Agencias a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Agencias.findByNombre", query = "SELECT a FROM Agencias a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Agencias.findByDireccion", query = "SELECT a FROM Agencias a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Agencias.findByDepartamento", query = "SELECT a FROM Agencias a WHERE a.departamento = :departamento"),
    @NamedQuery(name = "Agencias.findByTelefono", query = "SELECT a FROM Agencias a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Agencias.findByNoEmpleados", query = "SELECT a FROM Agencias a WHERE a.noEmpleados = :noEmpleados"),
    @NamedQuery(name = "Agencias.findByAdministrador", query = "SELECT a FROM Agencias a WHERE a.administrador = :administrador")})
public class Agencias implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private BigDecimal codigo;
    @Size(max = 12)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 20)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 12)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    @Column(name = "NO_EMPLEADOS")
    private BigInteger noEmpleados;
    @Column(name = "ADMINISTRADOR")
    private BigInteger administrador;

    public Agencias() {
    }

    public Agencias(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getCodigo() {
        return codigo;
    }

    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public BigInteger getNoEmpleados() {
        return noEmpleados;
    }

    public void setNoEmpleados(BigInteger noEmpleados) {
        this.noEmpleados = noEmpleados;
    }

    public BigInteger getAdministrador() {
        return administrador;
    }

    public void setAdministrador(BigInteger administrador) {
        this.administrador = administrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agencias)) {
            return false;
        }
        Agencias other = (Agencias) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entiti.Agencias[ codigo=" + codigo + " ]";
    }
    
}
