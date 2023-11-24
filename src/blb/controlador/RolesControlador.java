package blb.controlador;

import blb.conexionDB.ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import org.apache.log4j.Logger;

public class RolesControlador {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private static final Logger log = Logger.getLogger(RolesControlador.class);

    public void agregarRoles(String valor, JComboBox combo) {

        String sql = "SELECT * FROM roles";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                combo.addItem(rs.getString(valor));
            }

            pst.close();
            rs.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla roles en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar la tabla roles en la base de datos..." + e.getCause());

        }

    }

    public void agregarTipoMaterial(String valor, JComboBox combo) {

        String sql = "SELECT * FROM tipo_material";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                combo.addItem(rs.getString(valor));
            }

            pst.close();
            rs.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla tipo_material en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar a la tabla tipo_material en la base de datos..." + e.getCause());

        }

    }

}
