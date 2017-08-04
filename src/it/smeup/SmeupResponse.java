package it.smeup;

public class SmeupResponse {

	// Codice errore ritorno negativo errore nei parametri invio positivo errore da remoto zero tutto ok 
	protected int code;
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
	// Codice di ritorno da sistema remoto
	protected boolean externalResult;
	// Testo dell'errore da sistema remoto
	protected String externalText;
	
	public SmeupResponse() {
		this.setCode(0);
		this.setText("");
		this.setStackTrace("");
		this.setType(SmeupToUBUY.TypeValue.ERROR.name());
		this.setSubType("");
		this.setOrigin("");
		this.setExternalResult(false);
		this.setExternalText("");
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getText() {
		if (this.text==null) {
			return "";	
		} else {
			return this.text;
		}
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

	public String getExternalText() {
		if (this.externalText==null) {
			return "";	
		} else {
			return this.externalText;
		}
	}


	public void setExternalText(String externalText) {
		this.externalText = externalText;
	}	

	public boolean isError() {
		if (this.code!=0) {
			return true;
		} else {
			return false;
		}
	}


	public String getStackTrace() {
		if (stackTrace==null) {
			stackTrace="";
		}
		return stackTrace;
	}


	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}


	public String getType() {
		if (type==null) {
			type="";
		}
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSubType() {
		if (subType==null) {
			subType="";
		}
		return subType;
	}


	public void setSubType(String subType) {
		this.subType = subType;
	}


	public String getOrigin() {
		if (origin==null) {
			origin="";
		}
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public boolean isExternalResult() {
		return externalResult;
	}


	public void setExternalResult(boolean externalResult) {
		this.externalResult = externalResult;
	}

}
