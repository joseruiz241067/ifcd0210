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
@Table(name = "ciudades", catalog = "jpaproyecto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ciudades.findAll", query = "SELECT c FROM Ciudades c")
    , @NamedQuery(name = "Ciudades.findByCId", query = "SELECT c FROM Ciudades c WHERE c.cId = :cId")
    , @NamedQuery(name = "Ciudades.findByCNombre", query = "SELECT c FROM Ciudades c WHERE c.cNombre = :cNombre")
    , @NamedQuery(name = "Ciudades.findByCHabitantes", query = "SELECT c FROM Ciudades c WHERE c.cHabitantes = :cHabitantes")
    , @NamedQuery(name = "Ciudades.findByPId", query = "SELECT c FROM Ciudades c WHERE c.pId = :pId")})
public class Ciudades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "c_id")
    private Integer cId;
    @Basic(optional = false)
    @Column(name = "c_nombre")
    private String cNombre;
    @Basic(optional = false)
    @Column(name = "c_habitantes")
    private int cHabitantes;
    @Basic(optional = false)
    @Column(name = "p_id")
    private int pId;

    public Ciudades() {
    }

    public Ciudades(Integer cId) {
        this.cId = cId;
    }

    public Ciudades(Integer cId, String cNombre, int cHabitantes, int pId) {
        this.cId = cId;
        this.cNombre = cNombre;
        this.cHabitantes = cHabitantes;
        this.pId = pId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        Integer oldCId = this.cId;
        this.cId = cId;
        changeSupport.firePropertyChange("CId", oldCId, cId);
    }

    public String getCNombre() {
        return cNombre;
    }

    public void setCNombre(String cNombre) {
        String oldCNombre = this.cNombre;
        this.cNombre = cNombre;
        changeSupport.firePropertyChange("CNombre", oldCNombre, cNombre);
    }

    public int getCHabitantes() {
        return cHabitantes;
    }

    public void setCHabitantes(int cHabitantes) {
        int oldCHabitantes = this.cHabitantes;
        this.cHabitantes = cHabitantes;
        changeSupport.firePropertyChange("CHabitantes", oldCHabitantes, cHabitantes);
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        int oldPId = this.pId;
        this.pId = pId;
        changeSupport.firePropertyChange("PId", oldPId, pId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cId != null ? cId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudades)) {
            return false;
        }
        Ciudades other = (Ciudades) object;
        if ((this.cId == null && other.cId != null) || (this.cId != null && !this.cId.equals(other.cId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vistas.Ciudades[ cId=" + cId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
