/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Youssef
 */
public class Variables {

    static String cliente = "";
    static Color principal = Color.cyan;
    static Color secundario = Color.cyan;
    static Color terciario = Color.cyan;
    static String nombre = "";
    static String frase = "";
    static String servidor = "";
    static String bbdd = "";
    static String usuarioServidor = "";
    static String contrasenyaServidor = "";

    public static void getVariables() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(System.getProperty("user.dir") + "/src/JavaClasses/cliente.ini");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.replaceAll("cliente: ", "");
                cliente = linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
                cargarVariables(cliente);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void cargarVariables(String cliente) {

        /*switch (cliente) {
            case "bbva":
                principal = Color.cyan;
                secundario = Color.cyan;
                terciario = Color.cyan;
                nombre = "BBVA";
                frase = "El banco de los BBVAS";
                break;
            case "santander":
                principal = Color.white;
                secundario = Color.white;
                terciario = Color.white;
                nombre = "Santander";
                frase = "El banco de los Santanderas";

                break;
            case "ing":
                principal = Color.orange;
                secundario = Color.orange;
                terciario = Color.orange;
                frase = "El banco de los INGs";
                nombre = "ING";
                break;
                
            case "lacaixa":
                principal = Color.blue;
                secundario = Color.orange;
                terciario = Color.orange;
                frase = "Benvingut a La Caixa";
                nombre = "Caixa Bank";
                break;
            default:
                principal = new java.awt.Color(255, 204, 204);
                secundario = new java.awt.Color(255, 204, 204);
                terciario = new java.awt.Color(255, 204, 204);
                nombre = "PeponaBank";
                frase = "El banco de las peponas";

                break;
        }*/
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        boolean existe = false;

        try {

            String ruta = System.getProperty("user.dir") + "/src/JavaClasses/" + cliente + ".ini";
            File f = new File(ruta);

            if (!f.exists()
                    || f.isDirectory()) {
                ruta = System.getProperty("user.dir") + "/src/JavaClasses/default.ini";
            }

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                //linea = linea.replaceAll("cliente: ", "");
                //System.out.println(linea);
                if (linea.contains(":")) {
                    String[] variable = linea.split(":");
                    System.out.println(variable[0] + " " + variable[1]);
                    switch (variable[0]) {
                        case "principal":
                            Color col1 = new java.awt.Color(Integer.parseInt(variable[1]), Integer.parseInt(variable[2]), Integer.parseInt(variable[3]));
                            principal = col1;
                            break;
                        case "secundario":
                            Color col2 = new java.awt.Color(Integer.parseInt(variable[1]), Integer.parseInt(variable[2]), Integer.parseInt(variable[3]));
                            secundario = col2;
                            break;
                        case "terciario":
                            Color col3 = new java.awt.Color(Integer.parseInt(variable[1]), Integer.parseInt(variable[2]), Integer.parseInt(variable[3]));
                            terciario = col3;
                            break;
                        case "nombre":
                            nombre = variable[1];
                            break;
                        case "frase":
                            frase = variable[1];
                            break;
                        case "servidor":
                            servidor = variable[1];
                            break;
                        case "bbdd":
                            bbdd = variable[1];
                            break;
                       case "usuarioServidor":
                            usuarioServidor = variable[1];
                            break;
                        case "contrasenyaServidor":
                            contrasenyaServidor = variable[1];
                            break;
                    }
                    

                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
