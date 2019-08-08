/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Docente
 */
@Entity
@Table(name = "paises", catalog = "jpaproyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paises.findAll", query = "SELECT p FROM Paises p")
    , @NamedQuery(name = "Paises.findByPId", query = "SELECT p FROM Paises p WHERE p.pId = :pId")
    , @NamedQuery(name = "Paises.findByPNombre", query = "SELECT p FROM Paises p WHERE p.pNombre = :pNombre")})
public class Paises implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "p_id")
    private Integer pId;
    @Basic(optional = false)
    @Column(name = "p_nombre")
    private String pNombre;

    public Paises() {
    }

    public Paises(Integer pId) {
        this.pId = pId;
    }

    public Paises(Integer pId, String pNombre) {
        this.pId = pId;
        this.pNombre = pNombre;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        Integer oldPId = this.pId;
        this.pId = pId;
        changeSupport.firePropertyChange("PId", oldPId, pId);
    }

    public String getPNombre() {
        return pNombre;
    }

    public void setPNombre(String pNombre) {
        String oldPNombre = this.pNombre;
        this.pNombre = pNombre;
        changeSupport.firePropertyChange("PNombre", oldPNombre, pNombre);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paises)) {
            return false;
        }
        Paises other = (Paises) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return pNombre;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
