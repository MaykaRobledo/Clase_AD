package ut2_ejercicio17.controlador;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ut2_ejercicio17.modelo.dao.DepartamentoDAO;
import ut2_ejercicio17.modelo.dao.DepartamentoDAOImpl;
import ut2_ejercicio17.modelo.dto.DepartamentoDTO;
import ut2_ejercicio17.modelo.dto.DepartamentoDTOPropiedadesJavaFX;

public class Controller {
	
	@FXML
	private TableColumn<DepartamentoDTOPropiedadesJavaFX, Integer> colIdDpto;

	@FXML
	private TableColumn<DepartamentoDTOPropiedadesJavaFX, String> colLocalidadDpto;

	@FXML
	private TableColumn<DepartamentoDTOPropiedadesJavaFX, String> colNombreDpto;

	@FXML
	private TableView<DepartamentoDTOPropiedadesJavaFX> tablaDepartamentos;

	
	@FXML
	private TextField txtNombreDpto;
	
	
	@FXML
	private TextField txtLocalidadDpto;
	
	@FXML
	private void guardarDepartamento(ActionEvent event) {
		
		DepartamentoDAO dptoDAO = new DepartamentoDAOImpl();
		DepartamentoDTO dptoDTO = new DepartamentoDTO();
		
		
		dptoDTO.setDepNombre(txtNombreDpto.getText());
		dptoDTO.setDepLocalidad(txtLocalidadDpto.getText());
		dptoDAO.añadirDpto(dptoDTO);
		cargarDepartamentos();
		
		txtNombreDpto.setText(null);
		txtLocalidadDpto.setText(null);
	}
	
	@FXML
    void initialize() {
		//Cargar columnas de la tabla Departamentos
		
		colIdDpto.setCellValueFactory(new PropertyValueFactory<>("depNum"));
		colLocalidadDpto.setCellValueFactory(new PropertyValueFactory<>("depLocalidad"));
		colNombreDpto.setCellValueFactory(new PropertyValueFactory<>("depNombre"));
		cargarDepartamentos();
		

		}
	private void cargarDepartamentos(){
		DepartamentoDAO dptoDAO = new DepartamentoDAOImpl();
		ArrayList<DepartamentoDTOPropiedadesJavaFX> alDptoJFX = new ArrayList<DepartamentoDTOPropiedadesJavaFX>();
		for(DepartamentoDTO dpto : dptoDAO.listarDptos()) {

			DepartamentoDTOPropiedadesJavaFX dptoJFX = new DepartamentoDTOPropiedadesJavaFX(dpto.getDepNum(), dpto.getDepNombre(), dpto.getDepLocalidad());
			alDptoJFX.add(dptoJFX);
			
		}
		

		tablaDepartamentos.setItems(FXCollections.observableArrayList(alDptoJFX));
		

    }

	

}
