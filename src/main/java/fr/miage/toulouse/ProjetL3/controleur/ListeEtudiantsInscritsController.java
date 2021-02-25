package fr.miage.toulouse.ProjetL3.controleur;

import java.net.URL;
import java.util.ResourceBundle;

import fr.miage.toulouse.ProjetL3.Class.metier.Etudiant;
import fr.miage.toulouse.ProjetL3.Class.metier.UE;
import fr.miage.toulouse.ProjetL3.Class.technique.appFonction;
import fr.miage.toulouse.ProjetL3.Class.technique.utilsFunction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class ListeEtudiantsInscritsController implements Initializable {
	@FXML
	private Button btn_sauvegarder;
	@FXML
	private Button btn_annuler;
	@FXML
	private TableView<UE> list_UE;
	@FXML
	private TableColumn<UE, String> column_codeIdentification;
	@FXML
	private TableColumn<UE, String> column_nomUE;
	@FXML
	private TableColumn<UE, Integer> column_creditETC;
	@FXML
	private TableColumn<UE, ComboBox<String>> column_prerequisUE;
	@FXML
	private TableColumn<UE, CheckBox> column_checkBox;

	/**
	 * Notre objet Etudiant transmit par le contrôleur
	 * ListeEtudiantsInscritsController nous permettant de récupérer les UE auquel
	 * cet étudiant peut s'inscrire
	 */
	public static Etudiant etudiantUE;

	// Liste des UE qui peuvent être validé par l'étudiant
	private ObservableList<UE> listUE = FXCollections.observableArrayList();
	
	/**
	 * On récupérer ici l'ensemble des UE Valide
	 */
	// private UEValide UEValideParEtudiant =
	// utilsFunction.ueValideEtudiant(etudiantUE);

	/**
	 * 
	 * Evenement lors de la déconnexion
	 * 
	 * @param event
	 */
	@FXML
	public void deco(MouseEvent event) {
		appFonction.deco();
	}

	/**
	 * Evenement lors du clic sur le bouton retour
	 * 
	 * @param event
	 */
	@FXML
	public void retour(MouseEvent event) {
		appFonction.retour("ListeEtudiant_Secretariat");
	}

	/**
	 * Permet de sauvegarder les UE auquels ont été inscrits létudiant
	 * 
	 * @param event
	 */
	@FXML
	public void sauvegarderUEInscription(MouseEvent event) {
	}

	/**
	 * Permet de reset le formulaire
	 * 
	 * @param event
	 */
	@FXML
	public void resetForm(MouseEvent event) {
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		for(UE ue : utilsFunction.ueInscriptionPossible(etudiantUE)) {
		listUE.add(ue);	
		}
		
		
		column_codeIdentification.setCellValueFactory(new PropertyValueFactory<>("codeIdentification"));
		column_nomUE.setCellValueFactory(new PropertyValueFactory<>("nomUE"));
		column_creditETC.setCellValueFactory(new PropertyValueFactory<>("creditECT"));
		/*
		column_prerequisUE.setCellValueFactory(new PropertyValueFactory<>("nomParcours"));
		column_checkBox.setCellValueFactory(new PropertyValueFactory<>("nomMention"));
		*/
		list_UE.setItems(listUE);
		
	}
}
