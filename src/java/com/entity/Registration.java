/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fred
 */
@Entity
@Table(name = "registration", catalog = "sacco", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r"),
    @NamedQuery(name = "Registration.findById", query = "SELECT r FROM Registration r WHERE r.id = :id"),
    @NamedQuery(name = "Registration.findByFirstName", query = "SELECT r FROM Registration r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "Registration.findBySecondName", query = "SELECT r FROM Registration r WHERE r.secondName = :secondName"),
    @NamedQuery(name = "Registration.findByLastName", query = "SELECT r FROM Registration r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "Registration.findByPassportNo", query = "SELECT r FROM Registration r WHERE r.passportNo = :passportNo"),
    @NamedQuery(name = "Registration.findByDob", query = "SELECT r FROM Registration r WHERE r.dob = :dob"),
    @NamedQuery(name = "Registration.findByEmailAddress", query = "SELECT r FROM Registration r WHERE r.emailAddress = :emailAddress"),
    @NamedQuery(name = "Registration.findByPhoneNo", query = "SELECT r FROM Registration r WHERE r.phoneNo = :phoneNo"),
    @NamedQuery(name = "Registration.findByPoBox", query = "SELECT r FROM Registration r WHERE r.poBox = :poBox"),
    @NamedQuery(name = "Registration.findByLoginId", query = "SELECT r FROM Registration r WHERE r.loginId = :loginId")})
public class Registration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "second_name")
    private String secondName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "passport_no")
    private String passportNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "dob")
    private String dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email_address")
    private String emailAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phone_no")
    private int phoneNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "po_box")
    private String poBox;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "gender")
    private String gender;
    
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @OneToOne
    @JoinColumn(name = "login_id")
    private String loginId ;

    public Registration() {
    }

    public Registration(Integer id) {
        this.id = id;
    }

    public Registration(Integer id, String firstName, String secondName, String lastName, String passportNo, String dob, String emailAddress, int phoneNo, String poBox, String gender, String loginId) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.passportNo = passportNo;
        this.dob = dob;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.poBox = poBox;
        this.gender = gender;
        this.loginId = loginId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Registration[ id=" + id + " ]";
    }
    
}
