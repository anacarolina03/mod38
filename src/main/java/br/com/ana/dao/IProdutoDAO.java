/**
 * 
 */
package br.com.ana.dao;

import java.util.List;

import br.com.ana.dao.generic.IGenericDAO;
import br.com.ana.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
