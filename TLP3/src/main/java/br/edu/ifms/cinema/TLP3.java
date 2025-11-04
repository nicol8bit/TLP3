/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifms.cinema;

import br.edu.ifms.cinema.dao.ClienteDAO;
import br.edu.ifms.cinema.model.Cliente;
import java.util.List;

/**
 *
 * @author conta
 */
public class TLP3 {

    public static void main(String[] args) {
        ClienteDAO cdao = new ClienteDAO();
        Cliente c1 = new Cliente();
        c1.setNome("Maria");
        
        Cliente c2 = new Cliente();
        c2.setNome("João");
        
        cdao.add(c1);
        cdao.add(c1);
        
        List<Cliente> clientes = cdao.getAll();
        for(Cliente cliente : clientes){
            System.out.println("---------------------------");
            System.out.println("Id: " + cliente.getId());
            System.out.println("Nome: "+ cliente.getNome());
        }

//        Cliente c1 = cdao.getById(2);
//        System.out.println("Nome: "+ c1.getNome());

        System.out.println("teste");
        
        
           
    }
}
