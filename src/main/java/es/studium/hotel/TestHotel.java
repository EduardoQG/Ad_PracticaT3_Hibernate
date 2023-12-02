package es.studium.hotel;

public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente ("María", "González Rodríguez", "mGlez00@gmail.com", "5472457E", "mariaClave");
		HotelManager.crear(c1);
		
		HotelManager.leer();
		
		Cliente cAct1 = new Cliente (3, "Jesus", "Sanchez Carrasco", "carrascoJ@gmail.com", "1234567Y", "miClave");
		HotelManager.actualizar(cAct1);
			
		Cliente elim1 = new Cliente(4);	
		HotelManager.eliminar(elim1);
	}

}
