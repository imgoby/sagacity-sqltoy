/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigInteger;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_bigint_table   
 */
@Entity(tableName="sqltoy_bigint_table",pk_constraint="PRIMARY")
public abstract class AbstractBigintTableVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //id,name
	 
	 //not null properties
	 //id,name

	/**
	 * 
	 */
	private static final long serialVersionUID = 5464934304853365764L;
	
	/**
	 * 主键
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.SnowflakeIdGenerator")
	@Column(name="ID",length=20L,type=java.sql.Types.BIGINT,nullable=false)
	protected BigInteger id;
	
	/**
	 * 名称
	 */
	@Column(name="NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String name;
	


	/** default constructor */
	public AbstractBigintTableVO() {
	}
	
	/** pk constructor */
	public AbstractBigintTableVO(BigInteger id)
	{
		this.id=id;
	}


	/** full constructor */
	public AbstractBigintTableVO(BigInteger id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	/**
	 *@param id the id to set
	 */
	public AbstractBigintTableVO setId(BigInteger id) {
		this.id=id;
		return this;
	}
		
	/**
	 *@return the Id
	 */
	public BigInteger getId() {
	    return this.id;
	}
	
	/**
	 *@param name the name to set
	 */
	public AbstractBigintTableVO setName(String name) {
		this.name=name;
		return this;
	}
		
	/**
	 *@return the Name
	 */
	public String getName() {
	    return this.name;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("id=").append(getId()).append("\n");
		columnsBuffer.append("name=").append(getName()).append("\n");
		return columnsBuffer.toString();
	}
}
