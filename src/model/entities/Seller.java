
package model.entities;

import java.util.Date;

public class Seller {
        private String name;
        private int id;
        private String email;
        private Date birthDate;
        private double baseSalary;
        
        private Department dep;

    public Seller(int id ,String name, String email, Date birthDate, double baseSalary, Department dep) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seller other = (Seller) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Seller{" + "name=" + name + ", id=" + id + ", email=" + email + ", birthDate=" + birthDate + ", baseSalary=" + baseSalary + ", dep=" + dep + '}';
    }
        
    
        
}
