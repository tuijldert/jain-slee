package org.mobicents.slee.resource.jdbc.event;

import java.sql.Statement;

/**
 * An event which provides the results for the execution of a {@link Statement}.
 * 
 * @author martins
 * 
 */
public interface StatementEvent {

	/**
	 * Retrieves the executed {@link Statement#}.
	 * 
	 * @return
	 */
	public Statement getStatement();

	/**
	 * Retrieves the sql executed.
	 * 
	 * @return
	 */
	public String getSQL();

	/**
	 * Retrieves the autoGeneratedKeys parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public Integer getAutoGeneratedKeys();

	/**
	 * Retrieves the columnIndexes parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public int[] getColumnIndexes();

	/**
	 * Retrieves the columnNames parameter, which may be used in certain
	 * statement executions.
	 * 
	 * @return null if such execution parameter was not used.
	 */
	public String[] getColumnNames();

}
