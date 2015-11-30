package it.unige.dibris.adm;
/*ClassOut - Class that represent the standard output of MyClassifier.
 * Information saved are the original word, the lemma and the word found in the ontology, in right languages, 
 * plus the hierarchy of ontology tree (from leave to root).  
 */


import java.util.List;

import it.uniroma1.lcl.jlt.util.Language;

public class TCOutput {
	private Language textLang;
	private Language ontLang;
	private List<ClassifierObject> info;
	
	public TCOutput (Language t, Language o, List<ClassifierObject> info) {
		this.textLang = t;
		this.ontLang = o;
		this.info = info;
	}

	public Language getTextLang() {
		return textLang;
	}

	public void setTextLang(Language textLang) {
		this.textLang = textLang;
	}

	public Language getOntLang() {
		return ontLang;
	}

	public void setOntLang(Language ontLang) {
		this.ontLang = ontLang;
	}

	public List<ClassifierObject> getInfo() {
		return info;
	}

	public void setInfo(List<ClassifierObject> info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		String output = "Text language: " + textLang.toString() + " Ontology language: " + ontLang.toString() + 
				"\nText word \t Ontology word \t Number of occurences \t Ontology tree\n";
		for(ClassifierObject c : info) {
			output+= c.getTextWords() + "\t" + c.getOntologyWord() + "\t" + c.getNumberOfOcc() + "\t" + c.getOntologyTree().toString() + "\n";
		}
		return output;
	}
}
