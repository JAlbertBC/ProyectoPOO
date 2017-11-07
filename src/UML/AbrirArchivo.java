package UML;

import javax.swing.JFileChooser;
import java.io.File;
import java.awt.Desktop;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.JOptionPane;
 
public class AbrirArchivo {
 Runtime obj = null;
private String direccion="";
 public static void main(String args[]) throws Exception {
        AbrirArchivo abrirArchivo = new AbrirArchivo();
}
 
   public AbrirArchivo() {
    
       elegirArchivo();
    Abrir(obtenerDireccion());
  obj = Runtime.getRuntime();
   }
 
   private void elegirArchivo() {
    JFileChooser elegirArchivo = new JFileChooser();
    File archivo=null;
   FileFilter tipo = new FileNameExtensionFilter("Archivos PDF", "pdf","mp3");
   elegirArchivo.addChoosableFileFilter(tipo);
 
   int estado = elegirArchivo.showDialog(null, "Abrir Archivo");
 
   if (estado == JFileChooser.APPROVE_OPTION) {
     archivo = elegirArchivo.getSelectedFile();
     colocarDireccion(archivo.toString());
   }
   else if (estado == JFileChooser.CANCEL_OPTION) {
    //JOptionPane.showMessageDialog(null, "No se eligio archivo", "Error", 0);
    //System.exit(0);
   }
   }
 
   private void colocarDireccion(String direccion) {
    this.direccion=direccion;
   }
 
   private String obtenerDireccion() {
    return direccion;
   }
 
 
   private void Abrir(String directorio){
File archivo = new File(directorio);
try{
Desktop.getDesktop().open(archivo);

}catch (Exception e) {
System.out.println(e);

}
}

    void show() {
        throw new UnsupportedOperationException("Not yet implemented");
    
    }

    private void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       // throw new UnsupportedOperationException("Not yet implemented");
    }
}
