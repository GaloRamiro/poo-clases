package dom.krakedev;

public class TestMensajeria {

	public static void main(String[] args) {
		
			
		    Mensajeria sms= new Mensajeria();
		    sms.setNombre("Galo");
		    sms.setApodo("Alumno");
		    
		    sms.saludar();
		    sms.saludarPersona(sms.getNombre(), sms.getApodo());
			}

		}