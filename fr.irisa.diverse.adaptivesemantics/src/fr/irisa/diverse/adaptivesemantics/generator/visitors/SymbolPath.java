package fr.irisa.diverse.adaptivesemantics.generator.visitors;

public class SymbolPath {
	final private String termForm;
	final private String valueForm;
	final private String unknownForm;
	
	private SymbolPath() {
		this.termForm = "";
		this.valueForm = "";
		this.unknownForm = "";
	}

	public SymbolPath(String termForm, String valueForm, String unknownForm) {
		this.termForm = termForm;
		this.valueForm = valueForm;
		this.unknownForm = unknownForm;
	}
	
	public String getTermForm() {
		return termForm;
	}

	public String getValueForm() {
		return valueForm;
	}

	public String getUnknownForm() {
		return unknownForm;
	}
	
	public String toString(){
		return unknownForm;
	}
}
