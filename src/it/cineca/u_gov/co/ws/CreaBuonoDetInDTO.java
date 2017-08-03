
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creaBuonoDetInDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creaBuonoDetInDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoFabbricazione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cdAnnualitaFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdAnnualitaOrdinaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCondizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdConvenzione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdImmobilizzazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdSpazio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdUoRif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsBene" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFineGaranzia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtIniAmmort" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtInizioGaranzia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dtUltimoInventarioFisico" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flAccessorio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flBeneStorico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flBeneUsato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="flEsenzioneDoganale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idAbPossessore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idAbRespSpazio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idInventarioBenePrincipale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idXInve" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idXInveBenePrincipale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrRiga" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nrRigaBenePrincipale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nrRigaRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nrRigaRefBenePrincipale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numeroSeriale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgBenePrincipale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneRif" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pgBeneSubRif" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="targa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valoreConvenzionale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creaBuonoDetInDTO", propOrder = {
    "annoFabbricazione",
    "cdAnnualitaFiscale",
    "cdAnnualitaOrdinaria",
    "cdCondizione",
    "cdConvenzione",
    "cdImmobilizzazione",
    "cdSpazio",
    "cdUoRif",
    "cib",
    "dsBene",
    "dtFineGaranzia",
    "dtIniAmmort",
    "dtInizioGaranzia",
    "dtUltimoInventarioFisico",
    "flAccessorio",
    "flBeneStorico",
    "flBeneUsato",
    "flEsenzioneDoganale",
    "idAbPossessore",
    "idAbRespSpazio",
    "idInventarioBenePrincipale",
    "idXInve",
    "idXInveBenePrincipale",
    "locale",
    "marca",
    "note",
    "nrRiga",
    "nrRigaBenePrincipale",
    "nrRigaRef",
    "nrRigaRefBenePrincipale",
    "numeroSeriale",
    "pgBenePrincipale",
    "pgBeneRif",
    "pgBeneSubRif",
    "targa",
    "valoreConvenzionale"
})
public class CreaBuonoDetInDTO {

    protected Integer annoFabbricazione;
    protected String cdAnnualitaFiscale;
    protected String cdAnnualitaOrdinaria;
    protected String cdCondizione;
    protected String cdConvenzione;
    protected String cdImmobilizzazione;
    protected String cdSpazio;
    protected String cdUoRif;
    protected String cib;
    protected String dsBene;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFineGaranzia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtIniAmmort;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInizioGaranzia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtUltimoInventarioFisico;
    protected Boolean flAccessorio;
    protected Boolean flBeneStorico;
    protected Boolean flBeneUsato;
    protected Boolean flEsenzioneDoganale;
    protected Long idAbPossessore;
    protected Long idAbRespSpazio;
    protected Long idInventarioBenePrincipale;
    protected Long idXInve;
    protected Long idXInveBenePrincipale;
    protected String locale;
    protected String marca;
    protected String note;
    protected Long nrRiga;
    protected Long nrRigaBenePrincipale;
    protected Long nrRigaRef;
    protected Long nrRigaRefBenePrincipale;
    protected String numeroSeriale;
    protected Long pgBenePrincipale;
    protected Long pgBeneRif;
    protected Integer pgBeneSubRif;
    protected String targa;
    protected BigDecimal valoreConvenzionale;

    /**
     * Gets the value of the annoFabbricazione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnoFabbricazione() {
        return annoFabbricazione;
    }

    /**
     * Sets the value of the annoFabbricazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnoFabbricazione(Integer value) {
        this.annoFabbricazione = value;
    }

    /**
     * Gets the value of the cdAnnualitaFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAnnualitaFiscale() {
        return cdAnnualitaFiscale;
    }

    /**
     * Sets the value of the cdAnnualitaFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAnnualitaFiscale(String value) {
        this.cdAnnualitaFiscale = value;
    }

    /**
     * Gets the value of the cdAnnualitaOrdinaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAnnualitaOrdinaria() {
        return cdAnnualitaOrdinaria;
    }

    /**
     * Sets the value of the cdAnnualitaOrdinaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAnnualitaOrdinaria(String value) {
        this.cdAnnualitaOrdinaria = value;
    }

    /**
     * Gets the value of the cdCondizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCondizione() {
        return cdCondizione;
    }

    /**
     * Sets the value of the cdCondizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCondizione(String value) {
        this.cdCondizione = value;
    }

    /**
     * Gets the value of the cdConvenzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdConvenzione() {
        return cdConvenzione;
    }

    /**
     * Sets the value of the cdConvenzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdConvenzione(String value) {
        this.cdConvenzione = value;
    }

    /**
     * Gets the value of the cdImmobilizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdImmobilizzazione() {
        return cdImmobilizzazione;
    }

    /**
     * Sets the value of the cdImmobilizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdImmobilizzazione(String value) {
        this.cdImmobilizzazione = value;
    }

    /**
     * Gets the value of the cdSpazio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdSpazio() {
        return cdSpazio;
    }

    /**
     * Sets the value of the cdSpazio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdSpazio(String value) {
        this.cdSpazio = value;
    }

    /**
     * Gets the value of the cdUoRif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdUoRif() {
        return cdUoRif;
    }

    /**
     * Sets the value of the cdUoRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdUoRif(String value) {
        this.cdUoRif = value;
    }

    /**
     * Gets the value of the cib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCib() {
        return cib;
    }

    /**
     * Sets the value of the cib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCib(String value) {
        this.cib = value;
    }

    /**
     * Gets the value of the dsBene property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsBene() {
        return dsBene;
    }

    /**
     * Sets the value of the dsBene property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsBene(String value) {
        this.dsBene = value;
    }

    /**
     * Gets the value of the dtFineGaranzia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFineGaranzia() {
        return dtFineGaranzia;
    }

    /**
     * Sets the value of the dtFineGaranzia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFineGaranzia(XMLGregorianCalendar value) {
        this.dtFineGaranzia = value;
    }

    /**
     * Gets the value of the dtIniAmmort property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtIniAmmort() {
        return dtIniAmmort;
    }

    /**
     * Sets the value of the dtIniAmmort property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtIniAmmort(XMLGregorianCalendar value) {
        this.dtIniAmmort = value;
    }

    /**
     * Gets the value of the dtInizioGaranzia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtInizioGaranzia() {
        return dtInizioGaranzia;
    }

    /**
     * Sets the value of the dtInizioGaranzia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtInizioGaranzia(XMLGregorianCalendar value) {
        this.dtInizioGaranzia = value;
    }

    /**
     * Gets the value of the dtUltimoInventarioFisico property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtUltimoInventarioFisico() {
        return dtUltimoInventarioFisico;
    }

    /**
     * Sets the value of the dtUltimoInventarioFisico property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtUltimoInventarioFisico(XMLGregorianCalendar value) {
        this.dtUltimoInventarioFisico = value;
    }

    /**
     * Gets the value of the flAccessorio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlAccessorio() {
        return flAccessorio;
    }

    /**
     * Sets the value of the flAccessorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlAccessorio(Boolean value) {
        this.flAccessorio = value;
    }

    /**
     * Gets the value of the flBeneStorico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlBeneStorico() {
        return flBeneStorico;
    }

    /**
     * Sets the value of the flBeneStorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlBeneStorico(Boolean value) {
        this.flBeneStorico = value;
    }

    /**
     * Gets the value of the flBeneUsato property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlBeneUsato() {
        return flBeneUsato;
    }

    /**
     * Sets the value of the flBeneUsato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlBeneUsato(Boolean value) {
        this.flBeneUsato = value;
    }

    /**
     * Gets the value of the flEsenzioneDoganale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlEsenzioneDoganale() {
        return flEsenzioneDoganale;
    }

    /**
     * Sets the value of the flEsenzioneDoganale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlEsenzioneDoganale(Boolean value) {
        this.flEsenzioneDoganale = value;
    }

    /**
     * Gets the value of the idAbPossessore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbPossessore() {
        return idAbPossessore;
    }

    /**
     * Sets the value of the idAbPossessore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbPossessore(Long value) {
        this.idAbPossessore = value;
    }

    /**
     * Gets the value of the idAbRespSpazio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAbRespSpazio() {
        return idAbRespSpazio;
    }

    /**
     * Sets the value of the idAbRespSpazio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAbRespSpazio(Long value) {
        this.idAbRespSpazio = value;
    }

    /**
     * Gets the value of the idInventarioBenePrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdInventarioBenePrincipale() {
        return idInventarioBenePrincipale;
    }

    /**
     * Sets the value of the idInventarioBenePrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdInventarioBenePrincipale(Long value) {
        this.idInventarioBenePrincipale = value;
    }

    /**
     * Gets the value of the idXInve property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdXInve() {
        return idXInve;
    }

    /**
     * Sets the value of the idXInve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdXInve(Long value) {
        this.idXInve = value;
    }

    /**
     * Gets the value of the idXInveBenePrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdXInveBenePrincipale() {
        return idXInveBenePrincipale;
    }

    /**
     * Sets the value of the idXInveBenePrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdXInveBenePrincipale(Long value) {
        this.idXInveBenePrincipale = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the nrRiga property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrRiga() {
        return nrRiga;
    }

    /**
     * Sets the value of the nrRiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrRiga(Long value) {
        this.nrRiga = value;
    }

    /**
     * Gets the value of the nrRigaBenePrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrRigaBenePrincipale() {
        return nrRigaBenePrincipale;
    }

    /**
     * Sets the value of the nrRigaBenePrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrRigaBenePrincipale(Long value) {
        this.nrRigaBenePrincipale = value;
    }

    /**
     * Gets the value of the nrRigaRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrRigaRef() {
        return nrRigaRef;
    }

    /**
     * Sets the value of the nrRigaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrRigaRef(Long value) {
        this.nrRigaRef = value;
    }

    /**
     * Gets the value of the nrRigaRefBenePrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNrRigaRefBenePrincipale() {
        return nrRigaRefBenePrincipale;
    }

    /**
     * Sets the value of the nrRigaRefBenePrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNrRigaRefBenePrincipale(Long value) {
        this.nrRigaRefBenePrincipale = value;
    }

    /**
     * Gets the value of the numeroSeriale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSeriale() {
        return numeroSeriale;
    }

    /**
     * Sets the value of the numeroSeriale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSeriale(String value) {
        this.numeroSeriale = value;
    }

    /**
     * Gets the value of the pgBenePrincipale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBenePrincipale() {
        return pgBenePrincipale;
    }

    /**
     * Sets the value of the pgBenePrincipale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBenePrincipale(Long value) {
        this.pgBenePrincipale = value;
    }

    /**
     * Gets the value of the pgBeneRif property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPgBeneRif() {
        return pgBeneRif;
    }

    /**
     * Sets the value of the pgBeneRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPgBeneRif(Long value) {
        this.pgBeneRif = value;
    }

    /**
     * Gets the value of the pgBeneSubRif property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPgBeneSubRif() {
        return pgBeneSubRif;
    }

    /**
     * Sets the value of the pgBeneSubRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPgBeneSubRif(Integer value) {
        this.pgBeneSubRif = value;
    }

    /**
     * Gets the value of the targa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarga() {
        return targa;
    }

    /**
     * Sets the value of the targa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarga(String value) {
        this.targa = value;
    }

    /**
     * Gets the value of the valoreConvenzionale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoreConvenzionale() {
        return valoreConvenzionale;
    }

    /**
     * Sets the value of the valoreConvenzionale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoreConvenzionale(BigDecimal value) {
        this.valoreConvenzionale = value;
    }

}
