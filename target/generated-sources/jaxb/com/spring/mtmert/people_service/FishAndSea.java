//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.spring.mtmert.people_service;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FishAndSea complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FishAndSea">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="specieName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fishingMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fishPopulation" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         <element name="averageSize" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="overfishingRisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="waterTemperature" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="waterPollutionLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="season" type="{http://spring.com/mtmert/people-service}season"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishAndSea", propOrder = {
    "specieName",
    "region",
    "fishingMethod",
    "fishPopulation",
    "averageSize",
    "overfishingRisk",
    "waterTemperature",
    "waterPollutionLevel",
    "season"
})
public class FishAndSea {

    @XmlElement(required = true)
    protected String specieName;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(required = true)
    protected String fishingMethod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger fishPopulation;
    protected float averageSize;
    @XmlElement(required = true)
    protected String overfishingRisk;
    protected float waterTemperature;
    @XmlElement(required = true)
    protected String waterPollutionLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Season season;

    /**
     * Gets the value of the specieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecieName() {
        return specieName;
    }

    /**
     * Sets the value of the specieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecieName(String value) {
        this.specieName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the fishingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFishingMethod() {
        return fishingMethod;
    }

    /**
     * Sets the value of the fishingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFishingMethod(String value) {
        this.fishingMethod = value;
    }

    /**
     * Gets the value of the fishPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFishPopulation() {
        return fishPopulation;
    }

    /**
     * Sets the value of the fishPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFishPopulation(BigInteger value) {
        this.fishPopulation = value;
    }

    /**
     * Gets the value of the averageSize property.
     * 
     */
    public float getAverageSize() {
        return averageSize;
    }

    /**
     * Sets the value of the averageSize property.
     * 
     */
    public void setAverageSize(float value) {
        this.averageSize = value;
    }

    /**
     * Gets the value of the overfishingRisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverfishingRisk() {
        return overfishingRisk;
    }

    /**
     * Sets the value of the overfishingRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverfishingRisk(String value) {
        this.overfishingRisk = value;
    }

    /**
     * Gets the value of the waterTemperature property.
     * 
     */
    public float getWaterTemperature() {
        return waterTemperature;
    }

    /**
     * Sets the value of the waterTemperature property.
     * 
     */
    public void setWaterTemperature(float value) {
        this.waterTemperature = value;
    }

    /**
     * Gets the value of the waterPollutionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterPollutionLevel() {
        return waterPollutionLevel;
    }

    /**
     * Sets the value of the waterPollutionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterPollutionLevel(String value) {
        this.waterPollutionLevel = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeason(Season value) {
        this.season = value;
    }

}
