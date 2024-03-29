/**
 * 
 */
package br.com.ana.service;

import java.util.List;

import br.com.ana.domain.Cliente;
import br.com.ana.exceptions.DAOException;
import br.com.ana.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
