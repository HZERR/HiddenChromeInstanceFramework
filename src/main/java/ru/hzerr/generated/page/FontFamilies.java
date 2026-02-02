package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;

@Experimental
@Description("Generic font families collection.")
public class FontFamilies {

	@Description("The standard font-family.")
	private String standard;

	@Description("The fixed font-family.")
	private String fixed;

	@Description("The serif font-family.")
	private String serif;

	@Description("The sansSerif font-family.")
	private String sansSerif;

	@Description("The cursive font-family.")
	private String cursive;

	@Description("The fantasy font-family.")
	private String fantasy;

	@Description("The math font-family.")
	private String math;

    public FontFamilies() {
    }

	public String getStandard() {
		return this.standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getFixed() {
		return this.fixed;
	}
	public void setFixed(String fixed) {
		this.fixed = fixed;
	}
	public String getSerif() {
		return this.serif;
	}
	public void setSerif(String serif) {
		this.serif = serif;
	}
	public String getSansSerif() {
		return this.sansSerif;
	}
	public void setSansSerif(String sansSerif) {
		this.sansSerif = sansSerif;
	}
	public String getCursive() {
		return this.cursive;
	}
	public void setCursive(String cursive) {
		this.cursive = cursive;
	}
	public String getFantasy() {
		return this.fantasy;
	}
	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}
	public String getMath() {
		return this.math;
	}
	public void setMath(String math) {
		this.math = math;
	}
}
