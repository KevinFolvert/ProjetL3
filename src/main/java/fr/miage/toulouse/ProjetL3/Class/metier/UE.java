package fr.miage.toulouse.ProjetL3.Class.metier;

import java.util.ArrayList;

/**
 * Classe UE, elle fait référence à l'ensemble des UE (Cours) contenues dans une
 * ou plusieurs Mentions. Un UE est suivi par un ou plusieurs étudiants qui
 * peuvent le valider
 * 
 * @see Etudiant
 * @see Mention
 * @see UEValide
 */
public class UE {

	private String codeIdentification;
	private String nomUE;
	private int creditECT;
	private ArrayList<UE> collectionUE_Prerequis;

	/**
	 * Constructeur de la classe UE
	 * 
	 * @param codeId
	 * @param nomUE
	 * @param credit
	 */
	public UE(String codeId, String nomUE, int credit) {
		this.codeIdentification = codeId;
		this.nomUE = nomUE;
		this.creditECT = credit;
		this.collectionUE_Prerequis = new ArrayList<UE>();
	}

	/**
	 * Fonction Get qui permet de récupérer le code d'identification de l'UE
	 * 
	 * @return
	 */
	public String getCodeIdentification() {
		return codeIdentification;
	}

	/**
	 * Méthode Set qui permet de mettre à jour le code d'identification le code de
	 * l'UE
	 * 
	 * @param codeIdentification
	 */
	public void setCodeIdentification(String codeIdentification) {
		this.codeIdentification = codeIdentification;
	}

	/**
	 * Fonction Get qui permet de retourner les crédits pouvant être obtenus par un
	 * étudiant dans cet UE
	 * 
	 * @see Etudiant
	 * @return
	 */
	public int getCreditECT() {
		return creditECT;
	}

	/**
	 * Méthode Set qui permet de mettre à jour le nombre de crédits pouvant être
	 * obtenus par un étudiant au sein de cet UE
	 * 
	 * @see Etudiant
	 * 
	 * @param creditECT
	 */
	public void setCreditECT(int creditECT) {
		this.creditECT = creditECT;
	}

	/**
	 * Fonction Get, elle permet de retourner l'ensemble des mention prérequis pour
	 * qu'un étudiant puisse participer à cet UE
	 * 
	 * @see Etudiant
	 * @return
	 */
	public ArrayList<UE> getCollectionUE_Prerequis() {
		return collectionUE_Prerequis;
	}

	/**
	 * Méthode Set, elle permet de mettre à jour l'ensemble des UE qui doivent être
	 * validés par un étudiant avant de participer à cet UE
	 * 
	 * @see Etudiant
	 * 
	 * @param collectionUE_Prerequis
	 */
	public void setCollectionUE_Prerequis(ArrayList<UE> collectionUE_Prerequis) {
		this.collectionUE_Prerequis = collectionUE_Prerequis;
	}

	/**
	 * Méthode qui permet d'ajouter une UE qui sera prérequis à cet UE
	 * 
	 * @param m
	 */
	public void ajouterUEPrerequis(UE m) {
		this.collectionUE_Prerequis.add(m);
	}

	/**
	 * Méthode qui permet d'enlever un UE qui ne sera plus prérequis pour cet
	 * UE
	 * 
	 * @param m
	 */
	public void enleverUEPrerequis(UE m) {
		this.collectionUE_Prerequis.remove(m);
	}

	/**
	 * Fonction Get, qui retourne le nom de l'UE
	 * 
	 * @return
	 */
	public String getNomUE() {
		return nomUE;
	}

	/**
	 * Méthode Set, elle permet de mettre à jour le nom de l'UE
	 * 
	 * @param nomUE
	 */
	public void setNomUE(String nomUE) {
		this.nomUE = nomUE;
	}

}
