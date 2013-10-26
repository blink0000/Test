package com.example.baza_projekt;

public class Studenti {

	private String ime;
	private String prezime;
	private String brojIndexa;
	private String godinaStudija;

	public Studenti() {
	}

	public Studenti(String ime) {
	}

	public Studenti(String ime, String prezime) {
	}

	public Studenti(String ime, String prezime, String brojIndexa) {
	}

	public Studenti(String ime, String prezime, String brojIndexa,
			String godinaStudija) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndexa = brojIndexa;
		this.godinaStudija = godinaStudija;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(String godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

}
