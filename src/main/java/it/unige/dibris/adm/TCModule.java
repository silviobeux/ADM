package it.unige.dibris.adm;


public interface TCModule {
	public String preProcessing(String text);
	public ModuleOutput postProcessing(TCOutput c);
}
