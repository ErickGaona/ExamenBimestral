/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
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
 * @author Erick Gaona
 */
@Entity
@Table(name = "vehiculos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculos.findAll", query = "SELECT v FROM Vehiculos v")
    , @NamedQuery(name = "Vehiculos.findByIdvehiculo", query = "SELECT v FROM Vehiculos v WHERE v.idvehiculo = :idvehiculo")
    , @NamedQuery(name = "Vehiculos.findByPasajeros", query = "SELECT v FROM Vehiculos v WHERE v.pasajeros = :pasajeros")
    , @NamedQuery(name = "Vehiculos.findByA\u00f1o", query = "SELECT v FROM Vehiculos v WHERE v.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Vehiculos.findByMarca", query = "SELECT v FROM Vehiculos v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculos.findByFabricacion", query = "SELECT v FROM Vehiculos v WHERE v.fabricacion = :fabricacion")
    , @NamedQuery(name = "Vehiculos.findByCilindraje", query = "SELECT v FROM Vehiculos v WHERE v.cilindraje = :cilindraje")
    , @NamedQuery(name = "Vehiculos.findByPlaca", query = "SELECT v FROM Vehiculos v WHERE v.placa = :placa")
    , @NamedQuery(name = "Vehiculos.findByConcesionario", query = "SELECT v FROM Vehiculos v WHERE v.concesionario = :concesionario")})
public class Vehiculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idvehiculo")
    private String idvehiculo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pasajeros")
    private String pasajeros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "a\u00f1o")
    private String año;
    @Size(max = 45)
    @Column(name = "marca")
    private String marca;
    @Size(max = 45)
    @Column(name = "fabricacion")
    private String fabricacion;
    @Size(max = 45)
    @Column(name = "cilindraje")
    private String cilindraje;
    @Size(max = 45)
    @Column(name = "placa")
    private String placa;
    @Size(max = 45)
    @Column(name = "concesionario")
    private String concesionario;

    public Vehiculos() {
    }

    public Vehiculos(String idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public Vehiculos(String idvehiculo, String pasajeros, String año) {
        this.idvehiculo = idvehiculo;
        this.pasajeros = pasajeros;
        this.año = año;
    }

    public String getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(String idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(String concesionario) {
        this.concesionario = concesionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvehiculo != null ? idvehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculos)) {
            return false;
        }
        Vehiculos other = (Vehiculos) object;
        if ((this.idvehiculo == null && other.idvehiculo != null) || (this.idvehiculo != null && !this.idvehiculo.equals(other.idvehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Vehiculos[ idvehiculo=" + idvehiculo + " ]";
    }
    
}
