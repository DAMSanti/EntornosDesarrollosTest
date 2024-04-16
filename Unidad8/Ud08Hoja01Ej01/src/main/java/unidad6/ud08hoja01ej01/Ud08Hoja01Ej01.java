package unidad6.ud08hoja01ej01;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ud08Hoja01Ej01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        Usuario user1 = new Usuario( "Santi", "Tamayo", "asdf@adf.com");
        Usuario user2 = new Usuario(01, "Paco", "Martinez", "asdf@adf.com");
        UsuarioDAO connection = new UsuarioDAO();
        do {
            System.out.println("GESTION DE BASE DE DATOS USUARIOS\n1.- Actualizar\n2.- Eliminar\n3.- Agregar\n4.- Listar\n5.- Salir");
            switch(teclado.nextInt()) {
                case 1->{
                    System.out.print("Selecciona la id del usuario que quieres modificar: ");
                    int id = Teclado.leerInt();
                    
                    connection.modificar(user2);
                }
                case 2->{
                    connection.eliminar(01);
                }
                case 3->{
                    connection.guardar(user1);
                }
                case 4->{
                    System.out.println(connection.listar().toString());
                }
                case 5->{
                    salir = true;
                }
                default ->{
                    System.out.println("La opcion introducida es incorrecta.");
                }
            }            
        } while (!salir);

    }
}


/*


Se pide crear e implementar las clases: Usuario, de conexión a la BBDD AccesoBaseDatos que
implemente el patrón Singleton y la clase UsuarioDAOImp que implementada a partir de la
interface Repositorio (con genéricos) el patrón DAO.
Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo
de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción
con un número.
Gestión de usuarios
1. Actualizar
2. Eliminar
3. Agregar
4. Listar
5. Salir

Donde:
1. Actualizar – permite que se actualicen como datos del usuario: username, password y
email. Se pide por pantalla el id del usuario que se quiere modificar. Se comprueba
que el usuario exista, se muestran sus datos actuales y se pide los nuevos datos para
ese usuario. Se informa de como ha ido la actualización. Se debe validar que el email
tenga un formato correcto y que en el username solo contenga letras.
2. Eliminar – elimina al usuario de la base de datos, se pide por teclado el id del usuario a
eliminar. Se informa sobre como ha ido la eliminación.
3. Agregar – se piden los datos de username, password y email. Se informa sobre como
ha ido la inserción.
4. Listar – listar los usuarios

Todos los datos se deben ingresar mediante el teclado como parámetros. Se debe controlar
todas las posibles excepciones.
Al almacenar la password en la base de datos será encriptada utilizando en la sentencia insert
y update el algoritmo de encriptación md5.
Usar un do while para crear el menú repetitivo que itera hasta que la operación sea salir, cada
vez que se selecciona una operación distinta a salir, al finalizar con dicha operación debe
volver al menú para continuar con otra, al finalizar con la opción salir (5) se debe cerrar la
conexión a la base de datos y finalizar el programa.

*/