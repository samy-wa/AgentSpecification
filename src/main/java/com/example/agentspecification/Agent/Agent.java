package com.example.agentspecification.Agent;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table
public class Agent {
    @Id
    @SequenceGenerator(
            name = "agent_sequence",
            sequenceName = "agent_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "agent_sequence"
    )
    private Long id;
    @Column(unique=true)
    private String AgentNumber;
    private Title Title;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private Integer MobileNumber;
    private Integer Telephone;
    private String Email;
    private Integer HouseNumber;
    private String StreetName;
    private String Woreda;
    private String KifleKetema;
    private String City;

    private Region Region;
    private Integer TIN;
    private double VAT;
    private Rate Rate;
    private String Threshold;

    private String TBU;

    public Agent() {
    }

    public Agent(Long id) {
        this.id = id;
    }



    public Agent(Long id, String agentNumber, Title title, String firstName, String middleName, String lastName, Integer mobileNumber, Integer telephone, String email, Integer houseNumber, String streetName, String woreda, String kifleKetema, String city, Region region, Integer TIN, double VAT, Rate rate, String threshold, String TBU) {
        this.id = id;
        this.AgentNumber = agentNumber;
        this.Title = title;
        this.FirstName = firstName;
        this.MiddleName = middleName;
        this.LastName = lastName;
        this.MobileNumber = mobileNumber;
        this.Telephone = telephone;
        this.Email = email;
        this.HouseNumber = houseNumber;
        this.StreetName = streetName;
        this.Woreda = woreda;
        this.KifleKetema = kifleKetema;
        this.City = city;
        this.Region = region;
        this.TIN = TIN;
        this.VAT = VAT;
        this.Rate = rate;
        this.Threshold = threshold;
        this.TBU = TBU;
    }

    public Agent(String agentNumber, Title title, String firstName, String middleName, String lastName, Integer mobileNumber, Integer telephone, String email, Integer houseNumber, String streetName, String woreda, String kifleKetema, String city, Region region, Integer TIN, double VAT, Rate rate, String threshold, String TBU) {
        this.AgentNumber = agentNumber;
        this.Title = title;
        this.FirstName = firstName;
        this.MiddleName = middleName;
        this.LastName = lastName;
        this.MobileNumber = mobileNumber;
        this.Telephone = telephone;
        this.Email = email;
        this.HouseNumber = houseNumber;
        this.StreetName = streetName;
        this.Woreda = woreda;
        this.KifleKetema = kifleKetema;
        this.City = city;
        this.Region = region;
        this.TIN = TIN;
        this.VAT = VAT;
        this.Rate = rate;
        this.Threshold = threshold;
        this.TBU = TBU;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentNumber() {
        return AgentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.AgentNumber = agentNumber;
    }

    public Title getTitle() {
        return Title;
    }

    public void setTitle(Title title) {
        this.Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        this.MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public Integer getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.MobileNumber = mobileNumber;
    }

    public Integer getTelephone() {
        return Telephone;
    }

    public void setTelephone(Integer telephone) {
        this.Telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Integer getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.HouseNumber = houseNumber;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        this.StreetName = streetName;
    }

    public String getWoreda() {
        return Woreda;
    }

    public void setWoreda(String woreda) {
        this.Woreda = woreda;
    }

    public String getKifleKetema() {
        return KifleKetema;
    }

    public void setKifleKetema(String kifleKetema) {
        this.KifleKetema = kifleKetema;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public Region getRegion() {
        return Region;
    }

    public void setRegion(Region region) {
        this.Region = region;
    }

    public Integer getTIN() {
        return TIN;
    }

    public void setTIN(Integer TIN) {
        this.TIN = TIN;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public Rate getRate() {
        return Rate;
    }

    public void setRate(Rate rate) {
        this.Rate = rate;
    }

    public String getThreshold() {
        return Threshold;
    }

    public void setThreshold(String threshold) {
        this.Threshold = threshold;
    }

    public String getTBU() {
        return TBU;
    }

    public void setTBU(String TBU) {
        this.TBU = TBU;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", AgentNumber='" + AgentNumber + '\'' +
                ", Title='" + Title + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", Telephone=" + Telephone +
                ", Email='" + Email + '\'' +
                ", HouseNumber=" + HouseNumber +
                ", StreetName='" + StreetName + '\'' +
                ", Woreda='" + Woreda + '\'' +
                ", KifleKetema='" + KifleKetema + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", TIN=" + TIN +
                ", VAT=" + VAT +
                ", Rate=" + Rate +
                ", Threshold='" + Threshold + '\'' +
                ", TBU='" + TBU + '\'' +
                '}';
    }

    public enum Rate {
        Tier1, Tier2, Tier3,Tier4
    }

    public enum Title {
        Mr,Ms,Mrs,Miss,Dr,Other

    }

    public enum Region{
        Afar,
        Amhara,
        BenishangulGumuz,
        Gambela,
        Harari,
        Oromia,
        Sidama,
        Somali,
        South_West_Ethiopia_Peoples,
        Southern_Nations_Nationalities_and_Peoples,
        Tigray
        }

}

