/**
 * 
 */
package br.com.ana.dao;

import java.util.List;

import br.com.ana.dao.generic.IGenericDAO;
import br.com.ana.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
