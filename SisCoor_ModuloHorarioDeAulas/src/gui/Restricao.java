/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

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
 * @author Diego
 */
@Entity
@Table(name = "restricao", catalog = "siscoor", schema = "")
@NamedQueries({
    @NamedQuery(name = "Restricao.findAll", query = "SELECT r FROM Restricao r"),
    @NamedQuery(name = "Restricao.findByCod", query = "SELECT r FROM Restricao r WHERE r.cod = :cod"),
    @NamedQuery(name = "Restricao.findByDia", query = "SELECT r FROM Restricao r WHERE r.dia = :dia"),
    @NamedQuery(name = "Restricao.findByTurno", query = "SELECT r FROM Restricao r WHERE r.turno = :turno"),
    @NamedQuery(name = "Restricao.findByCodProf", query = "SELECT r FROM Restricao r WHERE r.codProf = :codProf")})
public class Restricao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod")
    private Integer cod;
    @Column(name = "dia")
    private String dia;
    @Column(name = "turno")
    private String turno;
    @Column(name = "codProf")
    private Integer codProf;

    public Restricao() {
    }

    public Restricao(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        Integer oldCod = this.cod;
        this.cod = cod;
        changeSupport.firePropertyChange("cod", oldCod, cod);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        String oldTurno = this.turno;
        this.turno = turno;
        changeSupport.firePropertyChange("turno", oldTurno, turno);
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        Integer oldCodProf = this.codProf;
        this.codProf = codProf;
        changeSupport.firePropertyChange("codProf", oldCodProf, codProf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod != null ? cod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restricao)) {
            return false;
        }
        Restricao other = (Restricao) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Restricao[ cod=" + cod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
