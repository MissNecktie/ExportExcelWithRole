package com.palmelf.erp.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SKU", catalog = "ERP")
@DynamicUpdate(true)
@DynamicInsert(true)
public class Sku implements java.io.Serializable
{
	private static final long serialVersionUID = -2821543605850547602L;
	private Integer skuId;
	private Integer spuId;
	private String name;
	private String myid;
	private String distChName;
	private String distEnName;
	private String color;
	private String size;
	private Double latestCost;
	private Double weight;
	private String developer;
	private String enquirer;
	private String buyer;
	//private Date lastmod;
	private Integer creater;
	private Integer modifiyer;


	/** default constructor */
	public Sku()
	{
	}

	/** minimal constructor */
	public Sku(Integer skuId)
	{
		this.skuId = skuId;
	}

	public Sku(Integer spuid,String name, String myid, String distChName, String distEnName, String color, String size,
               Double latestCost, Double weight, String developer, String enquirer, String buyer, Integer creater, Integer modifiyer) {
		this.spuId = spuid;
		this.name = name;
		this.myid = myid;
		this.distChName = distChName;
		this.distEnName = distEnName;
		this.color = color;
		this.size = size;
		this.latestCost = latestCost;
		this.weight = weight;
		this.developer = developer;
		this.enquirer = enquirer;
		this.buyer = buyer;
		//this.created = created;
		//this.lastmod = lastmod;
		this.creater = creater;
		this.modifiyer = modifiyer;
	}

	@Id
	@GeneratedValue
	@Column(name = "SKU_ID", unique = true, nullable = false)
	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	@Column(name = "SPU_ID", unique = true, nullable = false)
	public Integer getSpuId() {
		return spuId;
	}

	public void setSpuId(Integer spuId) {
		this.spuId = spuId;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "MYID")
	public String getMyid() {
		return myid;
	}

	public void setMyid(String myid) {
		this.myid = myid;
	}

	@Column(name = "DISTCHNAME")
	public String getDistChName() {
		return distChName;
	}

	public void setDistChName(String distChName) {
		this.distChName = distChName;
	}

	@Column(name = "DISTENNAME")
	public String getDistEnName() {
		return distEnName;
	}

	public void setDistEnName(String distEnName) {
		this.distEnName = distEnName;
	}

	@Column(name = "COLOR")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "SIZE")
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "LATESTCOST")
	public Double getLatestCost() {
		return latestCost;
	}

	public void setLatestCost(Double latestCost) {
		this.latestCost = latestCost;
	}

	@Column(name = "WEIGHT")
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Column(name = "DEVELOPER")
	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	@Column(name = "ENQUIRER")
	public String getEnquirer() {
		return enquirer;
	}

	public void setEnquirer(String enquirer) {
		this.enquirer = enquirer;
	}

	@Column(name = "BUYER")
	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "CREATED")
//	public Date getCreated() {
//		return created;
//	}
//
//	public void setCreated(Date created) {
//		this.created = created;
//	}
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "LASTMOD")
//	public Date getLastmod() {
//		return lastmod;
//	}
//
//	public void setLastmod(Date lastmod) {
//		this.lastmod = lastmod;
//	}

	@Column(name = "CREATER")
	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	@Column(name = "MODIFYER")
	public Integer getModifiyer() {
		return modifiyer;
	}

	public void setModifiyer(Integer modifiyer) {
		this.modifiyer = modifiyer;
	}
}