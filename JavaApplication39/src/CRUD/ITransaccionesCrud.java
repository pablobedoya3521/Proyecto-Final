/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CRUD;

public interface ITransaccionesCrud<T> {
    public void guardar(T dato) ;
    public T buscar(String dato);
    public void eliminar(String dato);
    public void modificar(T dato);
}
