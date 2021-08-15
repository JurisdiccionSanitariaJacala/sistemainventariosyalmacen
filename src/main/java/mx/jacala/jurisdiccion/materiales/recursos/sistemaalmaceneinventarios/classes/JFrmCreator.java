/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.jacala.jurisdiccion.materiales.recursos.sistemaalmaceneinventarios.classes;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import mx.jacala.jurisdiccion.materiales.recursos.sistemaalmaceneinventarios.GUI.*;

/**
 *
 * @author INVENTARIOS
 */
public class JFrmCreator extends JInternalFrame{
    
    private static JFrmAcercaDe _frmAcercaDe;
    private static JFrmAltaClave _frmAltaClave;
    private static JFrmAltaDestino _frmAltaDestino;
    private static JFrmConsDestino _frmConsDestino;
    private static JFrmSalidaAlmacen _frmSalidaAlmacen;
    private static JFrmDespachoAlmacen _frmDespachoAlmacen;
    private static JFrmContacto _frmContacto;
    
    /*
    Metodos para los JFrame
    */
    
    public static JFrmDespachoAlmacen getFrmDespachoAlmacen(){
        if(_frmDespachoAlmacen.isShowing()){
            _frmDespachoAlmacen = new JFrmDespachoAlmacen();
        }
        return _frmDespachoAlmacen;
    }
    
    public static JFrmAcercaDe getFrmAcercaDe(){
        if (_frmAcercaDe == null){
            _frmAcercaDe = new JFrmAcercaDe();
        }
        return _frmAcercaDe;
    }
    
    public static JFrmContacto getFrmContacto(){
        if(_frmContacto == null){
            _frmContacto = new JFrmContacto();
        }
        return _frmContacto;
    }
    
    public static JFrmSalidaAlmacen getFrmSalidaAlmacen(){
        if(_frmSalidaAlmacen == null){
            _frmSalidaAlmacen = new JFrmSalidaAlmacen();
        }
        return _frmSalidaAlmacen;
    }
    
    public static JFrmAltaClave getFrmAltaClave(){
        if(_frmAltaClave == null) {
            _frmAltaClave = new JFrmAltaClave();
        }
        return _frmAltaClave;
    }
    
    public static JFrmConsDestino getFrmConsDestino(){
        if(_frmConsDestino == null){
            _frmConsDestino = new JFrmConsDestino();            
        }
        return _frmConsDestino;
    }
    
}