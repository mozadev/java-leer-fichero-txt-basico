/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose
 */
import java.io.*; // para archivos de textos
import static java.lang.System.out;
import java.util.*;// para el arraylist
import javax.swing.JTextArea;

public class Proceso {

    String ruta = "c:/datos/cesar.txt";
    Empleado objEmpleado;
    FileReader rutatotal;
    BufferedReader fr;
    FileWriter fw;
    File f;
    public ArrayList<Empleado> lista = new ArrayList();

    public void adicion(Empleado e) throws FileNotFoundException, IOException {

        f = new File(ruta);
        //abrir el archivo para escribri o adicionalr archivos
        fw = new FileWriter(ruta, true);
        String cad = e.getCode()+":"+e.getNome()+ ":"+e.getSueldo();
        fw.write(cad);
        fw.write(13); //que salte de linea
        fw.close();

    }

    public void Lee(JTextArea salida) throws FileNotFoundException, IOException {
        //pasar todo el archivo dentro del arraylist

        lista.clear();//limpiar la lista
        rutatotal = new FileReader(ruta);
        fr = new BufferedReader(rutatotal);
        String cad = fr.readLine();
        String vec[];//vector dinamico
        while (cad != null) {
            vec = cad.split(":");//descompne la cadena en 3 columnas
            objEmpleado = new Empleado(vec[0], vec[1], Double.parseDouble(vec[2]));
            lista.add(objEmpleado);
            cad = fr.readLine();

            String CF = vec[0] + "\t" + vec[1] + "\t" + vec[2] + "\n";

            salida.append(CF);
        }
        fr.close();

    }

}
