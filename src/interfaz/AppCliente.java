package interfaz;

import java.util.Scanner;
import modelo.Cliente;
import modelo.ProcesoInformacionCliente;

public class AppCliente {

	private Scanner input;
	private Cliente cliente;
	private ProcesoInformacionCliente procesoCliente;
	
	public AppCliente(){
		this.input= new Scanner(System.in);
		this.cliente = new Cliente();
		this.procesoCliente=new ProcesoInformacionCliente();
	}
	
	public static void main(String[] args) {
	
		AppCliente app=new AppCliente();
		Scanner teclado = new Scanner(System.in);
		while(true) {
	    System.out.println("Seleccione la opción deseada:\n1.Adicionar Cliente\n2.Listar clientes\n3.Consultar Cliente\n4.Modificar Cliente\n5.Borrar cliente");
	    int aux = teclado.nextInt();
		switch(aux) {
		case 1:
		app.seleccionarOpcion(1);
		break;
			case 2:
			app.seleccionarOpcion(2);
			break;
				case 3:
				app.seleccionarOpcion(3);
				break;
					case 4:
					app.seleccionarOpcion(4);
					break;
						case 5:
						app.seleccionarOpcion(5);
						break;
							default: System.out.println("COOOOMMMAAA MIERDA!!!");
		}
	}
	}
	
	public void seleccionarOpcion(int opc) {
		if(opc==1) {
			adicionarCliente();
		}else if(opc==2) {
			listarClientes();
		}else if(opc==3) {
			consultarCliente();
		}else if(opc==4) {
			modificarCliente();
		}else if(opc==5) {
			borrarCliente();
		}
	}
	
	private void consultarCliente() {
		System.out.println("\nConsulta por codigo \n");
		System.out.println("Digite Codigo");
		String codigo = input.nextLine();
		procesoCliente.consultarCliente(codigo);
	}
	
	private void modificarCliente() {
		System.out.println("\nActualizar datos \n");
		System.out.println("Digitar:\n Codigo\n Nombre\n Apellido\n Telefono\n Correo");
		String codigo = input.nextLine();
		String nombre = input.nextLine();
		String apellido = input.nextLine();
		String telefono = input.nextLine();
		String correo = input.nextLine();
		System.out.println("actualizar");
		procesoCliente.actualizarDatosCliente(codigo,nombre,apellido,telefono,correo);
	}
	
	private void listarClientes() {
		procesoCliente.listarCliente();
	}
	
    private void adicionarCliente() {
    	System.out.println("\nAdicionar Datos \n");
    	System.out.println("Digitar:\n Codigo\n Nombre\n Apellido\n Telefono\n Correo");
    	this.cliente=new Cliente();
    	String codigo= input.nextLine();
    	String nombre= input.nextLine();
    	String apellido= input.nextLine();
    	String telefono= input.nextLine();
    	String correo= input.nextLine();
    	
    	cliente.setCodigo(codigo);
    	cliente.setNombre(nombre);
    	cliente.setApellido(apellido);
    	cliente.setTelefono(telefono);
    	cliente.setCorreo(correo);
    	procesoCliente.registrarCliente(cliente);
    }
    
    private void borrarCliente() {
    	System.out.println("Borrar Datos");
    	System.out.println("Digitar Codigo");
    	String codigo = input.nextLine();
    	procesoCliente.borrarDatosCliente(codigo);
    	System.out.println("Registro borrado");
    }
	
}
