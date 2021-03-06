package com.byteslounge.spring.tx.dao;

import java.util.List;

import com.byteslounge.spring.tx.model.Adherent;

public interface IAdherentDao {

	
	  public  Adherent addAdherent(Adherent obj);

	  public  void deleteAdherent(Long obj);
	  public  Adherent updateAdherent(Adherent obj);
	  public  Adherent getAdherentById(Long idObj);
	  public  Adherent getAdherentByEmail(String mail);
	  public  List<Adherent> getAll(boolean s);
	  public  void DeleteAll();
	  public  List<Adherent> getAll();
	  public String PathPhoto(Long id);
}
