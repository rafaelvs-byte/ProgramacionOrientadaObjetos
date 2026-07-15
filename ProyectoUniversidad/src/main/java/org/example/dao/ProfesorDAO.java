package org.example.dao;

import org.example.config.Conexion;
import org.example.modelo.Profesor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfesorDAO {

    public boolean nuevoProfesor(Profesor profesor) {
        boolean registrado = false;
        String sql = "INSERT INTO maestros (numEmpleado, nombre, edad, puesto, cedulaProfesional, curp) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setInt(1, profesor.getNumEmpleado());
            stm.setString(2, profesor.getNombre());
            stm.setInt(3, profesor.getEdad());
            stm.setString(4, profesor.getPuesto());
            stm.setString(5, profesor.getCedulaProfesional());
            stm.setString(6,profesor.getCurp());

            int filas = stm.executeUpdate();
            if (filas > 0) {
                registrado = true;
                System.out.println("Profesor registrado correctamente en la base de datos.");
            }
        } catch (SQLException err) {
            System.out.println("Error al registrar Profesor: " + err.getMessage());
        }
        return registrado;
    }

    public static ArrayList<Profesor> extraerProfesor(){
        ArrayList<Profesor> profesorBD = new ArrayList<>();
        String sql = "SELECT * FROM maestros";

        try(Connection conexion = Conexion.conectar();
            PreparedStatement stm = conexion.prepareStatement(sql);
            ResultSet rs = stm.executeQuery()) {

            while(rs.next()) {
                Profesor profesor = new Profesor();
                // Sigue el orden exacto de tu base de datos de la imagen
                profesor.setNumEmpleado(rs.getInt("numEmpleado"));
                profesor.setNombre(rs.getString("nombre"));
                profesor.setEdad(rs.getInt("edad"));
                profesor.setPuesto(rs.getString("puesto"));
                profesor.setCedulaProfesional(rs.getString("cedulaProfesional"));
                profesor.setCurp(rs.getString("curp"));

                profesorBD.add(profesor);
            }
        } catch(SQLException err){
            System.out.println("Error al extraer los datos: " + err.getMessage());
        }
        return profesorBD;
    }

    public boolean actualizarProfesor(Profesor profesor) {
        boolean actualizado = false;
        String sql = "UPDATE maestros SET nombre = ?, edad = ?, puesto = ?, cedulaProfesional = ?, curp = ? WHERE numEmpleado = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setString(1, profesor.getNombre());
            stm.setInt(2, profesor.getEdad());
            stm.setString(3, profesor.getPuesto());
            stm.setString(4, profesor.getCedulaProfesional());
            stm.setString(5, profesor.getCurp());
            stm.setInt(6, profesor.getNumEmpleado());

            int registrosAfectados = stm.executeUpdate();
            if (registrosAfectados > 0) {
                actualizado = true;
                System.out.println("Profesor actualizado correctamente.");
            } else {
                System.out.println("No se encontró el número de empleado.");
            }
        } catch (SQLException err) {
            System.out.println("Error al actualizar al profesor: " + err.getMessage());
        }
        return actualizado;
    }

    public boolean borrarProfesor(Profesor profesor) {
        boolean eliminado = false;
        String sql = "DELETE FROM maestros WHERE numEmpleado = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setInt(1, profesor.getNumEmpleado());
            int registrosAfectados = stm.executeUpdate();
            if (registrosAfectados > 0) {
                eliminado = true;
                System.out.println("Profesor eliminado correctamente.");
            } else {
                System.out.println("No se encontró el número de empleado.");
            }
        } catch (SQLException err) {
            System.out.println("Error al eliminar profesor: " + err.getMessage());
        }
        return eliminado;
    }

    public boolean buscarProfesor(Profesor profesor) {
        boolean encontrado = false;
        String sql = "SELECT * FROM maestros WHERE numEmpleado = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setInt(1, profesor.getNumEmpleado());
            try (ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                    profesor.setNombre(rs.getString("nombre"));
                    profesor.setEdad(rs.getInt("edad"));
                    profesor.setPuesto(rs.getString("puesto"));
                    profesor.setCedulaProfesional(rs.getString("cedulaProfesional"));
                    profesor.setCurp(rs.getString("curp"));
                    encontrado = true;
                }
            }
        } catch (SQLException err) {
            System.out.println("Error al buscar profesor: " + err.getMessage());
        }
        return encontrado;
    }
    public boolean updatePro(Profesor profesor){
        boolean actualizado = false;
        String sql = "UPDATE maestros SET nombre = ?, edad = ?, puesto = ?, cedulaProfesional = ?, curp = ? WHERE numEmpleado = ?";

        try(Connection conexion = Conexion.conectar();
            PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setString(1, profesor.getNombre());
            stm.setInt(2, profesor.getEdad());
            stm.setString(3, profesor.getPuesto());
            stm.setString(4, profesor.getCedulaProfesional());
            stm.setString(5,profesor.getCurp());
            stm.setInt(6, profesor.getNumEmpleado());

            int registrosAfectados = stm.executeUpdate();
            if (registrosAfectados > 0){
                actualizado = true;
                System.out.println("Profesor actualizado correctamente");
            } else {
                System.out.println("No se encontró ningún profesor con ese número de empleado");
            }

        } catch(SQLException err){
            System.out.println("Error al actualizar los datos del profesor: " + err.getMessage());
        }
        return actualizado;
    }
    public boolean deletePro(Profesor profesor){
        boolean profeEliminado = false;
        String sql = "DELETE FROM maestros WHERE numEmpleado = ?";

        try(Connection conexion = Conexion.conectar();
            PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setInt(1, profesor.getNumEmpleado());
            int ProEliminado = stm.executeUpdate();
            if(ProEliminado > 0){
                profeEliminado = true;
                System.out.println("Profesor eliminado correctamente");
            } else {
                System.out.println("No se encontró este empleado");
            }

        } catch(SQLException err){
            System.out.println("Error al eliminar profesor: " + err.getMessage());
        }
        return profeEliminado;
    }
    public ArrayList<Profesor> buscarPro(Profesor profesor) {
        ArrayList<Profesor> profesorBD2 = new ArrayList<Profesor>();
        String sql = "SELECT * FROM maestros WHERE numEmpleado = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement stm = conexion.prepareStatement(sql)) {

            stm.setInt(1, profesor.getNumEmpleado());

            try (ResultSet rs = stm.executeQuery()) {
                while (rs.next()) {
                    Profesor profesor2 = new Profesor();
                    profesor2.setNumEmpleado(rs.getInt("numEmpleado"));
                    profesor2.setNombre(rs.getString("nombre"));
                    profesor2.setEdad(rs.getInt("edad"));
                    profesor2.setPuesto(rs.getString("puesto"));
                    profesor2.setCedulaProfesional(rs.getString("cedulaProfesional"));
                    profesor2.setCurp(rs.getString("curp"));

                    profesorBD2.add(profesor2);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar profesor: " + e.getMessage());
        }

        return profesorBD2;
    }
}