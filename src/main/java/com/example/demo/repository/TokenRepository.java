/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dataObject.Token;

/**
 * @author Danger
 *
 */
public interface TokenRepository extends CrudRepository<Token,Long> {

}
