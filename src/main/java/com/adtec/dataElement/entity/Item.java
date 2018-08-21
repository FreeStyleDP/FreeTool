package com.adtec.dataElement.entity;

/**
 * DataElement下单条数据内容
 * @time 2018年8月21日下午12:28:03
 * @author dengp_w
 *
 */
public class Item {
	
	private String ItemName;
	private String ItemDesc;
	private String ItemType;
	private String TypeName;
	private String ItemDeft;
	private String ElemType;
	private String NodeType;
	private String Security;
	private String EnumName;
	private String EnumKvp ;
	private String RelateItemName;
	private String ScopeExpr;
	
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemDesc() {
		return ItemDesc;
	}
	public void setItemDesc(String itemDesc) {
		ItemDesc = itemDesc;
	}
	public String getItemType() {
		return ItemType;
	}
	public void setItemType(String itemType) {
		ItemType = itemType;
	}
	public String getTypeName() {
		return TypeName;
	}
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}
	public String getItemDeft() {
		return ItemDeft;
	}
	public void setItemDeft(String itemDeft) {
		ItemDeft = itemDeft;
	}
	public String getElemType() {
		return ElemType;
	}
	public void setElemType(String elemType) {
		ElemType = elemType;
	}
	public String getNodeType() {
		return NodeType;
	}
	public void setNodeType(String nodeType) {
		NodeType = nodeType;
	}
	public String getSecurity() {
		return Security;
	}
	public void setSecurity(String security) {
		Security = security;
	}
	public String getEnumName() {
		return EnumName;
	}
	public void setEnumName(String enumName) {
		EnumName = enumName;
	}
	public String getEnumKvp() {
		return EnumKvp;
	}
	public void setEnumKvp(String enumKvp) {
		EnumKvp = enumKvp;
	}
	public String getRelateItemName() {
		return RelateItemName;
	}
	public void setRelateItemName(String relateItemName) {
		RelateItemName = relateItemName;
	}
	public String getScopeExpr() {
		return ScopeExpr;
	}
	public void setScopeExpr(String scopeExpr) {
		ScopeExpr = scopeExpr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ElemType == null) ? 0 : ElemType.hashCode());
		result = prime * result + ((EnumKvp == null) ? 0 : EnumKvp.hashCode());
		result = prime * result + ((EnumName == null) ? 0 : EnumName.hashCode());
		result = prime * result + ((ItemDeft == null) ? 0 : ItemDeft.hashCode());
		result = prime * result + ((ItemDesc == null) ? 0 : ItemDesc.hashCode());
		result = prime * result + ((ItemName == null) ? 0 : ItemName.hashCode());
		result = prime * result + ((ItemType == null) ? 0 : ItemType.hashCode());
		result = prime * result + ((NodeType == null) ? 0 : NodeType.hashCode());
		result = prime * result + ((RelateItemName == null) ? 0 : RelateItemName.hashCode());
		result = prime * result + ((ScopeExpr == null) ? 0 : ScopeExpr.hashCode());
		result = prime * result + ((Security == null) ? 0 : Security.hashCode());
		result = prime * result + ((TypeName == null) ? 0 : TypeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (ElemType == null) {
			if (other.ElemType != null)
				return false;
		} else if (!ElemType.equals(other.ElemType))
			return false;
		if (EnumKvp == null) {
			if (other.EnumKvp != null)
				return false;
		} else if (!EnumKvp.equals(other.EnumKvp))
			return false;
		if (EnumName == null) {
			if (other.EnumName != null)
				return false;
		} else if (!EnumName.equals(other.EnumName))
			return false;
		if (ItemDeft == null) {
			if (other.ItemDeft != null)
				return false;
		} else if (!ItemDeft.equals(other.ItemDeft))
			return false;
		if (ItemDesc == null) {
			if (other.ItemDesc != null)
				return false;
		} else if (!ItemDesc.equals(other.ItemDesc))
			return false;
		if (ItemName == null) {
			if (other.ItemName != null)
				return false;
		} else if (!ItemName.equals(other.ItemName))
			return false;
		if (ItemType == null) {
			if (other.ItemType != null)
				return false;
		} else if (!ItemType.equals(other.ItemType))
			return false;
		if (NodeType == null) {
			if (other.NodeType != null)
				return false;
		} else if (!NodeType.equals(other.NodeType))
			return false;
		if (RelateItemName == null) {
			if (other.RelateItemName != null)
				return false;
		} else if (!RelateItemName.equals(other.RelateItemName))
			return false;
		if (ScopeExpr == null) {
			if (other.ScopeExpr != null)
				return false;
		} else if (!ScopeExpr.equals(other.ScopeExpr))
			return false;
		if (Security == null) {
			if (other.Security != null)
				return false;
		} else if (!Security.equals(other.Security))
			return false;
		if (TypeName == null) {
			if (other.TypeName != null)
				return false;
		} else if (!TypeName.equals(other.TypeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [ItemName=" + ItemName + ", ItemDesc=" + ItemDesc + ", ItemType=" + ItemType + ", TypeName="
				+ TypeName + ", ItemDeft=" + ItemDeft + ", ElemType=" + ElemType + ", NodeType=" + NodeType
				+ ", Security=" + Security + ", EnumName=" + EnumName + ", EnumKvp=" + EnumKvp + ", RelateItemName="
				+ RelateItemName + ", ScopeExpr=" + ScopeExpr + "]";
	}
	
	

}
