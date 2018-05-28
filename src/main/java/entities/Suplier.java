package entities;

import javax.persistence.*;

@NamedQueries({

        @NamedQuery(name = "Suplier.getAll", query = "select s from Suplier s"),
        @NamedQuery(name = "Suplier.getById", query = "select s from Suplier s where s.id=:id")

})

@Entity
public class Suplier {

    private Integer id;
    private String companyName;
    private String name;
    private String surname;
    private Integer vaTnumber;
    private String iRoffice;
    private String zipCode;
    private String city;
    private String country;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyName", nullable = false, length = 45)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname", nullable = false, length = 45)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "VATnumber", nullable = false)
    public Integer getVaTnumber() {
        return vaTnumber;
    }

    public void setVaTnumber(Integer vaTnumber) {
        this.vaTnumber = vaTnumber;
    }

    @Basic
    @Column(name = "IRoffice", nullable = false, length = 45)
    public String getiRoffice() {
        return iRoffice;
    }

    public void setiRoffice(String iRoffice) {
        this.iRoffice = iRoffice;
    }

    @Basic
    @Column(name = "ZipCode", nullable = false, length = 45)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Suplier suplier = (Suplier) o;

        if (id != null ? !id.equals(suplier.id) : suplier.id != null) return false;
        if (companyName != null ? !companyName.equals(suplier.companyName) : suplier.companyName != null) return false;
        if (name != null ? !name.equals(suplier.name) : suplier.name != null) return false;
        if (surname != null ? !surname.equals(suplier.surname) : suplier.surname != null) return false;
        if (vaTnumber != null ? !vaTnumber.equals(suplier.vaTnumber) : suplier.vaTnumber != null) return false;
        if (iRoffice != null ? !iRoffice.equals(suplier.iRoffice) : suplier.iRoffice != null) return false;
        if (zipCode != null ? !zipCode.equals(suplier.zipCode) : suplier.zipCode != null) return false;
        if (city != null ? !city.equals(suplier.city) : suplier.city != null) return false;
        if (country != null ? !country.equals(suplier.country) : suplier.country != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (vaTnumber != null ? vaTnumber.hashCode() : 0);
        result = 31 * result + (iRoffice != null ? iRoffice.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
