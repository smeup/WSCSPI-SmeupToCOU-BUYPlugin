
package it.cineca.u_gov.co.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per creaBuonoDetInDTO complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
     * Recupera il valore della proprietÓ annoFabbricazione.
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
     * Imposta il valore della proprietÓ annoFabbricazione.
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
     * Recupera il valore della proprietÓ cdAnnualitaFiscale.
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
     * Imposta il valore della proprietÓ cdAnnualitaFiscale.
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
     * Recupera il valore della proprietÓ cdAnnualitaOrdinaria.
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
     * Imposta il valore della proprietÓ cdAnnualitaOrdinaria.
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
     * Recupera il valore della proprietÓ cdCondizione.
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
     * Imposta il valore della proprietÓ cdCondizione.
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
     * Recupera il valore della proprietÓ cdConvenzione.
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
     * Imposta il valore della proprietÓ cdConvenzione.
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
     * Recupera il valore della proprietÓ cdImmobilizzazione.
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
     * Imposta il valore della proprietÓ cdImmobilizzazione.
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
     * Recupera il valore della proprietÓ cdSpazio.
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
     * Imposta il valore della proprietÓ cdSpazio.
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
     * Recupera il valore della proprietÓ cdUoRif.
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
     * Imposta il valore della proprietÓ cdUoRif.
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
     * Recupera il valore della proprietÓ cib.
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
     * Imposta il valore della proprietÓ cib.
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
     * Recupera il valore della proprietÓ dsBene.
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
     * Imposta il valore della proprietÓ dsBene.
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
     * Recupera il valore della proprietÓ dtFineGaranzia.
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
     * Imposta il valore della proprietÓ dtFineGaranzia.
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
     * Recupera il valore della proprietÓ dtIniAmmort.
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
     * Imposta il valore della proprietÓ dtIniAmmort.
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
     * Recupera il valore della proprietÓ dtInizioGaranzia.
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
     * Imposta il valore della proprietÓ dtInizioGaranzia.
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
     * Recupera il valore della proprietÓ dtUltimoInventarioFisico.
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
     * Imposta il valore della proprietÓ dtUltimoInventarioFisico.
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
     * Recupera il valore della proprietÓ flAccessorio.
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
     * Imposta il valore della proprietÓ flAccessorio.
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
     * Recupera il valore della proprietÓ flBeneStorico.
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
     * Imposta il valore della proprietÓ flBeneStorico.
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
     * Recupera il valore della proprietÓ flBeneUsato.
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
     * Imposta il valore della proprietÓ flBeneUsato.
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
     * Recupera il valore della proprietÓ flEsenzioneDoganale.
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
     * Imposta il valore della proprietÓ flEsenzioneDoganale.
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
     * Recupera il valore della proprietÓ idAbPossessore.
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
     * Imposta il valore della proprietÓ idAbPossessore.
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
     * Recupera il valore della proprietÓ idAbRespSpazio.
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
     * Imposta il valore della proprietÓ idAbRespSpazio.
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
     * Recupera il valore della proprietÓ idInventarioBenePrincipale.
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
     * Imposta il valore della proprietÓ idInventarioBenePrincipale.
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
     * Recupera il valore della proprietÓ idXInve.
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
     * Imposta il valore della proprietÓ idXInve.
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
     * Recupera il valore della proprietÓ idXInveBenePrincipale.
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
     * Imposta il valore della proprietÓ idXInveBenePrincipale.
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
     * Recupera il valore della proprietÓ locale.
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
     * Imposta il valore della proprietÓ locale.
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
     * Recupera il valore della proprietÓ marca.
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
     * Imposta il valore della proprietÓ marca.
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
     * Recupera il valore della proprietÓ note.
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
     * Imposta il valore della proprietÓ note.
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
     * Recupera il valore della proprietÓ nrRiga.
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
     * Imposta il valore della proprietÓ nrRiga.
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
     * Recupera il valore della proprietÓ nrRigaBenePrincipale.
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
     * Imposta il valore della proprietÓ nrRigaBenePrincipale.
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
     * Recupera il valore della proprietÓ nrRigaRef.
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
     * Imposta il valore della proprietÓ nrRigaRef.
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
     * Recupera il valore della proprietÓ nrRigaRefBenePrincipale.
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
     * Imposta il valore della proprietÓ nrRigaRefBenePrincipale.
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
     * Recupera il valore della proprietÓ numeroSeriale.
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
     * Imposta il valore della proprietÓ numeroSeriale.
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
     * Recupera il valore della proprietÓ pgBenePrincipale.
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
     * Imposta il valore della proprietÓ pgBenePrincipale.
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
     * Recupera il valore della proprietÓ pgBeneRif.
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
     * Imposta il valore della proprietÓ pgBeneRif.
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
     * Recupera il valore della proprietÓ pgBeneSubRif.
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
     * Imposta il valore della proprietÓ pgBeneSubRif.
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
     * Recupera il valore della proprietÓ targa.
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
     * Imposta il valore della proprietÓ targa.
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
     * Recupera il valore della proprietÓ valoreConvenzionale.
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
     * Imposta il valore della proprietÓ valoreConvenzionale.
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
