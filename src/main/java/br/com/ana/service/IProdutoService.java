/**
 * 
 */
package br.com.ana.service;

import java.util.List;

import br.com.ana.domain.Produto;
import br.com.ana.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
