/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.util.Date;
import com.sagframe.sqltoy.showcase.vo.base.AbstractOrganInfoVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_organ_info,Remark:机构信息表 	
 */
@SqlToyEntity
public class OrganInfoVO extends AbstractOrganInfoVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 354677848991375013L;
	
	/**
	 * 请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	 * 如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 */
	 
	/** default constructor */
	public OrganInfoVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public OrganInfoVO(String organId)
	{
		this.organId=organId;
	}

	/** minimal constructor */
	public OrganInfoVO(String organId,String organName,String organCode,String organPid,Integer showIndex,String createBy,Date createTime,String updateBy,Date updateTime,Integer status)
	{
		this.organId=organId;
		this.organName=organName;
		this.organCode=organCode;
		this.organPid=organPid;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/** full constructor */
	public OrganInfoVO(String organId,String organName,String organCode,String costNo,String organPid,String nodeRoute,Integer nodeLevel,Integer isLeaf,Integer showIndex,String createBy,Date createTime,String updateBy,Date updateTime,Integer status)
	{
		this.organId=organId;
		this.organName=organName;
		this.organCode=organCode;
		this.costNo=costNo;
		this.organPid=organPid;
		this.nodeRoute=nodeRoute;
		this.nodeLevel=nodeLevel;
		this.isLeaf=isLeaf;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	
	//请绝对不要在此类中重复定义Abstract类中的对应表字段的属性,易导致属性失去@Column关联表字段的注解特征,无法正确生成相应的sql
	//如覆盖定义了属性C,原本生成 insert into tableName (A,B,C) values(?,?,?) 变成了 insert into tableName (A,B) values(?,?)
	 
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public OrganInfoVO clone() {
		try {
			// TODO Auto-generated method stub
			return (OrganInfoVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
