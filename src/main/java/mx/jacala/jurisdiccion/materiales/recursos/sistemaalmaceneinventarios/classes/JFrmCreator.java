/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.jacala.jurisdiccion.materiales.recursos.sistemaalmaceneinventarios.classes;
import mx.jacala.jurisdiccion.materiales.recursos.sistemaalmaceneinventarios.GUI.*;

/**
 *
 * @author INVENTARIOS
 */
public class JFrmCreator {
    private static JFrmAcercaDe _frmAcercaDe;
    private static JFrmAltaClave _frmAltaClave;
    private static JFrmAltaDestino _frmAltaDestino;
    private static JFrmSalidaAlmacen _frmSalidaAlmacen;
    private static JFrmDespachoAlmacen _frmDespachoAlmacen;
    
    
    public static JFrmAcercaDe getFrmAcercaDe(){
        if (_frmAcercaDe == null){
            _frmAcercaDe = new JFrmAcercaDe();
        }
        return _frmAcercaDe;
    }
}