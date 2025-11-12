package ut2_ejercicio17.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ut2_ejercicio17.modelo.dao.DepartamentoDAO;
import ut2_ejercicio17.modelo.dao.DepartamentoDAOImpl;
import ut2_ejercicio17.modelo.dto.DepartamentoDTO;

public class MainApp extends Application{

	public static void main(String[] args) {
		
		
		
		launch(args); //Lanzar la aplicacion JavaFX
		
//		DepartamentoDAO dptoDAO = new DepartamentoDAOImpl();
//		DepartamentoDTO dptoDTO = new DepartamentoDTO();
//		dptoDTO.setDepNombre("Formación");
//		dptoDTO.setDepLocalidad("Murcia");
//		dptoDAO.añadirDpto(dptoDTO);
//		dptoDTO.setDepNombre("Adiestramiento");
//		dptoDTO.setDepLocalidad("Oremse");
//		dptoDAO.añadirDpto(dptoDTO);
//
//
//		dptoDAO.eliminarDpto(2);
//		
//		dptoDTO.setDepNombre("Digitalización");
//		dptoDTO.setDepLocalidad("Santander");
//		dptoDAO.modificarDpto(3, dptoDTO);
//		
//		
//		for (DepartamentoDTO dpto: dptoDAO.listarDptos()) {
//			System.out.println(dpto);
//		}
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Cargamos la vista FXML
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/Vista.fxml"));
		//Ruta relativa a src/main/resources
		
		//Crear la escena
		
		Scene scene = new Scene(root);
		
		//Configurar y mostrar la ventana principal
		
		primaryStage.setTitle("Gestión de empresa");
		primaryStage.setScene(scene);
		
		//Añadimos un .show() porq sino no aparece
		primaryStage.show();
		
		
	}

}
