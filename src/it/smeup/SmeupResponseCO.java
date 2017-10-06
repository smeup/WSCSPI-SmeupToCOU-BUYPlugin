package it.smeup;

public class SmeupResponseCO {

	// Codice errore ritorno negativo errore nei parametri invio positivo errore da remoto zero tutto ok 
	protected String code;
	// testo dell'errore breve
	protected String text;
	// Stack trace dell'errore
	protected String stackTrace;
	// Tipologia del messaggio info/alert/warning/error
	protected String type;
	// Sotto tipo del messaggio system/file system/application/format data
	protected String subType;
	// Dove può essere la causa/origine del messaggio: Smeup/WebService destinazione/Provider
	protected String origin;
	// Testo dell'errore da sistema remoto
	protected String technicalText;
	
	public SmeupResponseCO() {
		this.setCode(SmeupToUBUY.RETCODEOK);
		this.setType(SmeupToUBUY.TypeValue.OK.name());
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getText() {
		if (text==null || text.trim().length()<=0) {
			text = SmeupToUBUY.EMPTY;	
		} 
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	public void setText(Exception e) {
		if (e.getMessage()==null) {
			this.setText(e.toString());
		} else {
			this.setText(e.getMessage());
		}
	}

	public String getTechnicalText() {
		if (technicalText==null || technicalText.trim().length()<=0) {
			technicalText = SmeupToUBUY.EMPTY;	
		} 
		return technicalText;
	}


	public void setTechnicalText(String externalText) {
		this.technicalText = externalText;
	}	

	public boolean isError() {
		if (this.code!=SmeupToUBUY.RETCODEOK) {
			return true;
		} else {
			return false;
		}
	}


	public String getStackTrace() {
		if (stackTrace==null || stackTrace.trim().length()<=0) {
			stackTrace= SmeupToUBUY.EMPTY;
		}
		return stackTrace;
	}


	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}


	public String getType() {
		if (type==null || type.trim().length()<=0) {
			type= SmeupToUBUY.EMPTY;
		}
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSubType() {
		if (subType==null || subType.trim().length()<=0) {
			subType= SmeupToUBUY.EMPTY;
		}
		return subType;
	}


	public void setSubType(String subType) {
		this.subType = subType;
	}


	public String getOrigin() {
		if (origin==null || origin.trim().length()<=0) {
			origin= SmeupToUBUY.EMPTY;
		}
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
